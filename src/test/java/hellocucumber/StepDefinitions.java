package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

    Scenario scenario;
    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("Step from {string} in {string} feature file")
    public void step(String scenario, String file) throws InterruptedException {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario,file);

        this.scenario.log(this.scenario.getId());
        this.scenario.log(this.scenario.getName());
        Thread.sleep(5000);
    }
}


