package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        Arrays.stream(findSum(new int[]{2,5,5,11}, 10)).forEach(a -> System.out.println(a));
    }

    public static int[] findSum(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result,0);
        int[] n=  new int[nums.length];//Arrays.copyOf(nums,nums.length);
        for(int o=0;o<nums.length;o++)
        {
            n[o]= nums[o];
        }

        List<Integer> temp = new ArrayList<>();
        Arrays.sort(n);
        int i = 0, k = n.length - 1, sum;
        while (i < k) {
            sum = n[i] + n[k];
            if (sum == target) {
                temp.add(n[i]);
                temp.add(n[k]);
                break;
            } else if (sum > target) {
                k--;
            } else if (sum < target) {
                i++;
            }
        }

        for (int h = 0; h < nums.length; h++) {
            if (nums[h] == temp.get(0) && result[0] ==0)
                result[0] = h;
            else if (nums[h] == temp.get(1) && result[1]==0)
                result[1] = h;
        }

        return result;
    }
}
