package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features we use provide the part of all the features files
        features = "src/test/resources/features/",
//        glue is where we find implementation for gherkin steps
//        we provide the path of package where we defined all the steps
        glue = "steps",
//        if we set it true , it will quickly scan all gherkin steps whether they are implemented or not
//        if it is set to true it stops actual execution
//        to execute script,it should be set to false
        dryRun = false,
//        It means the console output for cucumber test is having some irrelevant information
//        when we set it to glue it simply remove all the irrelevant information from the console
        monochrome = true,
//        tags will identify the scenario based on the tag we provide to the feature file
        tags = "@excel",
        plugin = {"pretty", "html:target/cucumber.html"}

)
public final class Smoke {
}
