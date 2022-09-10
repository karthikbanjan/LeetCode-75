package level1;

import java.util.HashMap;

import static inputs.Inputs.inputString;

public class IsomorphicStrings205 {

    public static boolean isIsomorphic(String s, String t) {
        int l = s.length();
        HashMap<Character, Character> match = new HashMap<>();

        for (int i = 0; i < l; i++) {
            char sc = s.charAt(i), tc = t.charAt(i);

            if (match.containsKey(sc) && match.get(sc) != tc) {
                return false;
            }

            if (match.containsValue(tc) && !match.containsKey(sc)) {
                return false;
            }

            match.putIfAbsent(sc, tc);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic(inputString(), inputString()));
    }

}
