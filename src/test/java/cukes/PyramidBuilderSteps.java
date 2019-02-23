package cukes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cukes.PyramidBuilder;
import javafx.scene.control.TreeItemBuilder;

public class PyramidBuilderSteps {

    private PyramidBuilder pyramidBuilder;

    @Given("I want a pyramid with height {int}")
    public void i_want_a_pyramid_with_height(Integer height) {
         pyramidBuilder = new PyramidBuilder();
    }

    @Then("it should create it in the console")
    public void it_should_create_it_in_the_console(String testPyramid) {
        pyramidBuilder.build(4);

    }

}
