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

#2. (373) You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k. Define a pair (u, v) which consists of one element from the first array and one element from the second array. Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
def kSmallestPairs(nums1: List[int], nums2: List[int], k: int) -> List[List[int]]:

    if not nums1 or not nums2:
        return []
    heap = []
    for i in range(min(k, len(nums1))):
        heap.heappush(heap, (nums1[i] + nums2[0], i, 0))
    res = []
    while heap and len(res) < k:
        _, i, j = heap.heappop(heap)
        res.append([nums1[i], nums2[j]])
        if j + 1 < len(nums2):
            heap.heappush(heap, (nums1[i] + nums2[j + 1], i, j + 1))
    return res


#3. (372) Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.   
def superPow(a: int, b: List[int]) -> int:
    if not b:
        return 1
    last = b.pop()
    return pow(superPow(a, b), 10, 1337) * pow(a, last, 1337) % 1337

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

#6 (2) You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def addTwoNumbers(l1: ListNode, l2: ListNode) -> ListNode:
    dummy = ListNode(0)
    curr = dummy
    carry = 0
    while l1 or l2 or carry:
        if l1:
            carry += l1.val
            l1 = l1.next
        if l2:
            carry += l2.val
            l2 = l2.next
        curr.next = ListNode(carry % 10)
        curr = curr.next
        carry //= 10
    return dummy.next


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
def expand(s, left, right):
    while left >= 0 and right < len(s) and s[left] == s[right]:
        left -= 1
        right += 1
    return right - left - 1

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


#10. (9) Given an integer x, return true if x is a palindrome, and false otherwise.
def isPalindrome(x: int) -> bool:   
    if x < 0:
        return False
    return str(x) == str(x)[::-1]

#11 (10) Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where: '.' Matches any single character.​​​​ '*' Matches zero or more of the preceding element. The matching should cover the entire input string (not partial).

def isMatch(s: str, p: str) -> bool:    
    if not p:
        return not s
    first_match = bool(s) and p[0] in {s[0], '.'}
    if len(p) >= 2 and p[1] == '*':
        return (isMatch(s, p[2:]) or
                first_match and isMatch(s[1:], p))
    else:
        return first_match and isMatch(s[1:], p[1:])

# 12 (16) Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
def threeSumClosest(nums: List[int], target: int) -> int:
    nums.sort()
    best = sum(nums[:3])
    for i, a in enumerate(nums):
        j, k = i + 1, len(nums) - 1
        while j < k:
            s = a + nums[j] + nums[k]
            if abs(s - target) < abs(best - target):
                best = s
            if s > target:
                k -= 1
            else:
                j += 1
    return best

# 13. (17) Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

def letterCombinations(digits: str) -> List[str]:
    if not digits:
        return []
    phone = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
             '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
    def backtrack(combination, next_digits):
        if len(next_digits) == 0:
            output.append(combination)
        else:
            for letter in phone[next_digits[0]]:
                backtrack(combination + letter, next_digits[1:])
    output = []
    backtrack("", digits)
    return output

# 14 (19)Given the head of a linked list, remove the nth node from the end of the list and return its head.
# Create a listnode class
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def removeNthFromEnd(head: ListNode, n: int) -> ListNode:
    dummy = ListNode(0)
    dummy.next = head
    first = dummy
    second = dummy
    for i in range(n + 1):
        first = first.next
    while first:
        first = first.next
        second = second.next
    second.next = second.next.next
    return dummy.next

# 15. (20)Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
def isValid(s: str) -> bool:
    stack = []
    for char in s:
        if char in ['(', '{', '[']:
            stack.append(char)
        else:
            if not stack:
                return False
            current_char = stack.pop()
            if current_char == '(':
                if char != ')':
                    return False
            if current_char == '{':
                if char != '}':
                    return False
            if current_char == '[':
                if char != ']':
                    return False
    if stack:
        return False
    return True


# 16. (21) You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
def mergeTwoLists(l1: ListNode, l2: ListNode) -> ListNode:
    if not l1 or not l2:
        return l1 or l2
    if l1.val < l2.val:
        l1.next = mergeTwoLists(l1.next, l2)
        return l1
    else:
        l2.next = mergeTwoLists(l1, l2.next)
        return l2

# 17. (23) You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.
def mergeKLists(lists: List[ListNode]) -> ListNode:
    if not lists:
        return None
    if len(lists) == 1:
        return lists[0]
    mid = len(lists) // 2
    left = mergeKLists(lists[:mid])
    right = mergeKLists(lists[mid:])
    return mergeTwoLists(left, right)

# 18. (24) Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
def swapPairs(head: ListNode) -> ListNode:
    if not head or not head.next:
        return head
    first = head
    second = head.next
    first.next = swapPairs(second.next)
    second.next = first
    return second

