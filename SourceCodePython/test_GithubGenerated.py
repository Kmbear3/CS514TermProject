import GithubGenerated

# 1. (377) Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
def test_combinationSum4():
    assert GithubGenerated.combinationSum4([1,2,3], 4) == 7

#2. (373) You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k. Define a pair (u, v) which consists of one element from the first array and one element from the second array. Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
def test_kSmallestPairs():
    assert GithubGenerated.kSmallestPairs([1,7,11], [2,4,6], 3) == [[1,2],[1,4],[1,6]]

#3. (372) Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.   
def test_superPow():
    assert GithubGenerated.superPow(2, [1,0]) == 1024

# 4. (371) Given two integers a and b, return the sum of the two integers without using the operators + and -.
def test_getSum():
    assert GithubGenerated.getSum(1, 2) == 3

# 5. (1) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
def test_twoSum():
    assert GithubGenerated.twoSum([2,7,11,15], 9) == [0,1]

# 7. (3) Given a string s, find the length of the longest substring without repeating characters.
def test_lengthOfLongestSubstring():
    assert GithubGenerated.lengthOfLongestSubstring("abcabcbb") == 3

# 8. (4) Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
def test_findMedianSortedArrays():
    assert GithubGenerated.findMedianSortedArrays([1,3], [2]) == 2.0

# 9. (5) Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
def test_longestPalindrome():
    assert GithubGenerated.longestPalindrome("babad") == "bab"

#10. (9) Given an integer x, return true if x is a palindrome, and false otherwise.
def test_isPalindrome():
    assert GithubGenerated.isPalindrome(121) == True

#11 (10) Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where: '.' Matches any single character.​​​​ '*' Matches zero or more of the preceding element. The matching should cover the entire input string (not partial).
def test_isMatch():
    assert GithubGenerated.isMatch("aa", "a") == False
    assert GithubGenerated.isMatch("aa", "a*") == True
    assert GithubGenerated.isMatch("ab", ".*") == True
    assert GithubGenerated.isMatch("aab", "c*a*b") == True

# 12 (16) Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
def test_threeSumClosest():
    assert GithubGenerated.threeSumClosest([-1,2,1,-4], 1) == 2

# 13 (17) Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
def test_letterCombinations():
    assert GithubGenerated.letterCombinations("23") == ["ad","ae","af","bd","be","bf","cd","ce","cf"]


# 14 (19)Given the head of a linked list, remove the nth node from the end of the list and return its head.
def test_removeNthFromEnd():
    assert GithubGenerated.removeNthFromEnd([1,2,3,4,5], 2) == [1,2,3,5]

# 15 (20) Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
def test_isValid():
    assert GithubGenerated.isValid("()") == True
    assert GithubGenerated.isValid("()[]{}") == True
    assert GithubGenerated.isValid("(]") == False
    assert GithubGenerated.isValid("([)]") == False
    assert GithubGenerated.isValid("{[]}") == True

# 16. (21) You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
def test_mergeTwoLists():
    assert GithubGenerated.mergeTwoLists([1,2,4], [1,3,4]) == [1,1,2,3,4,4]

# 17. (23) You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.
def test_mergeKLists():
    assert GithubGenerated.mergeKLists([[1,4,5],[1,3,4],[2,6]]) == [1,1,2,3,4,4,5,6]

# 18. (24) Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
def test_swapPairs():
    assert GithubGenerated.swapPairs([1,2,3,4]) == [2,1,4,3]

# 19. (25) Given a linked list, reverse the nodes of a linked list k at a time and return its modified list. k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
def test_reverseKGroup():
    assert GithubGenerated.reverseKGroup([1,2,3,4,5], 2) == [2,1,4,3,5]
    assert GithubGenerated.reverseKGroup([1,2,3,4,5], 3) == [3,2,1,4,5]
    assert GithubGenerated.reverseKGroup([1,2,3,4,5], 1) == [1,2,3,4,5]
    assert GithubGenerated.reverseKGroup([1], 1) == [1]

