/**
 * Created by skloaner on 10/23/17.
 */

public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
    }

    public static void moveZeros(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}