package com.andriyshapoval;

/*Let’s say you are given a number, a, and you want to find its square root. One way to
        do that is to start with a rough guess about the answer, x 0 , and then improve the guess
        using this formula:
        x 1 = x 0 + a/x 0 /2
        For example, if we want to find the square root of 9, and we start with x 0 = 6, then
        x 1 = 6 + 9/6 /2 = 3 . 75, which is closer. We can repeat the procedure, using x 1 to cal‐
        culate x 2 , and so on. In this case, x 2 = 3 . 075 and x 3 = 3 . 00091. So it converges
        quickly on the correct answer.
        Write a  method called squareRoot that takes a double and returns an approximation
        of the square root of the parameter, using this technique. You should not use
        Math.sqrt .
        As your initial guess, you should use a/2. Your method should iterate until it gets two
        consecutive estimates that differ by less than 0.0001.
        */

public class Main {

    public static double squareRoot(double a) {

        double result = a / 2;
        double diff = 1;

        while (diff > 0.0001) {
            double temp = (result + a / result) / 2;
            diff = result - temp;
            result = temp;
        }
        return result;

    }

    public static void main(String[] args) {
	    double sqrt = squareRoot(16);
        System.out.println(sqrt);
    }
}
