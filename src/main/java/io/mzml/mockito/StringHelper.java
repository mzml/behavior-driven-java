package io.mzml.mockito;

class StringHelper {
    private String textInput;

    String truncateAInFirst2Positions(String textInput) {
        return textInput.substring(0, 2).replace("A", "").concat(textInput.substring(2));
    }

    void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    String getTextInput() {
        return textInput;
    }
}
