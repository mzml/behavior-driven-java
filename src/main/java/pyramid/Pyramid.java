package pyramid;

public class Pyramid {
    private Integer height;
    private String pyramid = "";

    public Pyramid(Integer height) {
        this.height = height;
    }

    public void drawToConsole() {
        System.out.print(buildPyramid());
    }

    public String buildPyramid() {
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                pyramid += (i == j) ? (j + "\n") : (j + " ");
            }
        }
        for (int i = height; i > 0; --i) {
            for (int j = 1; j <= i; j++) {
                pyramid += (j == i) ? (j + "\n") : (j + " ");
            }
        }
        return pyramid;
    }
}
