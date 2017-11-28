/**
 * Created by skloaner on 10/21/17.
 */

public class ReverseInteger {

    public static void main(String[] args) {

        //System.out.println(palindromeInteger(12621));
               System.out.println(reverseInteger(12621));
    }

    public static boolean palindromeInteger(int num) {

        int rev_num = 0;
        while (num > 0) {
            rev_num += 10 * rev_num + num % 10;
            num = num / 10;
        }
        if (rev_num == num) {
            return true;
        }
        return false;

    }

    public static int reverseInteger(int num) {

        boolean neg = false;
        String s = String.valueOf(num);
        if (s.charAt(0) == '-') { //is a negative Number
            s = s.substring(1);
            neg = true;
        }
        num = Integer.parseInt(s);
        int rev_num = 0;
        while (num > 0) {
            rev_num += 10 * rev_num + num % 10;
            num = num / 10;
        }

        if (neg) { //is a negative Number
            String ss = '-' + String.valueOf(rev_num);
            return (Integer.parseInt(ss));
        } else {
            return rev_num;
        }
    }
}