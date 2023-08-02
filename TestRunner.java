package stepdef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"C:\\Users\\MANOHAR\\eclipse-workspace\\SuryaRealTimeProject\\Feature file"},
		glue     = {"stepdef"},
        plugin   = {"pretty",
                   "html:target/report/cucumber.html",
                   "json:target/report/cucumber.json"
        },
		dryRun = false,
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" },
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" },
		
	    tags= "@Smoke"

		) 
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}
		
		
		
		
		
		




