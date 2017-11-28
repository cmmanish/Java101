
public class MaxSeqChar {

    public static void main(String[] args) {
        String str = "abcdeeefghijjjjjlmneee";
        System.out.println("Most repeated sequentail char " + repeated(str));

    }

    public static String repeated(String str) {

        if (str.length() < 1) {
            return "";
        }

        char[] ch = str.toCharArray();
        char rep = ' ';

        int maxCount = 0;
        for (int i = 0; i < ch.length; i++) {
            int count = 0;

            for (int j = i + 1; j <= ch.length - 1; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        rep = ch[i];
                    }
                }else {
                    break;
                }
            }
        }
        return "" + rep + " : " + maxCount + " times";
    }//func
}//class
