package sourcecode;
import java.util.*;
import java.lang.*;

public class GithubGenerated {
    //1. (377) Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    } 

    // 3. (372) Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.
    public int superPow(int a, int[] b) {
        int res = 1;
        for (int i = 0; i < b.length; i++) {
            res = pow(res, 10) * pow(a, b[i]) % 1337;
        }
        return res;
    }

    private int pow(int res, int i) {
        return 0;
    }

    // 4. (371) Given two integers a and b, return the sum of the two integers without using the operators + and -.
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    //5. (1) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //7. (3) Given a string s, find the length of the longest substring without repeating characters.
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    // 8. (4) Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
    


    //main mehtod
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
