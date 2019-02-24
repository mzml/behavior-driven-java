package cukes;

public class Pyramid {
    public Integer height;

    public Pyramid(Integer height) {
        this.height = height;
    }

    public void printToConsole() {
        System.out.print(buildPyramid(height));
    }

    public String buildPyramid(Integer height) {
        String pyramid = "";
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                pyramid += j + " ";
            }
            pyramid += "\n";
        }

        return pyramid;
    }
}
