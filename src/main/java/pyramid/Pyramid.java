package pyramid;

public class Pyramid {
    private Integer height;
    private String pyramid = "";

    public Pyramid(Integer height) {
        this.height = height;
    }

    public void printToConsole() {
        System.out.print(buildPyramid());
    }

    public String buildPyramid() {
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                if (i == j) {
                    pyramid += j + "\n";

                } else {
                    pyramid += j + " ";
                }
            }
        }
        return pyramid;
    }
}
