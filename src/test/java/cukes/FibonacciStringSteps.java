package cukes;

import io.cucumber.java.en.Then;
import io.mzml.FibonacciString;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciStringSteps {

    @Then("the {int}th fibonacci returns {string}")
    public void theNthFibonacciReturnsString(int nth, String expectedString) {

        Assertions.assertEquals(FibonacciString.solve(nth), expectedString);

    }
}
