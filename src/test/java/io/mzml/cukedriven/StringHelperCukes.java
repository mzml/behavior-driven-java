package io.mzml.cukedriven;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StringHelperCukes {

    private StringHelper stringHelper;

    @Given("text with A in either first or second position")
    public void textWithAInEitherFirstOrSecondPosition(String textInput) {
        stringHelper = new StringHelper();
        stringHelper.setTextInput(textInput);
    }

    @Then("the A should be removed from either positions")
    public void theAShouldBeRemovedFromEitherPositions(String output) {
    }
}
