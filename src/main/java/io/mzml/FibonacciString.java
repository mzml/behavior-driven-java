package io.mzml;

public class FibonacciString {

    public static String solve(int n) {

        if (n < 2) return n == 1 ? "01" : "0";

        String previousString = "0";
        String nextString = "01";
        String currentString;
        for (int i = 2; i <= n; i++) {
            currentString = nextString;
            nextString += previousString;
            previousString = currentString;
        }

        return nextString;
    }

}
