import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by skloaner on 10/24/17.
 */

public class UniqueChar {

    public static void main(String[] args) {

        System.out.println(firstUniqChar("dacca"));

    }

    public static int firstUniqChar(String str) {

        HashSet<Character> set = new HashSet<>();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.length() == 1) {
                return 0;
            }
            else if (set.contains(ch) == false) {
                set.add(ch);
                c = i;
            } else {
                break;
            }
        }
        return c - 1;
    }

}
