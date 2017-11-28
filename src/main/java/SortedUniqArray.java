import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by skloaner on 10/22/17.
 */

public class SortedUniqArray {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 1, 4, 4, 4, 6, 7, 8};

        int[] sortA = sortUnique(array);
        for (int i = 0; i < sortA.length; i++)
            System.out.print(sortA[i] + " ");

    }

    public static int[] sortUnique(int[] array) {

        int[] sortedArray = uniqArray(array);
        int n = sortedArray.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static int[] uniqArray(int[] array) {

        int[] retArray = {};
        Map map = new HashMap();
        List aList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                int c = (int) map.get(array[i]);
                map.put(array[i], ++c);
            }
        }

        Iterator<Map.Entry> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int key = (int) it.next().getKey();
            aList.add(key);
        }

        retArray = new int[aList.size()];
        for (int i = 0; i < aList.size(); i++) {
            retArray[i] = (int) aList.get(i);
        }
        return retArray;
    }
}