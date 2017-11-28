/**
 * Created by skloaner on 10/20/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    private static boolean isAnagram(String a, String b) {

        Map map = new HashMap();
        Map map2 = new HashMap();
        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();

        for (int i = 0; i < chA.length; i++) {
            if (map.get(chA[i]) == null) {
                map.put(chA[i], 1);
            } else {
                int val = (int) map.get(chA[i]);
                map.put(chA[i], val + 1);
            }
        }

        for (int i = 0; i < chB.length; i++) {
            if (map2.get(chB[i]) == null) {
                map2.put(chB[i], 1);
            } else {
                int val = (int) map2.get(chB[i]);
                map2.put(chB[i], val + 1);
            }
        }
        String aa = Arrays.toString(map.entrySet().toArray());
        String bb = Arrays.toString(map2.entrySet().toArray());
        return aa.equalsIgnoreCase(bb);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "margana"));
    }
}