# 19. (25) Given a linked list, reverse the nodes of a linked list k at a time and return its modified list. k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
def reverseKGroup(head: ListNode, k: int) -> ListNode:
    curr = head
    for i in range(k):
        if not curr:
            return head
        curr = curr.next
    prev, curr = None, head
    for i in range(k):
        curr.next, prev, curr = prev, curr, curr.next
    head.next = reverseKGroup(curr, k)
    return prev




# 20. (28) Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

def strStr(haystack: str, needle: str) -> int:  
    if needle in haystack:
        return haystack.index(needle)
    else:
        return -1

# 21.(30)You are given a string s and an array of strings words. All the strings of words are of the same length. A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
def findSubstring(s: str, words: List[str]) -> List[int]:
    if not s or not words:
        return []
    word_len = len(words[0])
    word_count = len(words)
    word_dict = {}
    for word in words:
        word_dict[word] = word_dict.get(word, 0) + 1
    res = []
    for i in range(len(s) - word_len * word_count + 1):
        seen = {}
        for j in range(0, word_count):
            word = s[i + j * word_len:i + j * word_len + word_len]
            if word not in word_dict:
                break
            seen[word] = seen.get(word, 0) + 1
            if seen[word] > word_dict[word]:
                break
            if j + 1 == word_count:
                res.append(i)
    return res

# 22. (31)A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
def nextPermutation(nums: List[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    i = len(nums) - 2
    while i >= 0 and nums[i] >= nums[i + 1]:
        i -= 1
    if i >= 0:
        j = len(nums) - 1
        while j >= 0 and nums[j] <= nums[i]:
            j -= 1
        nums[i], nums[j] = nums[j], nums[i]
    nums[i + 1:] = nums[i + 1:][::-1]

# 23. (32) Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
def longestValidParentheses(s: str) -> int:
    stack = [-1]
    res = 0
    for i in range(len(s)):
        if s[i] == '(':
            stack.append(i)
        else:
            stack.pop()
            if not stack:
                stack.append(i)
            else:
                res = max(res, i - stack[-1])
    return res


# 24. (33)There is an integer array nums sorted in ascending order (with distinct values).

def search(nums: List[int], target: int) -> int:
    if not nums:
        return -1
    left, right = 0, len(nums) - 1
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        if nums[mid] >= nums[left]:
            if nums[left] <= target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1
        else:
            if nums[mid] < target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1
    return -1


# 25. (34)Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.

def searchRange(nums: List[int], target: int) -> List[int]:
    def search(nums, target, lower):
        left, right = 0, len(nums) - 1
        ans = len(nums)
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] > target or (lower and nums[mid] >= target):
                right = mid - 1
                ans = mid
            else:
                left = mid + 1
        return ans

    left_idx = search(nums, target, True)
    right_idx = search(nums, target, False) - 1
    if left_idx <= right_idx and right_idx < len(nums) and nums[left_idx] == target and nums[right_idx] == target:
        return [left_idx, right_idx]
    return [-1, -1]

# 26. (35)Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
def searchInsert(nums: List[int], target: int) -> int:
    left, right = 0, len(nums) - 1
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return left

# 27. (39) Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order. The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different. The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

def combinationSum(candidates: List[int], target: int) -> List[List[int]]:
    def dfs(candidates, target, index, path, res):
        if target < 0:
            return
        if target == 0:
            res.append(path)
            return
        for i in range(index, len(candidates)):
            dfs(candidates, target - candidates[i], i, path + [candidates[i]], res)

    res = []
    dfs(candidates, target, 0, [], res)
    return res

# 28. (40)Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target. Each number in candidates may only be used once in the combination. Note: The solution set must not contain duplicate combinations.

def combinationSum2(candidates: List[int], target: int) -> List[List[int]]:
    def dfs(candidates, target, index, path, res):
        if target < 0:
            return
        if target == 0:
            res.append(path)
            return
        for i in range(index, len(candidates)):
            if i > index and candidates[i] == candidates[i - 1]:
                continue
            dfs(candidates, target - candidates[i], i + 1, path + [candidates[i]], res)

    res = []
    candidates.sort()
    dfs(candidates, target, 0, [], res)
    return res

# 29. (41)Given an unsorted integer array, find the smallest missing positive integer.
def firstMissingPositive(nums: List[int]) -> int:
    n = len(nums)
    for i in range(n):
        while 1 <= nums[i] <= n and nums[nums[i] - 1] != nums[i]:
            nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]
    for i in range(n):
        if nums[i] != i + 1:
            return i + 1
    return n + 1

# 30. (43) Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

def multiply(num1: str, num2: str) -> str:
    m, n = len(num1), len(num2)
    res = [0] * (m + n)
    for i in range(m - 1, -1, -1):
        for j in range(n - 1, -1, -1):
            mul = (ord(num1[i]) - ord('0')) * (ord(num2[j]) - ord('0'))
            p1, p2 = i + j, i + j + 1
            sum = mul + res[p2]
            res[p1] += sum // 10
            res[p2] = sum % 10
    res = ''.join(map(str, res))
    return '0' if not res.lstrip('0') else res.lstrip('0')

