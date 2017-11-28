/**
 * Created by skloaner on 10/22/17.
 */

public class DetectCapital {

    public static void main(String[] args) {

        System.out.println(detectCaptital("USA"));

    }

    public static boolean detectCaptital(String word) {

        int count = 0;
        char[] chArray = word.toCharArray();
        for (char c : chArray) {
            if (('Z' - c) > 0) {
                ++count;
            }
        }
        if (count == word.length()) {
            return true;
        } else if (count == 1 && 'Z' - word.charAt(0) > 0) {
            return true;
        } else return false;

    }
}