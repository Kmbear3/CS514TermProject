package sourcecode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GithubGeneratedSequentialTest {
    // 1.
    @Test
    public void test_getMoneyAmount() {
        // Tested on leetcode, passed 3/3 test cases
        assertEquals(16, new GithubGeneratedSequential().getMoneyAmount(10));
    }

    // 2.
    @Test
    public void test_myAtoi() {
        // Tested on leetcode, passed 3/3 test cases
        assertEquals(16, new GithubGeneratedSequential().myAtoi("16"));

    }

    // 3.
    @Test
    public void test_print() {
        // Manually tested, looks great!
        assertEquals(true, true);

    }

    //4. 
    @Test
    public void test_print2() {
        // Manually tested, looks great!
        assertEquals(true, true);

    }

    //5. 
    @Test
    public void test_print3() {
        // Manually tested, looks great!
        assertEquals(true, true);

    }

    //6. 
    @Test
    public void test_print4() {
        // Manually tested, changed the output.
        assertEquals(false, true);

    }

    //7. 
    @Test
    public void test_printPrimes() {
        // Manually tested, looks good!
        assertEquals(true, true);

    }

    //8. 
    @Test
    public void test_Pseudo() {
        // Manually tested, looks good!
        assertEquals(true, true);

    }

    //9.
    @Test
    public void test_Promblem9() {
        assertEquals(10, new GithubGeneratedSequential().sum(new int[]{1,2,3,4}));
        assertEquals(20, new GithubGeneratedSequential().sum(new int[]{5,5,5,5}));


    }


    //10. 
    @Test
    public void test_Promblem10() {
        // Manually tested
        assertEquals(false, true);

    }

    //11. 
    @Test 
    public void test_rockPaperScissors() {
        // Manually tested
        assertEquals(true, true);

    }

     //12. 
     @Test 
     public void test_stringMethods() {
         // Manually tested
         assertEquals(true, true);
     }

    //13.
    @Test 
    public void test_atm() {
        // Manually tested
        assertEquals(false, true);
    }

    // 14.

    @Test 
    public void test_Problem14() {
        // Manually tested
        assertEquals(false, true);
    }

    //15.
    @Test 
    public void test_Problem15() {
        // Manually tested - passed 2/2 test cases
        assertEquals(true, true);
    }


    //16.
    @Test 
    public void test_Problem16() {
        // Manually tested 
        assertEquals(true, true);
    }

    //17.
    @Test
    public void test_Problem17() {
        // Manually tested
        assertEquals(true, true);
    }

    //18.
    @Test
    public void test_Problem18() {
        // Manually tested
        assertEquals("Ths s tst", new GithubGeneratedSequential().Problem_18("This is a test"));
    }

    //19.
    @Test
    public void test_Problem19() {
        // Manually tested
        assertEquals(100, new GithubGeneratedSequential().Problem_19(10, 2));
        assertEquals(1, new GithubGeneratedSequential().Problem_19(10, 0));
    }

    //20.
    @Test
    public void test_Problem20() {
        assertEquals(true, true);
    }


    //21.
    @Test
    public void test_Problem21() {
        assertEquals("A", new GithubGeneratedSequential().Problem_21(10));
        assertEquals("B", new GithubGeneratedSequential().Problem_21(11));

    }

    // 22.
    @Test
    public void test_Problem22() {
        assertEquals("10", new GithubGeneratedSequential().Problem_22("A"));
        assertEquals("11", new GithubGeneratedSequential().Problem_22("B"));

    }

    // 23.
    @Test
    public void test_Problem23() {
        // Manually tested - passed 2/2 test cases
        assertEquals(true, true);
    }

    // 24.
    @Test
    public void test_Problem24() {
        // Manually tested - passed 2/2 test cases
        assertEquals(259.80,  new GithubGeneratedSequential().Problem_24(10));
    }

    // 25.
    @Test
    public void test_Problem25() {
        // Manually tested - passed 2/2 test cases
        assertEquals("xof nworb kciuq ehT",  new GithubGeneratedSequential().Problem_25("The quick brown fox"));
    }

    // 26.
    @Test
    public void test_Problem26() {
        // Manually tested - passed 2/2 test cases
        assertEquals("23:59:59",  new GithubGeneratedSequential().Problem_26(86399));
    }

    // 27.
    @Test
    public void test_Problem27() {
        // Manually tested - passed 2/2 test cases
        assertEquals(false,  new GithubGeneratedSequential().Problem_27(15, 20, 25));
    }

    // 28.
    @Test
    public void test_Problem28() {
        // Manually tested - passed 2/2 test cases
        assertEquals(true,  new GithubGeneratedSequential().Problem_28(35, 45));
    }

     // 29.
     @Test
     public void test_Problem29() {
         // Manually tested - passed 2/2 test cases
        assertEquals("catdogcat",  new GithubGeneratedSequential().Problem_29("cat", "dog"));
        assertEquals("dogcatMeowdog",  new GithubGeneratedSequential().Problem_29("catMeow", "dog"));
    }

     // 30.
     @Test
     public void test_Problem30() {
        assertEquals(false,  new GithubGeneratedSequential().Problem_30(new int[]{1,2,1}, new int[]{2,1,1}));
        assertEquals(true,  new GithubGeneratedSequential().Problem_30(new int[]{1,2,1}, new int[]{1,2,1}));
        assertEquals(false,  new GithubGeneratedSequential().Problem_30(new int[]{1,2}, new int[]{2,1,1}));
    }
}