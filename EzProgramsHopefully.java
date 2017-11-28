import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by skloaner on 10/22/17.
 */

public class EzProgramsHopefully {

    public static void main(String[] args) {

        int[] aa = {1, 2, 3, 4, 5, 1, 3, 4, 5,2};
        System.out.println(singleNumber(aa));
        System.out.println("-------------");
    //    printFizzBuzz(25);
    }

    public static int singleNumber(int[] nums) {

        int ret = 0;
        HashMap map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                int c = (int) map.get(nums[i]);
                map.put(nums[i], ++c);
            }
        }
        Iterator<Map.Entry> i = map.entrySet().iterator();

        while (i.hasNext()) {
            int key = (int) i.next().getKey();
            int val = (int) map.get(key);

            if (val == 1) {
                return key;
            }
        }
        return ret;
    }

    public static void printFizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("EzProgramsHopefully");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }
}