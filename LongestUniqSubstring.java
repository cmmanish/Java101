import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashPrintJobAttributeSet;

/**
 * Created by skloaner on 10/21/17.
 */

public class LongestUniqSubstring {

    public static void main(String[] args) {

        String str = "abcabdfdfdfdsfdsfdsfdsfdsbcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {

        int n = str.length();
        int ans = 0;
        if (n == 0) return ans;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (unique(str, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    private static boolean unique(String str, int start, int end) {

        Set set = new HashSet();

        for (int i = start; i < end; i++) {
            if (set.contains(str.charAt(i)))
                return false;
            else
                set.add(str.charAt(i));
        }
        return true;
    }
}