package utils;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

// Extent report helper is created to update additional log information in the extent report

public class ReportHelper {

	public static void addStepLog(String Message) {
		ExtentCucumberAdapter.addTestStepLog(Message);
	}

}
