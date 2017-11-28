/**
 * Created by skloaner on 10/23/17.
 */

public class LongestContinousSequence {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 4, 9};
        System.out.println(longestContinousSequence(num));
    }

    public static int longestContinousSequence(int[] num) {

        int length = 0;
        int temp = 1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i + 1] > num[i]) {
                temp++;
                length = Math.max(length, temp);
            }
            else if (num[i + 1] > num[i]) {
                temp = 1;
            }
        }
        return Math.max(length, 1);
    }
}