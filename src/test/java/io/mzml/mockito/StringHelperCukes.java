package io.mzml.mockito;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class StringHelperCukes {

    private StringHelper stringHelper;

    @Given("text with A in either first or second position")
    public void textWithAInEitherFirstOrSecondPosition(String textInput) {
        stringHelper = new StringHelper();
        stringHelper.setTextInput(textInput);
    }

    @Then("the A should be removed from either positions")
    public void theAShouldBeRemovedFromEitherPositions(String output) {
        assertThat(output).isEqualTo(stringHelper.truncateAInFirst2Positions(stringHelper.getTextInput()));
    }
}