# 20. (28) Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
def test_strStr():
    assert GithubGenerated.strStr("hello", "ll") == 2
    assert GithubGenerated.strStr("aaaaa", "bba") == -1
    assert GithubGenerated.strStr("", "") == 0

# 21.(30)You are given a string s and an array of strings words. All the strings of words are of the same length. A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
def test_findSubstring():
    assert GithubGenerated.findSubstring("barfoothefoobarman", ["foo","bar"]) == [0,9]
    assert GithubGenerated.findSubstring("wordgoodgoodgoodbestword", ["word","good","best","word"]) == []
    assert GithubGenerated.findSubstring("barfoofoobarthefoobarman", ["bar","foo","the"]) == [6,9,12]

# 22. (31)A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
def test_nextPermutation():
    assert GithubGenerated.nextPermutation([1,2,3]) == [1,3,2]
    assert GithubGenerated.nextPermutation([3,2,1]) == [1,2,3]
    assert GithubGenerated.nextPermutation([1,1,5]) == [1,5,1]
    assert GithubGenerated.nextPermutation([1]) == [1]

# 23. (32) Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
def test_longestValidParentheses():
    assert GithubGenerated.longestValidParentheses("(()") == 2
    assert GithubGenerated.longestValidParentheses(")()())") == 4
    assert GithubGenerated.longestValidParentheses("") == 0

# 24. (33)There is an integer array nums sorted in ascending order (with distinct values).
def test_search():
    assert GithubGenerated.search([4,5,6,7,0,1,2], 0) == 4
    assert GithubGenerated.search([4,5,6,7,0,1,2], 3) == -1
    assert GithubGenerated.search([1], 0) == -1

# 25. (34)Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
def test_searchRange():
    assert GithubGenerated.searchRange([5,7,7,8,8,10], 8) == [3,4]
    assert GithubGenerated.searchRange([5,7,7,8,8,10], 6) == [-1,-1]
    assert GithubGenerated.searchRange([], 0) == [-1,-1]

# 26. (35)Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.   
def test_searchInsert():
    assert GithubGenerated.searchInsert([1,3,5,6], 5) == 2
    assert GithubGenerated.searchInsert([1,3,5,6], 2) == 1
    assert GithubGenerated.searchInsert([1,3,5,6], 7) == 4
    assert GithubGenerated.searchInsert([1,3,5,6], 0) == 0
    assert GithubGenerated.searchInsert([1], 0) == 0

# 27. (39) Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order. The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different. The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
def test_combinationSum():
    assert GithubGenerated.combinationSum([2,3,6,7], 7) == [[2,2,3],[7]]
    assert GithubGenerated.combinationSum([2,3,5], 8) == [[2,2,2,2],[2,3,3],[3,5]]
    assert GithubGenerated.combinationSum([2], 1) == []
    assert GithubGenerated.combinationSum([1], 1) == [[1]]
    assert GithubGenerated.combinationSum([1], 2) == [[1,1]]

# 28. (40)Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target. Each number in candidates may only be used once in the combination. Note: The solution set must not contain duplicate combinations.
def test_combinationSum2():
    assert GithubGenerated.combinationSum2([10,1,2,7,6,1,5], 8) == [[1,1,6],[1,2,5],[1,7],[2,6]]
    assert GithubGenerated.combinationSum2([2,5,2,1,2], 5) == [[1,2,2],[5]]

# 29. (41)Given an unsorted integer array, find the smallest missing positive integer.
def test_firstMissingPositive():
    assert GithubGenerated.firstMissingPositive([1,2,0]) == 3
    assert GithubGenerated.firstMissingPositive([3,4,-1,1]) == 2
    assert GithubGenerated.firstMissingPositive([7,8,9,11,12]) == 1

# 30. (43) Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
def test_multiply():
    assert GithubGenerated.multiply("2", "3") == "6"
    assert GithubGenerated.multiply("123", "456") == "56088"
    assert GithubGenerated.multiply("0", "0") == "0"
    assert GithubGenerated.multiply("0", "1") == "0"
    assert GithubGenerated.multiply("1", "0") == "0"
    assert GithubGenerated.multiply("1", "1") == "1"
    assert GithubGenerated.multiply("9", "9") == "81"
