package io.mzml.mockito;

public class StringHelper {
    private String textInput;

    public String truncateAInFirst2Positions(String textInput) {
        String output = textInput.replace("A", "");

        return output;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    public String getTextInput() {
        return textInput;
    }
}
