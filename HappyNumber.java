/**
 * Created by skloaner on 10/24/17.
 */

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(happyNumber(100));

    }

    public static boolean happyNumber(int num) {

        boolean flag = false;
        int n = String.valueOf(num).length();
        while (num > 1) {
            int b = num % 10;
            int a = num / 10;
            num = (int) (Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println(num);

            if (num == 1) return true;
            happyNumber(num);
        }
        return flag;
    }
}