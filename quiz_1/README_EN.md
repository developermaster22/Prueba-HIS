## Requirements
1. Please complete the following code to answer the question
    ```java
    class Solution {
        public int[] buildArray(int[] nums) {
            return nums;
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

Given a zero-based permutation nums (0-indexed), build an array **ans** of the same length where **ans[i] = nums[nums[i]]** for each **0 <= i < nums.length** and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

**Example 1:**
```
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
```

**Example 2:**
```
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
```

**Constraints:**

1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.