## Requirements
1. Please complete the following code to answer the question
    ```java
    class Solution {
        public int calibration(String[] table) {
            return 0;
        }
    }
    ```
2. Use Java JDK 8, 11, or 17 to implement your answer.
3. Please provide a README.md file explaining your answer; if is possible, anaylize the *Time Complixity* and *Space Complixity* of your solution.
4. Use either English or Spanish in your README.md.
5. Pack up your answer, Solution.java and README.md, into a zip file, and send it as {your_name}_java_quiz.zip to our email, proyectohisparaguay@gmail.com.

## How to run the example java code
There is a *Solution.java* file accompanied with this README file, if the file is missing,
please reach us to get it.

### Steps to run the code
1. Make sure java is installed in your machine
2. Follow the steps to execute the example code:
   ```bash
   $ javac ./Solution.java
   $ java Solution
   ```

### In case you cannot have a computer with java installed
You can use any java online compiler, e.g., [programiz](https://www.programiz.com/java-programming/online-compiler/), to implement your solution.

## Quiz Explaination

Given a calibration table (calibration_doc.txt), which is a list of strings, each string can be interpreted as a number by using the first encountered digit as the tens digit and the last as the units digit, returning the sum of all the numbers of the calibration table.

**Example 1:**
```
Input: calibrations = [two1nine, eightwothree, abcone2threexyz, xtwone3four, 4nineeightseven2, zoneight234, 7pqrstsixteen]
Output: 281

Explanation:
the input can be converted to [29, 83, 13, 24, 42, 14, 76], adding up the numbers will get the result, 281.
```

**Example 2:**
```
Input: nums = [oneight]
Output: 18

Explanation:
the input can be converted to [18], since on"e" and "e"ight are the two numbers in that string. then the sum of the list is 18.
```

**Constraints:**
This is defined by the calibration file, calibration_doc.txt.
