/**
 * Created by skloaner on 10/22/17.
 */

public class FindTheDifference {

    public static void main(String[] args) {

        System.out.print("Difference is " + findTheDifference("abcdefg", "abcdef"));

    }

    public static char findTheDifference(String s, String t) {

        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length() && s.charAt(i++) == t.charAt(j++)) ;
        if (i < s.length())
            return s.charAt(i);
        else
            return t.charAt(j);

    }
}
