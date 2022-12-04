
"""
1. 
(375)
We are playing the Guessing Game. The game will work as follows:
I pick a number between 1 and n.
You guess a number.
If you guess the right number, you win the game.
If you guess the wrong number, then I will tell you whether the number I picked is higher or lower, and you will continue guessing.
Every time you guess a wrong number x, you will pay x dollars. If you run out of money, you lose the game.
Given a particular n, return the minimum amount of money you need to guarantee a win regardless of what number I pick.
"""

import random

def getMoneyAmount(n):
    """
    :type n: int
    :rtype: int
    """
    # 1. Create a 2D array of size n+1 * n+1
    # 2. Fill the array with 0s
    # 3. Fill the array with the minimum amount of money to guarantee a win
    # 4. Return the value at the top right corner of the array

    # 1. Create a 2D array of size n+1 * n+1
    dp = [[0 for i in range(n+1)] for j in range(n+1)]

    # 2. Fill the array with 0s
    for i in range(n+1):
        for j in range(n+1):
            dp[i][j] = 0

    # 3. Fill the array with the minimum amount of money to guarantee a win
    for i in range(n, 0, -1):
        for j in range(i+1, n+1):
            dp[i][j] = min([k + max(dp[i][k-1], dp[k+1][j]) for k in range(i, j)])

    # 4. Return the value at the top right corner of the array
    return dp[1][n]





"""
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

"""

def myAtoi(s):
    """
    :type s: str
    :rtype: int
    """
    # 1. Remove all leading and trailing whitespaces
    # 2. Check if the first character is a number or a sign
    # 3. If the first character is a sign, check if the next character is a number
    # 4. If the first character is a number, check if the next character is a number
    # 5. If the first character is neither a number nor a sign, return 0
    # 6. If the first character is a number, return the number
    # 7. If the first character is a sign, return the number with the sign

    # 1. Remove all leading and trailing whitespaces
    s = s.strip()

    # 2. Check if the first character is a number or a sign
    if s[0].isdigit():
        # 4. If the first character is a number, check if the next character is a number
        for i in range(1, len(s)):
            if not s[i].isdigit():
                # 6. If the first character is a number, return the number
                return max(min(int(s[:i]), 2**31-1), -2**31)
        # 6. If the first character is a number, return the number
        return max(min(int(s), 2**31-1), -2**31)
    elif s[0] == '-' or s[0] == '+':
        # 3. If the first character is a sign, check if the next character is a number
        if len(s) > 1 and s[1].isdigit():
            # 7. If the first character is a sign, return the number with the sign
            for i in range(2, len(s)):
                if not s[i].isdigit():
                    # 6. If the first character is a number, return the number
                    return max(min(int(s[:i]), 2**31-1), -2**31)
            # 6. If the first character is a number, return the number
            return max(min(int(s), 2**31-1), -2**31)
        else:
            # 5. If the first character is neither a number nor a sign, return 0
            return 0

    """
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
    """
def problem_3():
    # 1. Declare an integer variable of type byte, short, int, and long.
    # 2. Declare a floating-point variable of type float, and double.
    # 3. Declare three variables of type char.
    # 4. Declare three variables of the class String.
    # 5. Initialize the variables to the values shown below (using an initializer or assignment statement):
    # byte: 32, short: 15477, int: 664422, long: 3984759871
    # float: 8.112, double: 56.4444
    # char: '&', 'S', '5'
    # String: "Computer", "Science", "Excellent"
    # NOTE: The long integer value exceeds 32-bits, and therefore requires special syntax.
    # NOTE: The float value similarly requires special syntax, otherwise it will default to type double.
    # Find the syntax referenced above for long and float literals on the web and use them.

    # 1. Declare an integer variable of type byte, short, int, and long.
    byte = 32
    short = 15477
    int = 664422
    long = 3984759871

    # 2. Declare a floating-point variable of type float, and double.
    float = 8.112
    double = 56.4444

    # 3. Declare three variables of type char.
    char1 = '&'
    char2 = 'S'
    char3 = '5'

    # 4. Declare three variables of the class String.
    string1 = "Computer"
    string2 = "Science"
    string3 = "Excellent"

    # 5. Initialize the variables to the values shown below (using an initializer or assignment statement):
    # byte: 32, short: 15477, int: 664422, long: 3984759871
    # float: 8.112, double: 56.4444
    # char: '&', 'S', '5'
    # String: "Computer", "Science", "Excellent"
    # NOTE: The long integer value exceeds 32-bits, and therefore requires special syntax.
    # NOTE: The float value similarly requires special syntax, otherwise it will default to type double.
    # Find the syntax referenced above for long and float literals on the web and use them.


