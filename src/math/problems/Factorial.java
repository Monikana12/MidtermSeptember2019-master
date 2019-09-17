package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println("Factorial of 5 = " + factorial2(5));
    }

    public static int factorial2(int i) {
        if (i == 0)
            return 1;
        else return i * factorial2(i - 1);
    }
}
