package com.ibm.cucumber.stepdefs;

import com.ibm.Springboot2WebapplicationAngularjsJhipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Springboot2WebapplicationAngularjsJhipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
