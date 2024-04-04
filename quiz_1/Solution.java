import java.util.Arrays;

class Solution {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = new int[]{5, 0, 1, 2, 3, 4};
        int[] answer = buildArray(input);

        System.out.println(String.format("Input: %s", Arrays.toString(input)));
        System.out.println(String.format("Answer: %s", Arrays.toString(answer)));
    }
}