"""
4. 
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
"""

def problem_4():
    # 1. On the first line of output, print the string "Computer Science is great!".
    print("Computer Science is great!")
    # 2. On the second line of output, print the string "Java Programming can be fun.".
    print("Java Programming can be fun.")
    # 3. On the third line of output, print your last name, a comma, and your first name.
    print("Hart, Ryan")
    # 4. On the fourth line of output, print your major or "Undeclared".
    print("Undeclared")
    # 5. On the fifth line of output, print the name of this class "CS160 Foundations in Programming".
    print("CS160 Foundations in Programming")
    # 6. On the sixth line of output, print the due date of this assignment in the format shown below (for example 9/21/2001).
    print("9/21/2001")
    # 7. On the seventh line, print a sentence that explains why you are taking this class.
    # Some additional directions for the seventh line, as follows:
    # Must start with a capital letter.
    # Must end with a period or exclamation point.
    # Must be between 50 and 70 characters total, including white space.
    print("I am taking this class because I want to learn how to program.")

"""
5.
Declare and initialize the following variables of type double:
assign0, assign1, assign2
lab0, lab1, lab2, lab3
exam0, exam1
assignAverage, labAverage, examAverage
classGrade
read from the keyboard.
Use print to display the prompt "First assignment: ".
read a double value from the user into assign0.
Repeat for the second and third assignments, adjusting the prompts.
Use print to display the prompt "First lab: ".
 read a double value from the user into lab0.
Repeat for the second, third, and fourth labs, adjusting the prompts.
Use print to display the prompt "First exam: ".
read a double value from the user into exam0.
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

"""
def problem_5():
    # 1. Declare and initialize the following variables of type double:
    # assign0, assign1, assign2
    # lab0, lab1, lab2, lab3
    # exam0, exam1
    # assignAverage, labAverage, examAverage
    # classGrade
    # read from the keyboard.
    # Use print to display the prompt "First assignment: ".
    # read a double value from the user into assign0.
    # Repeat for the second and third assignments, adjusting the prompts.
    # Use print to display the prompt "First lab: ".
    # read a double value from the user into lab0.
    # Repeat for the second, third, and fourth labs, adjusting the prompts.
    # Use print to display the prompt "First exam: ".
    # read a double value from the user into exam0.
    # Repeat for the second exam, adjusting the prompt.
    # Compute the average assignment score and assign to assignAverage.
    # Compute the average lab score and assign to labAverage.
    # Compute the average exam score and assign to examAverage.
    # Compute the class grade based on the following formula:
    # class grade = (assignment average * 30%) + (lab average * 20%) + (exam average * 50%)
    # Print the assignment average, as shown in the output below.
    # Print the lab average, as shown in the output below.
    # Print the exam average, as shown in the output below.
    # Print the class grade, as shown in the output below.
    # All output should have exactly 2 digits after the decimal point. (HINT: use System.out.printf)
    # Do not hard code anything, we will use different input values than those shown. You should also test your program on a range of different values. Use a calculator to check your answers.

    # 1. Declare and initialize the following variables of type double:
    # assign0, assign1, assign2
    # lab0, lab1, lab2, lab3
    # exam0, exam1
    # assignAverage, labAverage, examAverage
    # classGrade
    # read from the keyboard.
    # Use print to display the prompt "First assignment: ".
    # read a double value from the user into assign0.
    # Repeat for the second and third assignments, adjusting
    # the prompts.
    assign0 = float(input("First assignment: "))
    assign1 = float(input("Second assignment: "))
    assign2 = float(input("Third assignment: "))
    # Use print to display the prompt "First lab: ".
    # read a double value from the user into lab0.
    # Repeat for the second, third, and fourth labs, adjusting
    # the prompts.
    lab0 = float(input("First lab: "))
    lab1 = float(input("Second lab: "))
    lab2 = float(input("Third lab: "))
    lab3 = float(input("Fourth lab: "))
    # Use print to display the prompt "First exam: ".
    # read a double value from the user into exam0.
    # Repeat for the second exam, adjusting the prompt.
    exam0 = float(input("First exam: "))
    exam1 = float(input("Second exam: "))
    # Compute the average assignment score and assign to assignAverage.
    assignAverage = (assign0 + assign1 + assign2) / 3
    # Compute the average lab score and assign to labAverage.
    labAverage = (lab0 + lab1 + lab2 + lab3) / 4
    # Compute the average exam score and assign to examAverage.
    examAverage = (exam0 + exam1) / 2
    # Compute the class grade based
    # on the following formula:
    # class grade = (assignment average * 30%) + (lab average * 20%) + (exam average * 50%)

    classGrade = (assignAverage * 0.3) + (labAverage * 0.2) + (examAverage * 0.5)
    # Print the assignment average, as shown in the output below.
    print("Assignment average: " + str(assignAverage))
    # Print the lab average, as shown in the output below.
    print("Lab average: " + str(labAverage))
    # Print the exam average, as shown in the output below.
    print("Exam average: " + str(examAverage))
    # Print the class grade, as shown in the output below.
    print("Class grade: " + str(classGrade))
    # All output should have exactly 2 digits after the decimal point. (HINT: use System.out.printf)
    # Do not hard code anything, we will use different input values than those shown. You should also test your program on a range of different values. Use a calculator to check your answers.


