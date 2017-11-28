import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by skloaner on 10/21/17.
 */

public class RepeatedCharacter {

    public static void main(String[] args) {

        RepeatedCharacter repeatedCharacter = new RepeatedCharacter();

        String str = "sdbaaavbbbbbbbbfghjaaa";
        System.out.println(repeatedCharacter.isRepeated(str));
        System.out.println(repeatedCharacter.mostRepeatedCharcter(str));

    }

    public char mostRepeatedCharcter(String str) {

        Map map = new HashMap();
        char rep = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                int c = (int) map.get(ch);
                map.put(ch, ++c);
            }
        }
        int max = 0;

        Iterator<Map.Entry> it = map.entrySet().iterator();
        while (it.hasNext()) {
            char key = (char) it.next().getKey();
            int count = (int) map.get(key);
            if (count > max) {
                max = count;
                rep = key;
            }
        }
        System.out.println(rep + " : " + max);
        return rep;
    }

    public boolean isRepeated(String str) {

        Map map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                int count = (int) map.get(ch);
                map.put(ch, ++count);
            }
        }

        Iterator<Map.Entry> i = map.entrySet().iterator();
        while (i.hasNext()) {
            char key = (char) i.next().getKey();
            int count = (int) map.get(key);
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}