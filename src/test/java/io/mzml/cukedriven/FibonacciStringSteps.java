package io.mzml.cukedriven;

import io.cucumber.java.en.Then;

import static org.testng.Assert.assertEquals;

public class FibonacciStringSteps {

    @Then("the {int} fibonacci returns {string}")
    public void theNthFibonacciReturnsString(int nth, String expectedString) {

        assertEquals(FibonacciString.solve(nth), expectedString);

    }
}
