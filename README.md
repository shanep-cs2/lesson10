# lesson10 - Fibonacci

## Overview

In our first attempt at recursion we will solve a classically recursive problem, the [Fibonacci
number](https://en.wikipedia.org/wiki/Fibonacci_number)! This is the "hello world" of recursion and
there are well know solutions all over the internet. The purpose of this lab is for you to attempt
to solve it yourself without looking up the solution online. Additionally, this is a common
interview question asked by companies and they may ask you to solve it on a whiteboard without
access to google, so it is in your best interest to attempt to solve this with only the textbook as
a resource!

The Fibonacci sequence begins with 0 and then 1 follows. All subsequent values are the sum of the
previous two, for example: 0, 1, 1, 2, 3, 5, 8, 13. 

## Task 1 - Write Unit Tests

Test Driven Development (TDD) really shines when implementing mathematical algorithms. In this case
the Fibonacci sequence is well known and we can easily write a set of tests that can ensure the
first 8 - 20 numbers calculate correctly. Obviously we can't test all outcomes because the Fibonacci
sequence is infinite so we will just test a small subset which should be sufficient to prove that
the algorithm is correct. 

## Task 2 - Complete the fibonacci algorithm

Complete the FibNum class.  You must use recursion, no credit will be given for an iterative
solution.  The `calculate(int n)` method takes in an index, n, and returns the nth value in the
sequence. Any negative index values should return -1.

```java
public class FibNum {

    public static int calculate(int n) {
        //Recursive solution here
        return 0;
    }
}
```

## Task 3 - Command line arguments

The class that contains `main` method needs to be updated to accept 1 command line argument
representing the number that you want to calculate.  You can run `gradlew installDist` to create a
runnable image of the application. The image will be located in directory
`app/build/install/app/bin`. If you were distributing this application to end users there are some
extra steps involved, but in this case we don't need to worry about those steps as we just want
to run the program.

Assuming that your build succeeded you can now `cd` into the `app/build/install/app/bin` directory
and run your application as shown below.

```bash
shane|(main *%=):lesson10$ cd app/build/install/app/bin/   
shane|(main *%=):bin$ ./app
No number given!
shane|(main *%=):bin$ ./app 1
Fibonacci number: 1 is 0 
```

