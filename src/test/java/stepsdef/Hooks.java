package stepsdef;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

import io.cucumber.java.Before;
import utils.PropertyReader;

// Hooks class is created to initialise the url/path details from config file 

public class Hooks {

	static String url = PropertyReader.getInstance().getProperty("baseURI");
	static String path = PropertyReader.getInstance().getProperty("basePATH");

	@Before()
	public static void initLocal() {

		baseURI = url;
		basePath = path;
	}

}