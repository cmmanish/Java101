import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by skloaner on 10/24/17.
 */

public class HarmonousSequence {

    public static void main(String[] args) {

        int[] num = {1, 3, 2, 2, 5, 2, 3, 7}; // 3, 2, 2, 2, 3
        //1,2,2,2,3,5,7
        lowestHarmonousSequence(num);
    }

    public static int lowestHarmonousSequence(int[] num) {

        if (num.length == 0) {
            return 0;
        } else if (num.length == 1) {
            return 1;
        } else {
            Arrays.sort(num);
            int n = num.length;
            int start = 0;
            int nextStart = 0;
            for (int i = 1; i < n; i++) {
                if (num[i] - num[start] == 1)
                    if (num[nextStart] < num[i])
                        nextStart = i;
                System.out.print(num[i]);
            }

        }
        return 1;
    }
}
