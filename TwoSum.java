/**
 * Created by skloaner on 10/20/17.
 */

public class TwoSum {

    private int[] twoSum(int[] nums, int target) {
        int[] retArray = new int[2];
        for (int i = 0; i < nums.length - 1; i++)
            if ((nums[i] + nums[i + 1]) == target) {
                retArray[0] = i;
                retArray[1] = i + 1;
                return retArray;
            }
        return retArray;
    }

    public static void main(String args[]) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum soln = new TwoSum();
        int[] retAr = soln.twoSum(nums, target);
        System.out.println(retAr[0] + ":" + retAr[1]);
    }
}
