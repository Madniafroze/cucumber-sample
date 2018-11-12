package configuration;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="myfile",glue= {"stepdefn"},
plugin= {"html:target/cucumber-html-report","json:target/cucumber-html-report/Cucumber.json","junit:target/cucumber-html-report/Cucumber.xml"})
public class Congifclass {

}
