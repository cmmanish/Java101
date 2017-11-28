import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by skloaner on 10/22/17.
 */

public class SortedSubstring {

    public static void main(String[] args) {

        subString("welcometojava", 3);
    }

    public static void subString(String str, int c) {
        ArrayList<String> list = new ArrayList();
        System.out.print("Unsorted:");
        for (int i = 0; i < str.length() - c + 1; i++) {
            list.add(str.substring(i, i + c));
            System.out.print(list.get(i) + " ");
        }
        String[] strArray = list.toArray(new String[list.size()]);
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].compareTo(strArray[j]) > 0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
        System.out.println("\n" + strArray[0] + "\n" + strArray[strArray.length - 1]);
        System.out.print("\nSorted: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }
}
