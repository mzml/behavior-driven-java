package io.mzml;

public class StringHelper {
    public String textInput;

    public String truncateAInFirst2Positions(String textInput) {
        return textInput.substring(0, 2).replace("A", "").concat(textInput.substring(2));
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    String getTextInput() {
        return textInput;
    }
}
