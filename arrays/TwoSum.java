package arrays;

// https://leetcode.com/problems/two-sum/description/
/*
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 4};
        int target = 11;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return ans;
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) { //{2, 7, 11, 4}  //target = 9
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  //9-2 =7   //9-7 =2
            if (map.containsKey(complement)) {  //7 -> F  ;;;; ////2---> T
                return new int[]{map.get(complement), i};  //0,1
            }
            map.put(nums[i], i);  //2,0
        }
        return new int[]{};
    }

}
