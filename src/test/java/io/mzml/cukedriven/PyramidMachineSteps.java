package io.mzml.cukedriven;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertEquals;

public class PyramidMachineSteps {

    private PyramidMachine pyramid;

    @Given("I want a pyramid with height {int}")
    public void i_want_a_pyramid_with_height(Integer height) {
        pyramid = new PyramidMachine(height);
    }

    @Then("it should create it in the console")
    public void it_should_create_it_in_the_console(String testPyramid) {
        assertEquals(testPyramid, pyramid.buildPyramid());
    }

}
