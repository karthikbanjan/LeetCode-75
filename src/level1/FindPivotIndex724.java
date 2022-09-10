package level1;

import static inputs.Inputs.inputIntArray;

public class FindPivotIndex724 {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int lSum = 0, rSum = 0;

        for (int i: nums) rSum += i;

        for (int i = 0; i < n; i++) {
            rSum -= nums[i];
            if (lSum == rSum) return i;
            lSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(inputIntArray()));
    }

}
