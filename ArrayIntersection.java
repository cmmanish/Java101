import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by skloaner on 10/23/17.
 */

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 2, 1};
        int[] a2 = {2, 2};
        int[] ret = intersectionviaSet(a1, a2);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
    }

    public static int[] intersectionViaArray(int[] num1, int[] num2) {

        Arrays.sort(num1);
        Arrays.sort(num2);
        Set<Integer> intersection = new HashSet<>();
        int i = 0, j = 0;
        while (i < num1.length && j < num2.length) {

            if (num1[i] < num2[j]) {
                i++;
            } else if ((num1[j] < num2[i])) {
                j++;
            } else {
                i++;
                j++;
                intersection.add(num1[i]);
            }
        }

        int[] result = new int[num2.length];
        return result;

    }

    public static int[] intersectionviaSet(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;
        Set<Integer> set1 = new HashSet();
        Set<Integer> intersect = new HashSet();

        for (int i = 0; i < n1; i++) {
            set1.add(arr1[i]);
        }

        for (int j = 0; j < n2; j++) {
            if (set1.contains(arr2[j])) {
                intersect.add(arr2[j]);
            }
        }
        int[] result = new int[intersect.size()];

        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}