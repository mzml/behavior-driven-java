package io.mzml.cukes;

public class PyramidMachine implements PyramidBuilder {
    private Integer height;
    private String pyramid = "";

    public PyramidMachine(Integer height) {
        this.height = height;
    }

    public String buildPyramid() {
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                pyramid += (i == j) ? (j + "\n") : (j + " ");
            }
        }
        for (int i = height - 1; i > 0; --i) {
            for (int j = 1; j <= i; j++) {
                pyramid += (j == i) ? (j + "\n") : (j + " ");
            }
        }
        pyramid = pyramid.substring(0, pyramid.length() - 1);
        return pyramid;
    }
}
