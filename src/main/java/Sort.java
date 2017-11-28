import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.print.attribute.HashPrintJobAttributeSet;

/**
 * Created by skloaner on 10/22/17.
 */

public class Sort {

    public static void main(String[] arg) {

        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};
        findDisappearedNumbers(nums);
//        int array[] = {1, 2, 3, 4, 5, 1, 4, 4, 4, 6, 7, 8};
//        BubbleSort(array);
    }

    public static int[] BubbleSort(int a[]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        return a;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();

        int[] sNums = BubbleSort(nums);


        return list;
    }
}
