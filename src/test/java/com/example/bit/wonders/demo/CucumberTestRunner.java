package com.example.bit.wonders.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"json:src/target/cucumber-report.json"}, features = "src/test/resources/features")
public class CucumberTestRunner {

}
