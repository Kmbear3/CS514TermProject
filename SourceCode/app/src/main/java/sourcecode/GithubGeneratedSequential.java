package sourcecode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GithubGeneratedSequential {

    /** 
    1.(375)
    We are playing the Guessing Game. The game will work as follows:
    I pick a number between 1 and n.
    You guess a number.
    If you guess the right number, you win the game.
    If you guess the wrong number, then I will tell you whether the number I picked is higher or lower, and you will continue guessing.
    Every time you guess a wrong number x, you will pay x dollars. If you run out of money, you lose the game.
    Given a particular n, return the minimum amount of money you need to guarantee a win regardless of what number I pick.
    */
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int minres = Integer.MAX_VALUE;
                for (int piv = start + (len - 1) / 2; piv < start + len - 1; piv++) {
                    int res = piv + Math.max(dp[start][piv - 1], dp[piv + 1][start + len - 1]);
                    minres = Math.min(res, minres);
                }
                dp[start][start + len - 1] = minres;
            }
        }
        return dp[1][n];
    }

    /**
    2. (8)
    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
    The algorithm for myAtoi(string s) is as follows:
    Read in and ignore any leading whitespace.
    Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
    Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
    Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
    If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
    Return the integer as the final result.
    Note:
    Only the space character ' ' is considered a whitespace character.
    Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
     */
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        int sign = 1;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }
        int num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit >= 8)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return num * sign;
    }

    /**
     * 3. https://www.cs.colostate.edu/~cs160/.Spring15/assignments/P2.html
        Declare an integer variable of type byte, short, int, and long.
        Declare a floating-point variable of type float, and double.
        Declare three variables of type char.
        Declare three variables of the class String.
        Initialize the variables to the values shown below (using an initializer or assignment statement):
        byte: 32, short: 15477, int: 664422, long: 3984759871
        float: 8.112, double: 56.4444
        char: '&', 'S', '5'
        String: "Computer", "Science", "Excellent"
        NOTE: The long integer value exceeds 32-bits, and therefore requires special syntax.
        NOTE: The float value similarly requires special syntax, otherwise it will default to type double.
        Find the syntax referenced above for long and float literals on the web and use them.
        (Line 1) Print the four integer values in the following order (byte,short,int,long) separated by colons (:).
        (Line 2) Print the two floating-point values in the following order (float, double) separated by a comma (,).
        (Line 3) Print the sum of all the integer variables divided by 99999.
        (Line 4) Use Math.sqrt() to compute and print the square root of the sum of the float and double.
        NOTE: Use System.out.printf with a specified to ensure exactly 3 digits after the decimal point.
        (Line 5) Print the quotient of the byte variable divided by the float variable.
        NOTE: Use System.out.printf with a specified to ensure exactly 5 digits after the decimal point.
        (Line 6) Print the three characters, separated by equals signs (=).
        (Line 7) Subtract 3 from all three character values and print them again, separated by tildes (~).
        (Line 8) Using the three String variables and string constants, print Computer Science is Excellent!.
        NOTE: The following items require a String method call inside a print statement.
        (Line 9) Print the length of all three String variables, separated by commas.
        (Line 10) Print the third String variable in uppercase letters.
        (Line 11) Print the third through seventh characters of the first String variable.
        (Line 12) Print the index of the character 'e' in the second String variable.
        (Line 13) Print the fourth character of the first String variable.
     */
    public static void print() {
        byte b = 32;
        short s = 15477;
        int i = 664422;
        long l = 3984759871L;
        float f = 8.112F;
        double d = 56.4444;
        char c1 = '&';
        char c2 = 'S';
        char c3 = '5';
        String str1 = "Computer";
        String str2 = "Science";
        String str3 = "Excellent";
        System.out.println(b + ":" + s + ":" + i + ":" + l);
        System.out.println(f + "," + d);
        System.out.println((b + s + i + l) / 99999);
        System.out.printf("%.3f%n", Math.sqrt(f + d));
        System.out.printf("%.5f%n", b / f);
        System.out.println(c1 + "=" + c2 + "=" + c3);
        System.out.println((char) (c1 - 3) + "~" + (char) (c2 - 3) + "~" + (char) (c3 - 3));
        System.out.println(str1 + " " + str2 + " is " + str3 + "!");
        System.out.println(str1.length() + "," + str2.length() + "," + str3.length());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.substring(2, 7));
        System.out.println(str2.indexOf('e'));
        System.out.println(str1.charAt(3));
    }

    /** 4. https://www.cs.colostate.edu/~cs160/.Spring15/assignments/P3.html
        On the first line of output, print the string "Computer Science is great!".
        On the second line of output, print the string "Java Programming can be fun.".
        On the third line of output, print your last name, a comma, and your first name.
        On the fourth line of output, print your major or "Undeclared".
        On the fifth line of output, print the name of this class "CS160 Foundations in Programming".
        On the sixth line of output, print the due date of this assignment in the format shown below (for example 9/21/2001).
        On the seventh line, print a sentence that explains why you are taking this class.
        Some additional directions for the seventh line, as follows:
        Must start with a capital letter.
        Must end with a period or exclamation point.
        Must be between 50 and 70 characters total, including white space.
     */
    public static void print2() {
        System.out.println("Computer Science is great!");
        System.out.println("Java Programming can be fun.");
        System.out.println("Zhang, Yifan");
        System.out.println("Undeclared");
        System.out.println("CS160 Foundations in Programming");
        System.out.println("9/21/2015");
        System.out.println("I am taking this class because I want to learn more about programming.");
    }

    /**
     * 5. https://www.cs.colostate.edu/~cs160/.Spring15/assignments/P3.html
        Declare and initialize the following variables of type double:
        assign0, assign1, assign2
        lab0, lab1, lab2, lab3
        exam0, exam1
        assignAverage, labAverage, examAverage
        classGrade
        Instantiate a Scanner object to read from the keyboard.
        Use System.out.print to display the prompt "First assignment: ".
        Use the Scanner to read a double value from the user into assign0.
        Repeat for the second and third assignments, adjusting the prompts.
        Use System.out.print to display the prompt "First lab: ".
        Use the Scanner to read a double value from the user into lab0.
        Repeat for the second, third, and fourth labs, adjusting the prompts.
        Use System.out.print to display the prompt "First exam: ".
        Use the Scanner to read a double value from the user into exam0.
        Repeat for the second exam, adjusting the prompt.
        Compute the average assignment score and assign to assignAverage.
        Compute the average lab score and assign to labAverage.
        Compute the average exam score and assign to examAverage.
        Compute the class grade based on the following formula:
                class grade = (assignment average * 30%) + (lab average * 20%) + (exam average * 50%)
            
        Print the assignment average, as shown in the output below.
        Print the lab average, as shown in the output below.
        Print the exam average, as shown in the output below.
        Print the class grade, as shown in the output below.
        All output should have exactly 2 digits after the decimal point. (HINT: use System.out.printf)
        Do not hard code anything, we will use different input values than those shown. You should also test your program on a range of different values. Use a calculator to check your answers.

     */
    public static void print3() {
        double assign0, assign1, assign2;
        double lab0, lab1, lab2, lab3;
        double exam0, exam1;
        double assignAverage, labAverage, examAverage;
        double classGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("First assignment: ");
        assign0 = input.nextDouble();
        System.out.print("Second assignment: ");
        assign1 = input.nextDouble();
        System.out.print("Third assignment: ");
        assign2 = input.nextDouble();
        System.out.print("First lab: ");
        lab0 = input.nextDouble();
        System.out.print("Second lab: ");
        lab1 = input.nextDouble();
        System.out.print("Third lab: ");
        lab2 = input.nextDouble();
        System.out.print("Fourth lab: ");
        lab3 = input.nextDouble();
        System.out.print("First exam: ");
        exam0 = input.nextDouble();
        System.out.print("Second exam: ");
        exam1 = input.nextDouble();
        assignAverage = (assign0 + assign1 + assign2) / 3;
        labAverage = (lab0 + lab1 + lab2 + lab3) / 4;
        examAverage = (exam0 + exam1) / 2;
        classGrade = (assignAverage * 0.3) + (labAverage * 0.2) + (examAverage * 0.5);
        System.out.printf("Assignment average: %.2f%n", assignAverage);
        System.out.printf("Lab average: %.2f%n", labAverage);
        System.out.printf("Exam average: %.2f%n", examAverage);
        System.out.printf("Class grade: %.2f%n", classGrade);
    }

    /**
     * 6. https://www.cs.colostate.edu/~cs160/.Spring15/assignments/P4.html
        Instantiate a single Scanner object to read console input.
        Print the prompt shown below and ask the user for their gross salary.
        The gross salary represents dollars, which can be entered with or without decimal points.
        Print the prompt shown below and ask the user for the number of exemptions.
        The number of exemptions is an integer.
        Print the prompt shown below and ask the user for their interest income.
        The interest income represents dollars, which can be entered with or without decimal points.
        Print the prompt shown below and ask the user for their capital gains income.
        The capital gains represents dollars, which can be entered with or without decimal points.
        Perform the calculation of federal total income, as shown in the Formula section.
        Perform the calculation of the federal adjusted income, as shown in the Formula section.
        Perform the calculation of the federal total tax, as shown in the Formula section.
        Perform the calculation of the state income tax, as shown in the Formula section.
        Print out the total income, adjusted income, total tax, and state tax.
        The example below shows four lines of user input (in blue font), with prompts, followed by four lines of program output.
 
     */
    public void print4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your gross salary: ");
        double grossSalary = input.nextDouble();
        System.out.print("Enter the number of exemptions: ");
        int exemptions = input.nextInt();
        System.out.print("Enter your interest income: ");
        double interestIncome = input.nextDouble();
        System.out.print("Enter your capital gains income: ");
        double capitalGainsIncome = input.nextDouble();
        double federalTotalIncome = grossSalary + interestIncome + capitalGainsIncome - (exemptions * 1500);
        double federalAdjustedIncome = federalTotalIncome - 5000;
        double federalTotalTax = 0;
        if (federalAdjustedIncome <= 0) {
            federalTotalTax = 0;
        } else if (federalAdjustedIncome <= 10000) {
            federalTotalTax = federalAdjustedIncome * 0.1;
        } else if (federalAdjustedIncome <= 30000) {
            federalTotalTax = 1000 + (federalAdjustedIncome - 10000) * 0.2;
        } else if (federalAdjustedIncome <= 50000) {
            federalTotalTax = 5000 + (federalAdjustedIncome - 30000) * 0.3;
        } else {
            federalTotalTax = 13000 + (federalAdjustedIncome - 50000) * 0.4;
        }
        double stateIncomeTax = 0;
        if (federalTotalIncome <= 0) {
            stateIncomeTax = 0;
        } else if (federalTotalIncome <= 10000) {
            stateIncomeTax = federalTotalIncome * 0.05;
        } else if (federalTotalIncome <= 30000) {
            stateIncomeTax = 500 + (federalTotalIncome - 10000) * 0.07;
        } else if (federalTotalIncome <= 50000) {
            stateIncomeTax = 2000 + (federalTotalIncome - 30000) * 0.09;
        } else {
            stateIncomeTax = 4400 + (federalTotalIncome - 50000) * 0.099;
        }
        System.out.printf("Federal total income: %.2f%n", federalTotalIncome);
        System.out.printf("Federal adjusted income: %.2f%n", federalAdjustedIncome);
        System.out.printf("Federal total tax: %.2f%n", federalTotalTax);
        System.out.printf("State income tax: %.2f%n", stateIncomeTax);
    }

    /**
     * 7.
     * printPrimes
        Inside the method iterate over the specified (inclusive) range using a for loop.
        Call the isPrime method for each number in the range.
        If isPrime returns true for the number, print the number followed by a comma and space.
        It is expected that the last prime number will be followed by a comma and space.
        After the loop has completed, print a newline.

     */
    public void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    //isPrime
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    // /**
    //  * 8. https://www.cs.colostate.edu/~cs160/.Spring15/assignments/P7.html
    //     Inside the class, but outside any method, declare a private instance variable of type String initialized to "", with a name you choose.
    //     Declare a public void method called setString that takes a parameter of type String and stores it in your instance variable.
    //     Declare a public method called getString that takes no parameters and returns a String with the contents of your instance variable.

    //     NOTE: You can only use the String methods charAt and length, in addition to String concatenation with the '+' operator. You cannot use any other String or Character methods in your class!

    //     All of the methods below operate on the instance variable of type String stored in the Pseudo class:


    //     Declare a public method called charAt that takes an index parameter and returns the character in the stored string at the index. You can assume that the index is valid, i.e. between 0 and String.length()-1.
    //     Declare a public method called indexOf that takes a character parameter and returns the index in the stored string of the first occurrence of that character or -1 if the character is not found.
    //     Declare a public method called substring with two integer parameters start and end that returns the substring in a manner identical to the String method of the same name. You can assume that both indices are valid
    //     Declare a public method called equals that takes a String parameter and compares the contents of it with the stored string. Return true if they exactly match character for character, and false if not.
    //     Add a main method with the usual signature that instantiates the Pseudo class and tests its methods as follows (the output from Pseudo should match the output from String):

    //  */
    

    // public class Pseudo {
    //     private String str = "";
    //     public Pseudo() {
    //     }
       
    //     public void setString(String str) {
    //         this.str = str;
    //     }
    //     public String getString() {
    //         return str;
    //     }
    //     public char charAt(int index) {
    //         return str.charAt(index);
    //     }
    //     public int indexOf(char ch) {
    //         for (int i = 0; i < str.length(); i++) {
    //             if (str.charAt(i) == ch) {
    //                 return i;
    //             }
    //         }
    //         return -1;
    //     }
    //     public String substring(int start, int end) {
    //         String sub = "";
    //         for (int i = start; i < end; i++) {
    //             sub += str.charAt(i);
    //         }
    //         return sub;
    //     }
    //     public boolean equals(String str) {
    //         if (this.str.length() != str.length()) {
    //             return false;
    //         }
    //         for (int i = 0; i < this.str.length(); i++) {
    //             if (this.str.charAt(i) != str.charAt(i)) {
    //                 return false;
    //             }
    //         }
    //         return true;
    //     }
    //     public static void main(String[] args) {
    //         Pseudo p = new Pseudo();
    //         p.setString("Hello");
    //         System.out.println(p.getString());
    //         System.out.println(p.charAt(0));
    //         System.out.println(p.indexOf('e'));
    //         System.out.println(p.substring(1, 3));
    //         System.out.println(p.equals("Hello"));
    //     }
    // }

    //9. 
    /**
     * create a method that takes an array
     * initialize a variable to 0
     * iterate over the array using a for-loop or a while loop
     * add each element to the variable
     * outside the loop, return the variable
     */

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }


    /** 10.  https://www.cs.colostate.edu/~cs150/.Spring18/assignments/P2/doc/P2.html
        Part OneDeclare additional variables named cubeSideLength, cubeVolume, mass, acceleration, and force of type double.
        Prompt the user for cubeSideLength, by printing "Length of cube? " using System.out.print() directly after you prompted the user for the triangle values.
        Read the number entered by the user into the cubeSideLength variable using the Scanner method nextDouble().
        Compute the volume of the cube based on the following formula: volume = Math.pow(cubeSideLength, 3).
        The call Math.pow(), utilizes the exponential functionality that is defined in the Math class of Java.Print the volume to the console using System.out.printf(), with 5 digits after the decimal point in the given format below.

        Part TwoPrompt the user for the mass by printing "Mass? ".
        Read the number entered in the console into the mass variable.
        Prompt the user for the acceleration by printing "Acceleration? ".
        Read the number entered in the console into the acceleration variable.
        Compute the force based on the following formula: force = mass * acceleration.
        Print the force to the console using System.out.printf(), with 1 digit after the decimal point and using the format below.
        Hint: If System.out.printf("The triangle area is %.5f.\n", area); is a statement that prints the area with 5 digits after the decimal point,
        how might we print the force with 1 digit after the decimal point?
        The sample output below shows the required format of console output. Remember to include a new line after the last line of output.

    */
    // public static void main(String[] args) {
    //     Scanner scnr = new Scanner(System.in);
    //     double triangleSide1;
    //     double triangleSide2;
    //     double triangleSide3;
    //     double triangleArea;
    //     double cubeSideLength;
    //     double cubeVolume;
    //     double mass;
    //     double acceleration;
    //     double force;
    //     System.out.print("Side 1? ");
    //     triangleSide1 = scnr.nextDouble();
    //     System.out.print("Side 2? ");
    //     triangleSide2 = scnr.nextDouble();
    //     System.out.print("Side 3? ");
    //     triangleSide3 = scnr.nextDouble();
    //     triangleArea = computeArea(triangleSide1, triangleSide2, triangleSide3);
    //     System.out.printf("The triangle area is %.5f.\n", triangleArea);
    //     System.out.print("Length of cube? ");
    //     cubeSideLength = scnr.nextDouble();
    //     cubeVolume = Math.pow(cubeSideLength, 3);
    //     System.out.printf("The cube volume is %.5f.\n", cubeVolume);
    //     System.out.print("Mass? ");
    //     mass = scnr.nextDouble();
    //     System.out.print("Acceleration? ");
    //     acceleration = scnr.nextDouble();
    //     force = mass * acceleration;
    //     System.out.printf("The force is %.1f.\n", force);
    // }
    // public static double computeArea(double side1, double side2, double side3) {
    //     double s = (side1 + side2 + side3) / 2;
    //     double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    //     return area;
    // }

    /**
         * 11. https://www.cs.colostate.edu/~cs150/.Spring18/assignments/P3/doc/P3.html
    Declare two variables of type int, playerChoice to represent the player's choice and computerChoice to represent the computer's choice.
    Declare a variable of type int, seedVariable to represent the seed to the random number generator
    Initialize these three variables to zero.
    Create a Scanner object to read console input (i.e. input from the keyboard).
    Prompt the user for the seed, by printing:
    "Please enter a seed: "
    Read the seed to be provided to the random number generator, which means assign the integer entered by the user to the seed variable.
    Print a blank line then prompt the user for their object choice, by printing:
    "Which game object do you choose? "
    "For rock, enter 1."
    "For paper, enter 2."
    "For scissors, enter 3"
    "For lizard, enter 4."
    "For Spock, enter 5."
    Following the options, print a blank line and then "Your choice: " on a new line.
    Read the number entered by the user into the player variable using the Scanner method nextInt().
    Next, the program will create a random number between 1 and 5. Please use the following to do so:
    Random r = new Random();
    r.setSeed(seedVariable);
    computerChoice = r.nextInt(4) + 1;
    In order to use Java's Random class you will also need to import the Random library at the top of your project. The syntax for this is the same as when we import the Scanner library except replace the word Scanner with Random.
    Print the value of the computer's choice variable to the console after the prompt "Computer's choice: ".
    Print a blank line after printing the computer's choice.

    Part TwoNow, we need to use conditionals to decide which player wins.
    We will do so by utilizing a switch block with if statements inside each case. This is by no means the only way to determine which player wins, but by doing so, you will be able to practice writing a switch statement.
    Write a switch statement that switches on the player variable.
    Note: Remember your cases within the switch statement need to match the variable type of the player's choice variable.
    You should write your switch statement so that there are five cases (one for each choice in the game) and a default, which if reached, should print "1, 2, 3, 4, or 5 was not entered. Try playing again."
    For each case within the switch statement, you will need to write five if statements.
    One of these if statements deals with the situation where the computer generates the same integer that the player enters. If this occurs, have your program print "Computer generated same choice. Draw game."
    Two of the five if statements need to handle the situations where the player beats the computer. If this is the case, print out the appropriate statement from the options below that relates to each situation.
    The other two if statements will handle the situations where the computer beats the player. If this is the case, print out the appropriate statement from the options below that relates to each situation.
    Be sure to include a new line when printing any of the program options below.
    Here are your console output options:
    "Computer generated same choice. Draw game."
    "Rock crushes scissors. Player wins."
    "Rock crushes scissors. Computer wins."
    "Rock crushes lizard. Player wins."
    "Rock crushes lizard. Computer wins."
    "Paper covers rock. Player wins."
    "Paper covers rock. Computer wins."
    "Paper disproves Spock. Player wins."
    "Paper disproves Spock. Computer wins."
    "Scissors cuts paper. Player wins."
    "Scissors cuts paper. Computer wins."
    "Scissors decapitates lizard. Player wins."
    "Scissors decapitates lizard. Computer wins."
    "Lizard eats paper. Player wins."
    "Lizard eats paper. Computer wins."
    "Lizard poisons Spock. Player wins."
    "Lizard poisons Spock. Computer wins."
    "Spock vaporizes rock. Player wins."
    "Spock vaporizes rock. Computer wins."
    "Spock smashes scissors. Player wins."
    "Spock smashes scissors. Computer wins."
     */
    public static void rockPaperScissors() {
        int playerChoice;
        int computerChoice;
        int seedVariable;
        playerChoice = 0;
        computerChoice = 0;
        seedVariable = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter a seed: ");
        seedVariable = scnr.nextInt();
        System.out.println();
        System.out.println("Which game object do you choose? ");
        System.out.println("For rock, enter 1.");
        System.out.println("For paper, enter 2.");
        System.out.println("For scissors, enter 3");
        System.out.println("For lizard, enter 4.");
        System.out.println("For Spock, enter 5.");
        System.out.println();
        System.out.print("Your choice: ");
        playerChoice = scnr.nextInt();
        Random r = new Random();
        r.setSeed(seedVariable);
        computerChoice = r.nextInt(4) + 1;
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println();
        switch (playerChoice) {
            case 1:
                if (computerChoice == 1) {
                    System.out.println("Computer generated same choice. Draw game.");
                }
                if (computerChoice == 3) {
                    System.out.println("Rock crushes scissors. Player wins.");
                }
                if (computerChoice == 4) {
                    System.out.println("Rock crushes lizard. Player wins.");
                }
                if (computerChoice == 2) {
                    System.out.println("Paper covers rock. Computer wins.");
                }
                if (computerChoice == 5) {
                    System.out.println("Spock vaporizes rock. Computer wins.");
                }
                break;
            case 2:
                if (computerChoice == 1) {
                    System.out.println("Paper covers rock. Player wins.");
                }
                if (computerChoice == 3) {
                    System.out.println("Scissors cuts paper. Computer wins.");
                }
                if (computerChoice == 4) {
                    System.out.println("Lizard eats paper. Computer wins.");
                }
                if (computerChoice == 2) {
                    System.out.println("Computer generated same choice. Draw game.");
                }
                if (computerChoice == 5) {
                    System.out.println("Paper disproves Spock. Player wins.");
                }
                break;
            case 3:
                if (computerChoice == 1) {
                    System.out.println("Rock crushes scissors. Computer wins.");
                }
                if (computerChoice == 3) {
                    System.out.println("Computer generated same choice. Draw game.");
                }
                if (computerChoice == 4) {
                    System.out.println("Scissors decapitates lizard. Player wins.");
                }
                if (computerChoice == 2) {
                    System.out.println("Scissors cuts paper. Player wins.");
                }
                if (computerChoice == 5) {
                    System.out.println("Spock smashes scissors. Computer wins.");
                }
                break;
            case 4:
                if (computerChoice == 1) {
                    System.out.println("Rock crushes lizard. Computer wins.");
                }
                if (computerChoice == 3) {
                    System.out.println("Scissors decapitates lizard. Computer wins.");
                }
                if (computerChoice == 4) {
                    System.out.println("Computer generated same choice. Draw game.");
                }
                if (computerChoice == 2) {
                    System.out.println("Lizard eats paper. Player wins.");
                }
                if (computerChoice == 5) {
                    System.out.println("Lizard poisons Spock. Player wins.");
                }
                break;
            case 5:
                if (computerChoice == 1) {
                    System.out.println("Spock vaporizes rock. Player wins.");
                }
                if (computerChoice == 3) {
                    System.out.println("Spock smashes scissors. Player wins.");
                }
                if (computerChoice == 4) {
                    System.out.println("Lizard poisons Spock. Computer wins.");
                }
                if (computerChoice == 2) {
                    System.out.println("Paper disproves Spock. Computer wins.");
                }
                if (computerChoice == 5) {
                    System.out.println("Computer generated same choice. Draw game.");
                }
                break;
            }
        }

        /**
         * 12.  https://www.cs.colostate.edu/~cs150/.Spring18/assignments/P4/doc/P4.html
            Instantiate an object (variable) named testString of type String to "".
            Create a Scanner object to read console input.
            Prompt the user for the string literal to be assigned to testString by printing "Program String: ".
            Next, write a line of code that will assign an entire line of text to testString once the program is run.
            When you run P4, reassign testString to "Java is fun!".
            The spacing in the string literal above must match exactly.
            Using String methods, print the following lines to the console, including the line number, a colon, and followed by a space:
            First line: the String testString.
            Second line: the length of the testString.
            Third line: the index of the first 'a' in testString.
            Fourth line: the character at index 2.
            Fifth line: testString as uppercase.
            Sixth line: the substring starting at index 3 and including the rest of the testString.
            Seventh line: the substring starting at index 2 and ending at index 5 (inclusive).
            Do not hard code any of the String values to be printed to the console.

         */
        public static void stringMethods() {
            String testString = "";
            Scanner scnr = new Scanner(System.in);
            System.out.print("Program String: ");
            testString = scnr.nextLine();
            System.out.println();
            System.out.println("1: " + testString);
            System.out.println("2: " + testString.length());
            System.out.println("3: " + testString.indexOf('a'));
            System.out.println("4: " + testString.charAt(2));
            System.out.println("5: " + testString.toUpperCase());
            System.out.println("6: " + testString.substring(3));
            System.out.println("7: " + testString.substring(2, 6));
        }

        /** 13.
         * Initialize four additional variables of type double to serve the following purposes: withdrawal amount, principal, interest rate, and future investment amount. Initialize the interest rate variable to 0.025 and the rest to 0.0.
        Initialize two additional variables of type int to serve the following purposes: number of times per year the investment is compounded and number of years the investment grows. Initialize the variable related to compounding in each year to 2. The other should be initialized to 0.
        Add three additional menu prompts after option 1. After the addition, your menu prompt should match the following:
        0: Exit ATM
        1: Make a Deposit
        2: Make a Withdrawal
        3: Display Balance
        4: Calculate Compound Interest
        Please select a menu option:
        Next before the if conditional for menu option 1, insert an inner while loop that handles the situation of a user entering a value below zero OR above 4.
        Begin this while loop by printing a blank line (for better readability).
        Then print the following two statements to the console:
        That is not a valid menu option.
        Please select a menu option:
        Before the end of the inner while loop, write a statement that assigns an integer value via console input (i.e. use your Scanner object) to your variable that holds the user's menu option. This will complete the inner while loop.

        Part Two
        After the if conditionals for menu options 0 and 1, start by printing a blank line inside the if conditional for menu option 2.
        Then print the following prompt to the console:
        Enter the amount to withdraw:
        Assign the value entered to your associated variable.
        Next write an inner while loop inside the if conditional for menu option 2.
        This while loop will check to make sure the user is not trying to withdrawal more than the account balance. You may do this verification with the following in the while parentheses:
        accountBalance - withdrawalAmount < 0.0
        Inside the while loop print the following two prompts and afterward write a statement that assigns the new value to your withdrawal amount variable.
        Withdrawal amount cannot be more than account balance.
        Enter the amount to withdraw:
        After this inner while loop, update the value in your account balance variable.
        Lastly, print the new account balance to the console to two decimal places after the prompt below and including a new line, and also follow with a blank line.
        New account balance is: $
        For menu option 3, simply print the account balance to the console to two decimal places after the prompt below.
        Current account balance: $
        Additionally, the if conditional for menu option 3 should contain, in some form, three new lines. One option is to print a blank line, then a printf statement with a new line character, and then another blank line.

        Part Three
        The if conditional for menu option 4 will again begin with a blank line.
        Following this, print the following prompt:
        Enter principal investment amount:
        Assign the value entered to your associated variable.
        Next, write an inner while loop to handle the situation of a user entering a negative value. The following two prompts should be printed in this situation:
        Principal amount cannot be negative.
        Enter principal investment amount:
        After the two prompts, write another statement to assign a value entered to the principal variable.
        Outside of the previous while loop, print the following:
        Enter number of years to grow investment:
        Assign the value entered to your associated variable.
        Write another inner while loop to handle the situation of a user entering a negative value. The following two prompts should be printed in this situation:
        Growth period cannot be negative.
        Enter number of years to grow investment:
        After the two prompts, write another statement to assign a value entered to the variable associated with years of investment growth.
        Next, print a blank line to the console.
        The last part of this assignment involves calculating the future investment amount and occurs outside of the previous inner while loop. You will do so with the following equation:
        Compound Interest Formula
        You will need to base your calculation off of the names you have given your own variables. Utilizing Math.pow() is recommended for this calculation.
        Lastly, inside the if conditional for menu option 4, print a concatenated statement that matches the following:
        In 10 years your principal will grow to $1123.65
        The values above in blue are example values, but your future value for the given principal should be printed with only two values after the decimal point.
        After your printf statement, print another blank line to the console.
        And finally, as good practice, close your Scanner object at the end of your code in main.
         */
        public static void atm() {
            double accountBalance = 0.0;
            double withdrawalAmount = 0.0;
            double principal = 0.0;
            double interestRate = 0.025;
            double futureInvestmentAmount = 0.0;
            int compoundingPerYear = 2;
            int yearsOfInvestmentGrowth = 0;
            Scanner scnr = new Scanner(System.in);
            int menuOption = 0;
            while (menuOption != 0) {
                System.out.println();
                System.out.println("0: Exit ATM");
                System.out.println("1: Make a Deposit");
                System.out.println("2: Make a Withdrawal");
                System.out.println("3: Display Balance");
                System.out.println("4: Calculate Compound Interest");
                System.out.print("Please select a menu option: ");
                menuOption = scnr.nextInt();
                while (menuOption < 0 || menuOption > 4) {
                    System.out.println();
                    System.out.println("That is not a valid menu option.");
                    System.out.print("Please select a menu option: ");
                    menuOption = scnr.nextInt();
                }
                if (menuOption == 1) {
                    System.out.println();
                    System.out.print("Enter the amount to deposit: ");
                    accountBalance += scnr.nextDouble();
                }
                if (menuOption == 2) {
                    System.out.println();
                    System.out.print("Enter the amount to withdraw: ");
                    withdrawalAmount = scnr.nextDouble();
                    while (accountBalance - withdrawalAmount < 0.0) {
                        System.out.println("Withdrawal amount cannot be more than account balance.");
                        System.out.print("Enter the amount to withdraw: ");
                        withdrawalAmount = scnr.nextDouble();
                    }
                    accountBalance -= withdrawalAmount;
                    System.out.printf("New account balance is: $%.2f %n", accountBalance);
                    System.out.println();
                
                
                }
                if (menuOption == 3) {
                    System.out.println();
                    System.out.printf("Current account balance: $%.2f %n", accountBalance);
                    System.out.println();
                    System.out.println();
                }
                if (menuOption == 4) {
                    System.out.println();
                    System.out.print("Enter principal investment amount: ");
                    principal = scnr.nextDouble();
                    while (principal < 0) {
                        System.out.println("Principal amount cannot be negative.");
                        System.out.print("Enter principal investment amount: ");
                        principal = scnr.nextDouble();
                    }
                    System.out.print("Enter number of years to grow investment: ");
                    yearsOfInvestmentGrowth = scnr.nextInt();
                    while (yearsOfInvestmentGrowth < 0) {
                        System.out.println("Growth period cannot be negative.");
                        System.out.print("Enter number of years to grow investment: ");
                        yearsOfInvestmentGrowth = scnr.nextInt();
                    }
                    System.out.println();
                    futureInvestmentAmount = principal * Math.pow((1 + (interestRate / compoundingPerYear)), (compoundingPerYear * yearsOfInvestmentGrowth));
                    System.out.printf("In " + yearsOfInvestmentGrowth + " years your principal will grow to $%.2f %n", futureInvestmentAmount);
                    System.out.println();
                }

            }
            scnr.close();

        }

        /**
         * 14.
         * First, declare and initialize five Strings.
            The first String object: "The band includes a guitar and a tambourine."
            The second String object: "At 10:04pm on March 24th 2018, the world population was 7,610,650,855."
            The third String object should be initialized to the empty String and will hold the characters of the second String that are not digits.
            The fourth String object: "drawer keels"
            The fifth String object should be initialized to the empty String and will hold the characters of the fourth String in reversed order.
            You will also need one integer variable to represent a counter for the number of vowels in the first String object. Initialize to zero.

            Part Two
            Print out the following prompt including a newline character:
            Numbers (1-50) divisible by both 2 and 5: 
            Next, write a print statement that only prints the tab character.
            Now write a for loop designed to iterate 50 times.
            Inside this loop, write a conditional that is true only when a value in the range 1-50 is evenly divisible by both 2 and 5. If so, print the value to the console followed by a comma and one space. (HINT: What variable do you already have that can be reused as the testing value?)
            After the end of this for loop, print a blank line to the console.

            Part Three
            Your second for loop will count the number of lower case vowels in the first String of this project (defined above). To do this, you can write a for loop that iterates over the first String described above and write a switch block inside the for loop.
            Implement your switch block to switch on one character of the String per loop iteration. Make your cases the vowel letters (do not include y as a vowel). Do not forget about flow through if several cases perform the same function in a program. Also, it may seem odd, but your default case does not actually have to do anything; so do not get hung up trying to figure out what it is supposed to do if you implement the solution to this problem in previous cases.
            Next, write a third for loop to iterate over the second String (defined above).
            In this for loop you will gradually build a new String using your third String object currently containing only the empty string.
            This loop with utilize one of the Character wrapper class methods simultaneously with a conditional. The link to the Oracle document on the Character class, which has everything defined in this class, can be found here.
            There are two ways to implement building a new String without any of the digits currently in the second String. You can negate the first conditional statement and build the new String within the first conditional, or build the new String as your default condition. Either way works; so design your program using the way that makes the most sense to you.
            Additionally, one of your conditional cases will not actually do anything; so you may leave its braces empty or use the appropriate Java keyword related to for loops.
            Remember you will need to concatenate one character at a time to build the resulting String.

            Part Four
            The last for loop will reverse all of the characters in the fourth String object (defined above).
            To do this you will need to write a for loop that starts at the end of the String instead of at zero like we normally see with for loops. Remember the characters in a String are index based, but the length() method of the String class starts counting at one.
            Using the appropriate String method, get one character from the source String at the appropriate index and append it to your fifth String object, which should contain the empty String to start.
            Lastly, print the results of the previous three for loops using the following three prompts:
            Number of vowels in string:
            String without digits: 
            drawer keels reversed is: 
            Additionally, the results should print below the prompts and one tab from the left.
            Finally, make sure to include a newline after printing the last result.
         */
        public static void Problem14() {
            // TODO Auto-generated method stub
            String firstString = "The band includes a guitar and a tambourine.";
            String secondString = "At 10:04pm on March 24th 2018, the world population was 7,610,650,855.";
            String thirdString = "";
            String fourthString = "drawer keels";
            String fifthString = "";
            int vowelCounter = 0;
            int counter = 0;
            char currentChar;
            char currentChar2;
            char currentChar3;
            char currentChar4;
            char currentChar5;
            char currentChar6;
            char currentChar7;
            char currentChar8;
            char currentChar9;
            char currentChar10;
            char currentChar11;
            char currentChar12;
            char currentChar13;
            char currentChar14;
            char currentChar15;
            char currentChar16;
            char currentChar17;
            char currentChar18;
            char currentChar19;
            char currentChar20;
            char currentChar21;
            char currentChar22;
            char currentChar23;
            char currentChar24;
            char currentChar25;
            char currentChar26;
            char currentChar27;
            char currentChar28;
            char currentChar29;
            char currentChar30;
            char currentChar31;
            char currentChar32;
            char currentChar33;
            char currentChar34;
            char currentChar35;
            char currentChar36;
            char currentChar37;
            char currentChar38;
            char currentChar39;
            char currentChar40;
            char currentChar41;
            char currentChar42;
            char currentChar43;
            char currentChar44;
            char currentChar45;
            char currentChar46;
            char currentChar47;
            char currentChar48;
            char currentChar49;
            char currentChar50;
            char currentChar51;
            char currentChar52;
            char currentChar53;
            char currentChar54;
            char currentChar55;
            char currentChar56;
            char currentChar57;
            char currentChar58;
            char currentChar59;
            char currentChar60;
            char currentChar61;
            char currentChar62;
            char currentChar63;
            char currentChar64;
            char currentChar65;
            char currentChar66;
            char currentChar67;
            char currentChar68;
            char currentChar69;
            char currentChar70; 
            char currentChar71;
            char currentChar72;
            char currentChar73;
            char currentChar74;
            char currentChar75;
            char currentChar76;
            char currentChar77;
            char currentChar78;
            char currentChar79;
            char currentChar80;
            char currentChar81;
            char currentChar82;
            char currentChar83;
            char currentChar84;
            char currentChar85;
            char currentChar86;
            char currentChar87;
            char currentChar88;
            char currentChar89;
            char currentChar90;
        }
        /**
         * 15.
        Declare and initialize a boolean array with space to hold 52 elements - this array will play the role of determining whether or not a card has already been dealt.
        Declare and initialize an integer array with space to hold 20 elements - this array will, after program execution, be assigned 20 random integer values (0-51) that you will then use to determine which specific cards of the deck a player has.
        Next, you will need to declare and initialize three String arrays.
        The first String array will have the four possible suits in a deck of cards. Initialize this array to "S", "H", "D", "C" (in that order).
        The second String array will have the 13 possible ranks in a deck of cards. Initialize this array to "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" (in that order).
        The third String array should be initialized to hold 20 elements and each element will, after program execution, be assigned a String that represents one card of a standard deck. For example: "C6" is the six of clubs; "H3" is the three of hearts; "SQ" is the queen of spades; and "DA" would be the ace of diamonds.
        Last, declare and initialize four integer variables. One will be the seed value for the random number generator. Initialize this variable to Integer.parseInt(args[0]). The second variable will represent the card to be dealt to the player. Initialize to -1. The third will represent the card suit in integer form. Initialize to -1. And the fourth will represent the card rank in integer form. Initialize to -1.

        Part Two
        First, instantiate the Random class and set the seed of the Random class object using the following code:
        Random r = new Random();
        r.setSeed(yourSeedValueVariable); 
        NOTE: Do not forget you will need to import the Random class library at top of your P7.java file in order to be able to use methods of the Random class.
        For the first part of this program, you will write a for loop with a do-while loop inside in order to assign the player hand with 20 different integer values.
        First, write a for loop that iterates over your 20-element integer array (remember this array will have the cards in the player hand represented as integers).
        Inside this loop, insert a do-while loop with the following code inside:
        cardDealtToPlayerVariable = r.nextInt(52); 
        NOTE: The nextInt() method of the Random class "returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence".
        Your do-while loop must continue to iterate as long as the random number generated has already been dealt to the player. In this program, we are keeping track of already-dealt card values in the boolean array by changing the element at the matching index to the random number to true. So, since the nextInt() method generates a value 0-51, we can also use this as the index value to check the boolean array.

        For the boolean expression of the while, this time you will not enter an expression to be evaluated, such as 5 <= 3, but instead access the boolean array at the integer value generated inside the do-while loop. Your expression should evaluate if the element at that location is set to true. If so, the do-while loop will iterate again and generate a new integer value.
        Next, while still inside the for loop, but outside of the do-while loop, use the random integer value from the do-while loop as the index location and assign the boolean array to true.
        Then, also before exiting the for loop, use the for loop variable as the index location and assign the respective integer array element to the random value generated in the do-while loop.

        Part Three
        The next for loop will assign an appropriate card value in String form to each element of your third String array that currently has 20 null elements. This for loop should iterate over the player hand integer array.

        NOTE: When you initialize a String array to be a certain size, but do not assign each element a certain value, Java automatically assigns each element the default value of null.
        In this for loop, first assign the integer variable representing the card suit. To do so, access the integer in the player hand integer array. Then, to determine which card suit the integer value relates to, divide by 13.
        Next, assign the integer variable representing the card rank. To do so, again access the integer in the player hand integer array. Then, to determine which card rank the integer value relates to, modulo by 13.
        Lastly in the for loop, assign the 20-element String array representing the cards in a player's hand. Using the two previously calculated values as indices, access the single-character String suit and rank arrays. Generate a String value by concatenating the appropriate elements of the suit and rank arrays and assign the player hand String array a new value.

        NOTE: The new String value should be assigned to the same index location in the String array as in the player hand integer array.
        NOTE: Steps 13, 14, and 15 can be executed in one line of code if that solution is evident to you.

        Part Four
        Now it is time to print out the resulting player hand.
        First, print the following prompt on its own line:
        Player hand: 
        After this prompt, write a for loop to iterate over the String array now holding the cards in the player's hand.
        In the for loop, print the array elements to the console followed by a comma and single space. DO NOT include a comma after the last element is printed. In effect, how should you change the upper bound of your for loop?
        For grading purposes, the hand will be printed ten cards to a line. Using a conditional in the for loop, print a blank line to the console after printing the tenth element of the array. This conditional must only execute printing a blank line once, so think of the appropriate type of boolean expression to make that happen.
        Lastly, outside of the for loop you will need to write one more line of code that will allow array elements to be displayed as C6, D7, H8, ... DK, HQ instead of C6, D7, H8, ... DK, HQ, Think about what happened by altering the upper bound of the for loop above. Do not forget to include a newline character after the last card value prints.
    */
    public class P7 {
        public static void main(String[] args) {
            boolean[] dealtCards = new boolean[52];
            int[] playerHand = new int[20];
            String[] suits = {"S", "H", "D", "C"};
            String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            String[] playerHandString = new String[20];
            int seedValue = Integer.parseInt(args[0]);
            int cardDealtToPlayer = -1;
            int cardSuit = -1;
            int cardRank = -1;
            Random r = new Random();
            r.setSeed(seedValue);
            for (int i = 0; i < playerHand.length; i++) {
                do {
                    cardDealtToPlayer = r.nextInt(52);
                } while (dealtCards[cardDealtToPlayer]);
                dealtCards[cardDealtToPlayer] = true;
                playerHand[i] = cardDealtToPlayer;
            }
            for (int i = 0; i < playerHand.length; i++) {
                cardSuit = playerHand[i] / 13;
                cardRank = playerHand[i] % 13;
                playerHandString[i] = suits[cardSuit] + ranks[cardRank];
            }
            System.out.println("Player hand: ");
            for (int i = 0; i < playerHandString.length; i++) {
                System.out.print(playerHandString[i] + ", ");
                if (i == 9) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }


    /**
     * 16.
     * Create a 5 element array of doubles called grades that contains the following numbers in this order: 81.2, 92.5, 48.9, 78.8, and 45.5.
Create a 7 element array of ints called numbers that contains the following numbers in this order: 12, 42, 33, 67, 92, 58, and 33.
Create a 9 element array of Strings called arguments without using an array initializer.
Print (on one line) the length of grades using length.
Print (on one line) the length of numbers using length.
Print (on one line) the length of arguments using length.
Print (on one line) the first element of grades.
Print (on one line) the third element of grades.
Print (on one line) the last element of numbers.
Set the second to last element of grades to be 90.5.
Set the third element of numbers to be 99.
Set the first six elements of arguments to be "Java", and the rest to be "C++".
Use a loop to print each element of grades on the same line, separated by commas (with a trailing comma).
Use a loop to print each element of numbers on the same line, separated by spaces (with a trailing space).
Use a loop to print each element of arguments on the same line, separated by an underscore (with a trailing underscore).
Print the contents of grades using Arrays.toString(grades);
Print the contents of numbers using Arrays.toString(numbers);
Print the contents of arguments using Arrays.toString(arguments);
FINAL STEP: Write a public static called arrayAverage that takes an array of doubles as a parameter.
and returns the average as a double. Print the result of calling arrayAverage with the array grades. with exactly 3 digits after the decimal point.
     */

    public class P8 {
        public static void main(String[] args) {
            double[] grades = {81.2, 92.5, 48.9, 78.8, 45.5};
            int[] numbers = {12, 42, 33, 67, 92, 58, 33};
            String[] arguments = new String[9];
            System.out.println(grades.length);
            System.out.println(numbers.length);
            System.out.println(arguments.length);
            System.out.println(grades[0]);
            System.out.println(grades[2]);
            System.out.println(numbers[numbers.length - 1]);
            grades[grades.length - 2] = 90.5;
            numbers[2] = 99;
            for (int i = 0; i < 6; i++) {
                arguments[i] = "Java";
            }
            for (int i = 6; i < arguments.length; i++) {
                arguments[i] = "C++";
            }
            for (int i = 0; i < grades.length; i++) {
                System.out.print(grades[i] + ", ");
            }
            System.out.println();
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < arguments.length; i++) {
                System.out.print(arguments[i] + "_");
            }
            System.out.println();
            System.out.println(Arrays.toString(grades));
            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(arguments));
            System.out.printf("%.3f", arrayAverage(grades));
        }
        public static double arrayAverage(double[] grades) {
            double sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            return sum / grades.length;
        }
    }

    /**
     * 17.
        Declare three variables of type int called A, B, and C, which represent the quadratic equation coefficients.
        Declare two variables of type double called positiveRoot and negativeRoot, to store the roots of the quadratic equation.
        Declare and instantiate an object of type Scanner to read from the keyboard, using a name of your choice.
        Prompt the user to input the A coefficient, using System.out.print, as follows: "Enter coefficient A: ".
        Read an integer from the keyboard into the variable A.
        Prompt the user to input the B coefficient, using System.out.print, as follows: "Enter coefficient B: ".
        Read an integer from the keyboard into the variable B.
        Prompt the user to input the C coefficient, using System.out.print, as follows: "Enter coefficient C: ".
        Read an integer from the keyboard into the variable C.
        Print the quadratic equation in the format shown in the sample output below.
        Look up the quadratic formula on the web.
        Compute the positive root and store it into the variable positiveRoot.
        Compute the negative root and store it into the variable negativeRoot.
        Print the positive root, with one digit after the decimal point, as shown below.
        Print the negative root, with one digit after the decimal point, as shown below.
    */

    public static void Problem_17(){
            int A, B, C;
            double positiveRoot, negativeRoot;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter coefficient A: ");
            A = input.nextInt();
            System.out.print("Enter coefficient B: ");
            B = input.nextInt();
            System.out.print("Enter coefficient C: ");
            C = input.nextInt();
            System.out.println("The quadratic equation is: " + A + "x^2 + " + B + "x + " + C + " = 0");
            positiveRoot = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
            negativeRoot = (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
            System.out.printf("The positive root is: %.1f%n", positiveRoot);
            System.out.printf("The negative root is: %.1f%n", negativeRoot);
    }
    
    /**
     * 18.Declare a string variable for the return value, and initialize it to "".
    Use a for loop to iterate over all the characters in the supplied string.
    Use a conditional or switch statement to check whether the character is a vowel.
    The vowels are a/e/i/o/u, uppercase or lowercase.
    If it is a vowel, do nothing, otherwise add the character to the return string.
    After the loop has completed, return the string.
     */

    public static String Problem_18(String str){
        String returnString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
                returnString += str.charAt(i);
            }
        }
        return returnString;

    }

    /**
     * 19. evaluateExponent
        Declare a double variable called result and initialize it to 1.0;
        If the exponent parameter is 0, return the result immediately.
        You do not need to handle a negative exponent value.
        Otherwise declare an integer variable called loop and initialize it to 0.
        Write a do while loop, as follows:
        Inside the loop:
        Multiply the result times the number.
        Increment the loop variable.
        The terminating condition is when loop is equal to exponent.
        After the loop has completed, return the result.
        */

    public static double Problem_19(double number, int exponent){
        double result = 1.0;
        if (exponent == 0) {
            return result;
        } else {
            int loop = 0;
            do {
                result *= number;
                loop++;
            } while (loop != exponent);
            return result;
        }
    }

    /*
     * 20. computeStatistics
        Declare and initialize a Scanner to read from the keyboard.
        Declare an integer variable called value and initialize it to 0.
        Declare an integer variable called count and initialize it to 0.
        Declare a double variable called mean and initialize it to 0.0.
        Declare an integer variable called minimum and set it equal to Integer.MAX_VALUE.
        Declare an integer variable called maximum and set it equal to Integer.MIN_VALUE;
        Write a while loop that never terminates!
        Inside the loop:
        Read in an integer value from the keyboard, without prompting.
        If the value equals the sentinel (for example, -1), exit the loop with a break statement.
        If value is smaller than minimum, assign the value to minimum.
        If value is larger than maximum, assign the value to maximum.
        Add the value to the mean.
        Increment the count.
        After the loop has completed, divide the mean by the count.
        Print "Count: " and the value of count, with a newline.
        Print "Average: " and the value of mean, with a newline.
        Print "Maximum: " and the value of maximum, with a newline.
        Print "Minimum: " and the value of minimum, with a newline.

     */

    public static void Problem_20(){
        Scanner input = new Scanner(System.in);
        int value = 0;
        int count = 0;
        double mean = 0.0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        while (true) {
            value = input.nextInt();
            if (value == -1) {
                break;
            }
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
            mean += value;
            count++;
        }
        mean /= count;
        System.out.println("Count: " + count);
        System.out.println("Average: " + mean);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

    }
    /**
     * 21. 
        Create a method that reads in a decimal number 
        Declare 2 ints
        Declare and initialize a string to be empty
        Create an array of chars representing all of the hexadecimal digits
        Print the value of the decimal number being passed in
        “The Decimal is: “
        Create a while loop that iterates while the decimal number is greater than 0
        Modulo the decimal number by 16, keep track of the remainder
        Set the hex string equal to the corresponding value in the char array to the remainder of the modulo operation plus the hex string.
        Divide the decimal number by 16, storing the value in the decimal number 
        Print out the resulting hexadecimal string. 
        Return the hex string.  
     */

    public static String Problem_21(int decimal){
        int quotient, remainder;
        String hex = "";
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("The Decimal is: " + decimal);
        while (decimal > 0) {
            remainder = decimal % 16;
            hex = hexDigits[remainder] + hex;
            decimal /= 16;
        }
        System.out.println("The Hexadecimal is: " + hex);
        return hex;
    }

    /*
     * 22.
    Create a method that reads in a Hexadecimal number 
    Declare 2 ints
    Declare and initialize a string to be empty
    Create an array of chars representing all of the decimal digits
    Print the value of the decimal number being passed in
    “The Hexadecimal digit is: “
    Create a while loop that iterates while the Hex  number is greater than 0
    Modulo the decimal number by 10, keep track of the remainder
    Set the decimal string equal to the corresponding value in the char array to the remainder of the modulo operation plus the decimal string.
    Divide the hexadecimal number by 10, storing the value in the hexadecimal number 
    Print out the resulting decimal string. 
    Return the decimal string.  

     */

    public static String Problem_22(String hex){
        int quotient, remainder;
        String decimal = "";
        char[] decimalDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("The Hexadecimal digit is: " + hex);
        while (hex.length() > 0) {
            remainder = Integer.parseInt(hex.substring(hex.length() - 1));
            decimal = decimalDigits[remainder] + decimal;
            hex = hex.substring(0, hex.length() - 1);
        }
        System.out.println("The Decimal is: " + decimal);
        return decimal;
    }

    /*
     * 23.
Create a method that reads in 2 ints
Print both ints with a helpful message about the functionality of the comparison method
Check to see if the numbers are equal, if yes, print “The numbers are equal!”
Check to see if the numbers are not equal, if yes, print “The numbers are NOT equal!”
Check to see if the number a is greater than number b, if yes, print “Number a is greater than Number b!”
Check to see if the number b is greater than number a, if yes, print “Number b is greater than Number a!”
Check to see if the number b is greater than or equal to number a, if yes, print “Number b is greater than Number a!”
Check to see if the number a is greater than or equal to number b, if yes, print “Number a is greater than Number b!”

     */

    public static void Problem_23(int a, int b){
        System.out.println("The numbers are: " + a + " and " + b);
        if (a == b) {
            System.out.println("The numbers are equal!");
        }
        if (a != b) {
            System.out.println("The numbers are NOT equal!");
        }
        if (a > b) {
            System.out.println("Number a is greater than Number b!");
        }
        if (b > a) {
            System.out.println("Number b is greater than Number a!");
        }
        if (b >= a) {
            System.out.println("Number b is greater than or equal to Number a!");
        }
        if (a >= b) {
            System.out.println("Number a is greater than or equal to Number b!");
        }
    }

    /*
     * 24. 
        Create a method that reads in a length of the side of a hexagon
        Calculate the length of the hexagon by using this formula:
        (6*(s*s))/(4*Math.tan(Math.PI/6));
        Return the area rounded to the nearest 10th

     */

    public static double Problem_24(double s){
        double area = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
        return Math.round(area * 10.0) / 10.0;

    }

    /*
     * 
    25. 
    Create a method that reads in a string 
    Using a for loop, reverse the string.
    Return the resulting reversed string. 

     */

    public static String Problem_25(String s){
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;

    }
    /*26. 
     * Create a method that reads in the time in seconds. 
        Create a variable with is the seconds
        Create a variable which is the hours
        Create a variable which is the minutes
        Create a variable which is the hours. 
        return the resulting time in the format: 
        H + ":" + M + ":" + S
     */

    public static String Problem_26(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return hours + ":" + minutes + ":" + secs;
    }

    /**
     * 27.
     * Create a method that reads in 3 int values
        Return true if one is more than 20 
        Return true if one is more and less than the subtractions of the others. 

     */
    public static boolean Problem_27(int a, int b, int c){
        if (a > 20 || b > 20 || c > 20) {
            return true;
        }
        if (a > b - c || b > a - c || c > a - b) {
            return true;
        }
        return false;
    }

    /*
     * 28. 
        Create a method that takes 2 ints
        Check to see if the values are between 25 and 75
        If not, return false
        Create variables that are the modulo of 10 of the inputs
        Divide inputs by 10, using floor division. 
        Return the boolean that represents whether or not the inputs have a common digit.  

     * 
     */

    public static boolean Problem_28(int a, int b){
        if (a < 25 || a > 75 || b < 25 || b > 75) {
            return false;
        }
        int aMod = a % 10;
        int bMod = b % 10;
        a /= 10;
        b /= 10;
        return aMod == bMod || aMod == b || bMod == a;

    }


    /*
     * 
        29. 
        Create a method that accepts 2 strings 
        Check to see if the strings are of different lengths
        If they are, return str2 + str1 + str2
        Else, return the inverse

     */

    public static String Problem_29(String str1, String str2){
        if (str1.length() != str2.length()) {
            return str2 + str1 + str2;
        }
        return str1 + str2 + str1;
    }

    /*
     * 30. 
        Create a method that accepts 2 int arrays
        Check to see if the arrays size is greater than 2, if not, return false,
        Check to see if the arrays first elements are equal
        Check to see if the arrays last elements are equal
        If both are equal, return true. 
        Else, return false. 

     */

    public static boolean Problem_30(int[] arr1, int[] arr2){
        if (arr1.length < 2 || arr2.length < 2) {
            return false;
        }
        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }

    //create main method with hello world

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    }

}

