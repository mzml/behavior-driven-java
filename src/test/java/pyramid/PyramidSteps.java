package pyramid;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class PyramidSteps {

    private Pyramid pyramid;

    @Given("I want a pyramid with height {int}")
    public void i_want_a_pyramid_with_height(Integer height) {
        pyramid = new Pyramid(height);
    }

    @When("it should create it in the console")
    public void it_should_create_it_in_the_console(String testPyramid) {
        assertEquals(testPyramid, pyramid.buildPyramid());
    }

}
