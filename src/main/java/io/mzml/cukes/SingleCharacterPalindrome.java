package io.mzml.cukes;

public class SingleCharacterPalindrome {


    static boolean isPalindrome(String str, int end, int start) {
        while (end < start) {
            if (str.charAt(end) != str.charAt(start))
                return false;
            end++;
            start--;
        }
        return true;
    }

    public static String solve(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                if (isPalindrome(str, start + 1, end))
                    return "remove one";
                if (isPalindrome(str, start, end - 1))
                    return "remove one";
                return "not possible";
            }
        }

        return "OK";
    }
}
