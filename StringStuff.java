/**
 * Created by skloaner on 10/21/17.
 */

public class StringStuff {

    public static void main(String[] args) {

        System.out.println(reverseEveryKCharFromString("abcdeffddfdg", 2));
        System.out.println(isPalindrome("babad"));
        System.out.println(longestPalindrome("babad"));
    }

    private static int lo, maxLen;

    private static String reverseEveryKCharFromString(String str, int k) {

        String rev = "";
        int n = str.length();
        for (int i = 0; i < n && i + k < n; i = i + k) {
            String s1 = str.substring(i, i + k);
            char c1 = s1.charAt(0);
            char c2 = s1.charAt(0 + k - 1);
            rev = rev + c2 + c1;
        }
        return rev;
    }

    private static boolean isPalindrome(String str) {

        String revStr = "";
        if (str.length() == 0) return false;
        else if (str.length() == 1) return true;
        else {
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr += str.charAt(i);
            }
            if (str.compareTo(revStr) == 0) {
                return true;
            }
            return false;
        }
    }

    private static String reverse(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i > 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    private static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    private static String longestPalindrome(String str) {

        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            extendPalindrome(str, i, i);
            extendPalindrome(str, i, i + 1);
        }
        return str.substring(lo, lo + maxLen);
    }
}