package RECURSION;

public class Substring {
    public static void main(String[] args) {
        String str = "abcd";
        printSubstrings(str, 0, "");
    }

    public static void printSubstrings(String str, int start, String curr) {
        if (start == str.length()) return;

        for (int i = start; i < str.length(); i++) {
            System.out.println(str.substring(start, i + 1));
            printSubstrings(str, i + 1, "");
        }
    }
}
