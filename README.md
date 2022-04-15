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
previous two. The first 21 Fibonacci numbers are:

|F0|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|F13|F14|F15|F16|F17 |F18 |F19 | F20 |
|--|--|--|--|--|--|--|--|--|--|---|---|---|---|---|---|---|----|----|----|-----|
|0 |1 |1 |2 |3 |5 |8 |13|21|34|55 |89 |144|233|377|610|987|1597|2584|4181|6765 |


## Important links

- [Lab Overview](https://youtu.be/M8sLpGYM7Pc)
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)

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

## Task 3 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Task 4 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!