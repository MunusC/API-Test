Betway Assessment Task :

Requirements in Scope 

For the given API endpoint verify the following scenarios .

1.  Verify the HTTP status is 200
2.  Count the total number of currencies returned within the response
3.  Verify the currency ‘GBP’ is shown within the response

**Prerequisites :** 

1.  JDK 8 should be available in the system and JAVA_HOME should point to  JDK folder
 e.g. - > setx -m JAVA_HOME "C:\Progra~1\Java\jdk1.8.0_XX"
2.   Follow the steps below to configure maven:

- Visit [Maven official website](https://maven.apache.org/download.cgi) and download the Maven zip file, e.g. apache-   maven-3.6.0-bin.zip
- Unzip it to a folder. e.g. c:\opt\apache-maven-3.6.0
- Add MAVEN_HOME system variable, and point it to the Maven folder.
- Add %MAVEN_HOME%\bin To PATH variable
- verify maven installation using "mvn –version" in the command prompt 
3.   Ensure chrome browser is installed and the version is 97.0.4692.99 .

**To Run the project :**
1.  Clone the project from GitHub to your system e.g. C:\API Test
2.  Go to Project directory in the command prompt, e.g. C:\API Test\apitest
3.  Run the command :  mvn clean test
4.  Check the reports in the %project-directory%\target\cucumber-reports\advanced-reports\extentreports folder
    e.g. C:\API Test\apitest\target\cucumber-reports\advanced-reports\extentreports
