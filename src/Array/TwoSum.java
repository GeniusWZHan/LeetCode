package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4};
        int target = 6;
        Solution s = new Solution();
//        int[] result = s.twoSum(arr, target);
        int[] acResult = s.ACTwoSum(arr, target);
        if (acResult == null) {
            System.out.println("null");
        }
        for (int i : acResult) {
            System.out.print(i + " ");
        }
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            if (nums == null || nums.length < 2) {
                System.out.println("nums is not match");
                return new int[2];
            }
            int[] result = new int[2];
            for (int i = 0; i <= nums.length - 2; i++) {
                for (int j = i + 1; j <= nums.length - 1; j++) {
                    if (nums[j] == (target - nums[i])) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
            return null;
        }

        public int[] ACTwoSum(int[] arr, int target) {
            if (arr == null || arr.length < 2) {
                System.out.println("test");
                return null;
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i <= arr.length - 1; i++) {
                if (map.containsKey(target - arr[i])) {
                    return new int[]{map.get(target - arr[i]), i};
                }
                map.put(arr[i], i);
            }
            return null;
        }
    }
}
