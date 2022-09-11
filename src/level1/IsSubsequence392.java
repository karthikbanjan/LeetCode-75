package level1;

import static inputs.Inputs.inputString;

public class IsSubsequence392 {

    public static boolean isSubsequence(String s, String t) {
        if (s.trim().length() == 0) {
            return true;
        }

        int sl = s.length(), tl = t.length();
        int si = 0, ti = 0;

        while (si < sl && ti < tl) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
            }
            ti++;
        }

        return si == sl;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence(inputString(), inputString()));
    }
}
