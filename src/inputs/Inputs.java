package inputs;

import java.util.Scanner;

public class Inputs {

    static Scanner sc = new Scanner(System.in);

    public static int[] inputIntArray() {
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        return nums;
    }

    public static String inputString() {
        return sc.next();
    }

}
