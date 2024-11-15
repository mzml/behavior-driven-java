package io.mzml.cukes;

import io.cucumber.java.en.Then;
import io.mzml.cukes.StringHelper;

import static org.assertj.core.api.Assertions.assertThat;

public class StringHelperSteps {

    private final StringHelper stringHelper = new StringHelper();

    @Then("the {string} should have the A removed from either positions and result in {string}")
    public void theInputShouldHaveTheARemovedFromEitherPositionsAndResultInOutput(String input, String output) {
        String textInput = stringHelper.truncateAInFirst2Positions(input);
        assertThat(textInput).isEqualTo(output);
    }
}