"""
6.
read console input.
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
"""

def problem_6():
    return None

"""
7.

printPrimes
Inside the method iterate over the specified (inclusive) range using a for loop.
Call the isPrime method for each number in the range.
If isPrime returns true for the number, print the number followed by a comma and space.
It is expected that the last prime number will be followed by a comma and space.
After the loop has completed, print a newline.

"""

def printPrimes(start, end):
    return None


"""
8.
Inside the class, but outside any method, declare a instance variable initialized to "", with a name you choose.
Declare a function called setString that takes a parameter and stores it in your instance variable.
Declare a function called getString that takes no parameters and returns a String with the contents of your instance variable.

NOTE: You can only use the String methods charAt and length, in addition to String concatenation with the '+' operator. You cannot use any other String or Character methods in your class!

All of the methods below operate on the instance variable of type String stored in the Pseudo class:

Declare a function called charAt that takes an index parameter and returns the character in the stored string at the index. You can assume that the index is valid, i.e. between 0 and String.length()-1.
Declare a function called indexOf that takes a character parameter and returns the index in the stored string of the first occurrence of that character or -1 if the character is not found.
Declare a function called substring with two  parameters start and end that returns the substring in a manner identical to the String method of the same name. You can assume that both indices are valid
Declare a function called equals that takes a  parameter and compares the contents of it with the stored string. Return true if they exactly match character for character, and false if not.
Add a main method with the usual signature that instantiates the Pseudo class and tests its methods as follows (the output from Pseudo should match the output from String):
"""

def problem_8():
    return None

"""
9.
create a method that takes an array
initialize a variable to 0
iterate over the array using a for-loop or a while loop
add each element to the variable
outside the loop, return the variable

"""

def problem_9():
    return None

