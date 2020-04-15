package com.example.bit.wonders.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		          plugin   = {"pretty" ,"json:src/target/cucumber-report.json",
		        		                "html:src/target/report.html"},
                  features =  "src/test/resources/features",
                  strict   =  false)
public class CucumberTestRunner {}