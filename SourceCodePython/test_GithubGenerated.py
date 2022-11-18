import GithubGenerated

def test_combinationSum4():
    assert GithubGenerated.combinationSum4([1,2,3], 4) == 7

def test_superPow():
    assert GithubGenerated.superPow(2, [1,0]) == 1024

def test_getSum():
    assert GithubGenerated.getSum(1, 2) == 3

def test_twoSum():
    assert GithubGenerated.twoSum([2,7,11,15], 9) == [0,1]

def test_lengthOfLongestSubstring():
    assert GithubGenerated.lengthOfLongestSubstring("abcabcbb") == 3

def test_findMedianSortedArrays():
    assert GithubGenerated.findMedianSortedArrays([1,3], [2]) == 2.0

def test_longestPalindrome():
    assert GithubGenerated.longestPalindrome("babad") == "bab"
