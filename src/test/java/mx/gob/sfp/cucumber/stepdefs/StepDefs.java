package mx.gob.sfp.cucumber.stepdefs;

import mx.gob.sfp.CompranetApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CompranetApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