# Write a method named createIntegers that allocates, initializes, and returns an array of integers with the following entries: 16, 21, 34, 49, 55, 60, 72, 83, 101. The method has no parameters and returns an array of 9 integers.
def createIntegers():
    return None

# Write a method named createDoubles that builds an array of floating point values that represent the squares of the numbers from 10.0 to 13.0, in steps of 0.5, inclusive of both boundaries. The method has no parameters and returns an array of doubles. There are exactly 7 numbers in this array.
def createDoubles():
    return None

# Write a method named createStrings that takes a String as an input parameter, and returns an array of string with 4 elements. The first element is the original string passed in, the second element is the same string converted to uppercase, the third element is the same string converted to lowercase, and the fourth element is the same string with the first character removed.
def createStrings(s):
    return None

# Write a method named createChars that extracts the characters from a string and builds an array with them. The method takes a parameter of type String and returns an array of characters. Hint: the size of this array is very easy to determine!
def createChars(s):
    return None

# Write a method called sumArray that takes an array of integers as a parameter, and returns an integer equal to the sum of all elements in the array.
def sumArray(a):
    return None

# Write a method called findLargest that takes an array of doubles as a parameter, and returns a double equal to the largest element in the array.
def findLargest(a):
    return None

# Write a method called charFrequency that takes an array of strings and a single character as parameters. The method should iterate the array, counting instances of the character passed in. For example, if the array is ["Hello", "There"] and we are asked to count the character 'e', the return value will be three. If the character is not found in any of the elements in the array, the return value should be zero.
def charFrequency(a, c):
    return None

# Write a method called translateChars that takes an array of characters and returns an array of integers with the values that correspond to each element of the character array. For example, the character 'A' will be translated to 65, the character '0' will be translated to 48, and the character '%' will be translated to 37. The integer array returned should be of the same size as the array of characters passed in.
def translateChars(a):
    return None

"""
10.

Part OneDeclare additional variables named cubeSideLength, cubeVolume, mass, acceleration, and force of type double.
Prompt the user for cubeSideLength, by printing "Length of cube? " using print() directly after you prompted the user for the triangle values.
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

"""

def problem_10():   
    return None

"""
11.
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
"""

def problem_11():
    return None

"""
12.
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

"""

def problem_12():
    return None

"""
13.


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

"""

def problem_13():
    return None

"""
14.

Initialize four additional variables of type double to serve the following purposes: withdrawal amount, principal, interest rate, and future investment amount. Initialize the interest rate variable to 0.025 and the rest to 0.0.
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
"""

def problem_14():
    return None


"""
15.
Write a program that deals one hand of 20 cards using arrays and for loops, and
do so by using the Random class to generate pseudorandom values between 0 and 51, and
initialize the player hand with 20 integer values, but also
keep track if a value 0 through 51 has already been dealt, and lastly
determine what the suits and ranks of cards are in the player hand based on the integer values.
"""

def problem_15():
    return None 


"""
16.

Create a 5 element array of doubles called grades that contains the following numbers in this order: 81.2, 92.5, 48.9, 78.8, and 45.5.
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
Print the contents of grades 
Print the contents of numbers 
Print the contents of arguments 
FINAL STEP: Write a function called arrayAverage that takes an array of doubles as a parameter.
and returns the average as a double. Print the result of calling arrayAverage with the array grades. with exactly 3 digits after the decimal point.

"""

def problem_16():
    return None

"""
17.

Declare three variables of type int called A, B, and C, which represent the quadratic equation coefficients.
Declare two variables of type double called positiveRoot and negativeRoot, to store the roots of the quadratic equation.
Declare and read from the keyboard, reading a name of your choice.
Prompt the user to input the A coefficient, uusing print, as follows: "Enter coefficient A: ".
Read an integer from the keyboard into the variable A.
Prompt the user to input the B coefficient, using print, as follows: "Enter coefficient B: ".
Read an integer from the keyboard into the variable B.
Prompt the user to input the C coefficient, using print, as follows: "Enter coefficient C: ".
Read an integer from the keyboard into the variable C.
Print the quadratic equation in the format shown in the sample output below.
Look up the quadratic formula on the web.
Compute the positive root and store it into the variable positiveRoot.
Compute the negative root and store it into the variable negativeRoot.
Print the positive root, with one digit after the decimal point, as shown below.
Print the negative root, with one digit after the decimal point, as shown below.

"""

