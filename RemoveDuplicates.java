import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by skloaner on 10/22/17.
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 1, 4, 4, 4, 6, 7, 8};
        int[] retArr = RemoveDuplicateNumbers(array);
        for (int i = 0; i < retArr.length; i++)
            System.out.print(retArr[i] + " ");

        System.out.print("\n");
        System.out.println(RemoveDuplicateWord("Reya is is the the best player in eye eye game"));
        System.out.println(RemoveDuplicateChar("abaaabbbqwerty"));

    }

    public static int[] RemoveDuplicateNumbers(int[] array) {

        int[] retArray;
        ArrayList<Integer> aList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            int a = array[i];

            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                int c = (int) map.get(a);
                map.put(a, ++c);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            int aa = it.next().getKey();
            aList.add(aa);
        }

        retArray = new int[aList.size()];
        for (int i = 0; i < aList.size(); i++) {
            retArray[i] = aList.get(i);
        }
        return retArray;
    }

    public static String RemoveDuplicateWord(String str) {

        String[] words = str.split(" ");
        String uniqString = "";
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.get(word) == null) {
                map.put(word, 1);
                uniqString = uniqString + " " + word;
            } else {
                int c = map.get(word);
                map.put(word, ++c);
            }
        }
        return uniqString.trim();
    }

    public static String RemoveDuplicateChar(String str) {

        String uniqStr = "";
        Map map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == null) {
                map.put(ch, 1);
                uniqStr += ch;
            } else {
                int c = (int) map.get(ch);
                map.put(ch, ++c);
            }
        }
        return uniqStr;
    }
}