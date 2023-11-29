# JUnit Assertions Practice
This is a simple Java project demonstrating the use of [JUnit 5](https://junit.org/junit5/) assertions. The project 
includes a `MathOperations` and `StringUtils` classes. 
`MathOperations` class includes basic arithmetic operations:
- `add(int a, int b)`: Adds two integers.
- `subtract(int a, int b)`: Subtracts the second integer from the first.
- `multiply(int a, int b)`: Multiplies two integers.
- `divide(int a, int b)`: Divides the first integer by the second. Throws IllegalArgumentException if dividing by zero.
- `square(int a)`: Returns the square of the input integer.
- `isEven(int number)`: Returns `true` or `false` if `number` is even or odd.

`StringUtils` class allows user to perform simple manipulations with the strings:
- `reverse(String str)`: Returns the reversed value of the string;.
- `capitalize(String str)`: Returns the string with first letter capitalized.
- `concatenate(String str1, String str2)`: Concatenates the strings, returns `null` if any of the input is null.
- `splitIntoWords(String str)`: Splits sentences into an array, if input value is null, then an empty array is returned.

## The Purpose
The purpose of this project is to practice with [JUnit 5](https://junit.org/junit5/) assertions. It covers a variety of 
assertion methods to test different scenarios, including basic arithmetic operations, string concatenation, and array manipulation.
The project has a specific rule of test coverage, it requires 100% (1,0) of coverage. If the coverage is less than 100% then `./gradlew clean test` 
command will fail. Your goal is to cover the code with unit tests in a way that the result of the command `./gradlew clean test` is `BUILD SUCCESSFUL`.

## What is Unit Testing?
Unit testing is a software testing technique where individual units or components of a software are tested in isolation. 
The goal is to validate that each unit of the software performs as designed. Unit tests are typically automated and 
focus on small, specific parts of the codebase.

### Why Unit Testing?
1. **Early Detection of Bugs:** Unit tests help identify and fix bugs early in the development process.
2. **Code Maintainability:** Tests act as documentation and provide confidence that code changes do not introduce new issues.
3. **Regression Testing:** Unit tests ensure that existing functionality continues to work as expected when new features 
are added or code is modified.

## How to Run Tests
### Prerequisites
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) installed

### Running Tests
1. Clone this repository:

   ```bash
   git clone git@github.com:qcademy/JunitAssertionsPractice.git
   cd JunitAssertionsPractice
   ```
2. Run tests with build tool [gradle](https://gradle.org/):
    ```bash
    ./gradlew clean test
    ```
