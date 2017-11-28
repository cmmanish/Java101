import java.util.ArrayList;
import java.util.List;

/**
 * Created by skloaner on 10/22/17.
 */

public class ThreeSumZero {

    public static void main(String[] args) {

        int[] S = {1, 0, 1, 2, 1, -4};
        ArrayList<ArrayList> llist = sumZero(S);
        System.out.print(llist.toArray().toString());
    }

    public static ArrayList<ArrayList> sumZero(int[] s) {

        int n = s.length;
        ArrayList<ArrayList> llist = new ArrayList<ArrayList>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = i + 1; j < n - 1; j++) {
                int sum = s[i] + s[j] + s[j + 1];
                if (sum == 2) {
                    list.add(s[i]);
                    list.add(s[j]);
                    list.add(s[j + 1]);
                    break;
                }
            }
            llist.add(list);
        }
        return llist;
    }
}
