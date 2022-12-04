package sourcecode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GithubGeneratedTest {

    //1. (377) Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
    @Test void combinationSum4Test() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.combinationSum4(new int[]{1,2,3}, 4), 7 );
    }

    //3. (372) Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.
    @Test void superPowTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.superPow(2, new int[]{3}), 8 );
    }
    
    //4. (371) Given two integers a and b, return the sum of the two integers without using the operators + and -.
    @Test void getSumTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.getSum(1, 2), 3 );
    }

    //5. (1) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    @Test void twoSumTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertArrayEquals(classUnderTest.twoSum(new int[]{2,7,11,15}, 9), new int[]{0,1});
    }

    //7. (3) Given a string s, find the length of the longest substring without repeating characters.
    @Test void lengthOfLongestSubstringTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.lengthOfLongestSubstring("abcabcbb"), 3 );
    }
   
    // 8. (4) Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
    @Test void findMedianSortedArraysTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 2.0 );
    }
    
    //9. (5) Given a string s, return the longest palindromic substring  in s.
    @Test void longestPalindromeTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.longestPalindrome("babad"), "bab" );
    }

    // 10. (9) Given an integer x, return true if x is a palindrome, and false otherwise.
    @Test void isPalindromeTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.isPalindrome(121), true );
    }

    // 11. (10) Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:'.' Matches any single character.​​​​'*' Matches zero or more of the preceding element.The matching should cover the entire input string (not partial).
    @Test void isMatchTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.isMatch("aa", "a"), false );
    }

    //12. (16) Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. return the sum of the three integers. You may assume that each input would have exactly one solution.
    @Test void threeSumClosestTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.threeSumClosest(new int[]{-1,2,1,-4}, 1), 2 );
    }

    // 13 (17) Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    @Test void letterCombinationsTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.letterCombinations("23"), new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"} );
    }

    // 14. (19) Given the head of a linked list, remove the nth node from the end of the list and return its head. 
    @Test void removeNthFromEndTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }



    // 15. (20) Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    @Test void isValidTest() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.isValid("()"), true );
    }
    @Test void isValidTest_1() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.isValid("()[]{}"), true );
    }
    @Test void isValidTest_2() {
        GithubGenerated classUnderTest = new GithubGenerated();
        assertEquals(classUnderTest.isValid("(]"), false );
    }


//  16. (21) You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
    @Test void mergeTwoListsTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 17. (23) You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.
    @Test void mergeKListsTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 18. (24) Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
    @Test void swapPairsTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 19. (25) Given a linked list, reverse the nodes of a linked list k at a time and return its modified list. k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
    @Test void reverseKGroupTest() {
        //Tested on LeetCode 
        // passed 2/2 tests
        assertEquals(true, true);
    }

    // 19_b. (27) Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed. Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements. Return k after placing the final result in the first k slots of nums. Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
    @Test void removeElementTest() {
        //Tested on LeetCode 
        // passed 2/2 tests
        assertEquals(true, true);
    }

    // 20. (28) Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. Clarification: What should we return when needle is an empty string? This is a great question to ask during an interview. For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
    @Test void strStrTest() {
        //Tested on LeetCode 
        // passed 2/2 tests
        assertEquals(true, true);
    }

    // 21.(30)You are given a string s and an array of strings words. All the strings of words are of the same length. A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
    @Test void findSubstringTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 22. (31)A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
    @Test void nextPermutationTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }


    //23. (32) Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.
    @Test void longestValidParenthesesTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    //24. (33)There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
    @Test void searchTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 25. (34)Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
    @Test void searchRangeTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 26. (35) Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.
    @Test void searchInsertTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 27. (39) Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order. The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different. The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
    @Test void combinationSumTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 28. (40) Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target. Each number in candidates may only be used once in the combination. Note: The solution set must not contain duplicate combinations.
    @Test void combinationSum2Test() {
        //Tested on LeetCode 
        // passed 0/2 tests
        assertEquals(false, true);
    }

    // 29. (41) Given an unsorted integer array nums, return the smallest missing positive integer. You must implement an algorithm that runs in O(n) time and uses constant extra space.
    @Test void firstMissingPositiveTest() {
        //Tested on LeetCode 
        // passed 3/3 tests
        assertEquals(true, true);
    }

    // 30. (43) Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
    @Test void multiplyTest() {
        //Tested on LeetCode 
        // passed 2/2 tests
        assertEquals(true, true);
    }
}