def problem_17():
    return None

"""
18. removeVowels
Declare a string variable for the return value, and initialize it to "".
Use a for loop to iterate over all the characters in the supplied string.
Use a conditional or switch statement to check whether the character is a vowel.
The vowels are a/e/i/o/u, uppercase or lowercase.
If it is a vowel, do nothing, otherwise add the character to the return string.
After the loop has completed, return the string.

"""

def removeVowels(string):
    return None

"""
19. evaluateExponent
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
"""

def evaluateExponent(number, exponent):
    return None


"""
20. computeStatistics
Declare an integer variable called value and initialize it to 0.
Declare an integer variable called count and initialize it to 0.
Declare a double variable called mean and initialize it to 0.0.
Declare an integer variable called minimum and set it equal to MAX_VALUE.
Declare an integer variable called maximum and set it equal to MIN_VALUE;
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
"""

def computeStatistics():
    return None

"""
21. 
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
"""

def decimalToHex(decimal):
    return None

"""
22. 
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
"""

def hexToDecimal(hex):
    return None

"""
23.
Create a method that reads in 2 ints
Print both ints with a helpful message about the functionality of the comparison method
Check to see if the numbers are equal, if yes, print “The numbers are equal!”
Check to see if the numbers are not equal, if yes, print “The numbers are NOT equal!”
Check to see if the number a is greater than number b, if yes, print “Number a is greater than Number b!”
Check to see if the number b is greater than number a, if yes, print “Number b is greater than Number a!”
Check to see if the number b is greater than or equal to number a, if yes, print “Number b is greater than Number a!”
Check to see if the number a is greater than or equal to number b, if yes, print “Number a is greater than Number b!”
"""

def compareNumbers(a, b):
    return None

"""
24.
Create a method that reads in a length of the side of a hexagon
Calculate the length of the hexagon by using this formula:
(6*(s*s))/(4*Math.tan(Math.PI/6));
Return the area rounded to the nearest 10th
"""

def hexagonArea(s):
    return None

"""
25. 
Create a method that reads in a string 
Using a for loop, reverse the string.
Return the resulting reversed string. 

"""

def reverseString(string):
    return None

"""
26.
reate a method that reads in the time in seconds. 
Create a variable with is the seconds
Create a variable which is the hours
Create a variable which is the minutes
Create a variable which is the hours. 
Print the resulting time in the format: 
H + ":" + M + ":" + S
"""

def convertSeconds(seconds):
    return None

"""
27.
Create a method that reads in 3 int values
Return true if one is more than 20 
Return true if one is more and less than the subtractions of the others. 
"""

def checkValues(a, b, c):
    return None

"""
28.
Create a method that takes 2 ints
Check to see if the values are between 25 and 75
If not, return false
Create variables that are the modulo of 10 of the inputs
Divide inputs by 10, using floor division. 
Return the boolean that represents whether or not the inputs have a common digit.  

"""

def commonDigit(a, b):
    return None


"""
29. 
Create a method that accepts 2 strings 
Check to see if the strings are of different lengths
If they are, return str2 + str1 + str2
Else, return the inverse
"""

def mixString(str1, str2):
    return None

"""

30. 
Create a method that accepts 2 int arrays
Check to see if the arrays size is greater than 2, if not, return false,
Check to see if the arrays first elements are equal
Check to see if the arrays last elements are equal
If both are equal, return true. 
Else, return false. 
"""

def commonEnd(a, b):
    return None


def main():
    print("Hello World!")

if __name__ == "__main__":
    problem_5()
