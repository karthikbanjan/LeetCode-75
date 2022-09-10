package level1;

import java.util.Arrays;

import static inputs.Inputs.inputIntArray;

public class RunningSum1dArray1480 {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(inputIntArray())));
    }
}
