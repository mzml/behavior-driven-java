package io.mzml.cukedriven;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciStringSteps {

    @Then("the {int}th fibonacci returns {string}")
    public void theNthFibonacciReturnsString(int nth, String expectedString) {

        assertEquals(FibonacciString.solve(nth), expectedString);

    }
}
