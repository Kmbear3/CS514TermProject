from typing import List


# 1. (377) Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
def combinationSum4(nums: List[int], target: int) -> int:
    dp = [0] * (target + 1)
    dp[0] = 1
    for i in range(1, target + 1):
        for num in nums:
            if i >= num:
                dp[i] += dp[i - num]
    return dp[target]

#3. (372) Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.   
def superPow(a: int, b: List[int]) -> int:
    if not b:
        return 1
    last = b.pop()
    return pow(self.superPow(a, b), 10, 1337) * pow(a, last, 1337) % 1337

# 4. (371) Given two integers a and b, return the sum of the two integers without using the operators + and -.
def getSum(a: int, b: int) -> int:
    mask = 0xffffffff
    while b & mask:
        carry = (a & b) << 1
        a = a ^ b
        b = carry
    return (a & mask) if b > mask else a

# 5. (1) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
def twoSum(nums: List[int], target: int) -> List[int]:
    seen = {}
    for i, num in enumerate(nums):
        if target - num in seen:
            return [seen[target - num], i]
        seen[num] = i

# 7. (3) Given a string s, find the length of the longest substring without repeating characters.
def lengthOfLongestSubstring(s: str) -> int:
    seen = {}
    longest = start = 0
    for i, char in enumerate(s):
        if char in seen and start <= seen[char]:
            start = seen[char] + 1
        else:
            longest = max(longest, i - start + 1)
        seen[char] = i
    return longest

# 8. (4) Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
def findMedianSortedArrays(nums1: List[int], nums2: List[int]) -> float:      
    nums1.extend(nums2)
    nums1.sort()
    if len(nums1) % 2 == 0:
        return (nums1[len(nums1)//2] + nums1[len(nums1)//2 - 1])/2
    else:
        return nums1[len(nums1)//2]

# 9. (5) Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
def longestPalindrome(s: str) -> str:
    if len(s) < 2 or s == s[::-1]:
        return s
    start = end = 0
    for i in range(len(s)):
        len1 = expand(s, i, i)
        len2 = expand(s, i, i + 1)
        length = max(len1, len2)
        if length > end - start:
            start = i - (length - 1) // 2
            end = i + length // 2
    return s[start:end + 1]

