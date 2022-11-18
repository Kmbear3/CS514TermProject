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
   
}
