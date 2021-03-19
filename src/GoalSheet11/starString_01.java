/*
* Problem GS11-01 - starString

Write a recursive method called starString that accepts an integer as a parameter and prints to the console
*  a string of stars (asterisks) that is 2n (i.e.2 to the nth power) long. (BJP Ch 12 Ex 1)
* */

package GoalSheet11;
import java.lang.Math;

public class starString_01 {
    public static void main(String[] args)
    {
         int counter = 1;
        starString(5.0,counter);

    }
    public static double starString(double n, int counter)
    {
        //do the math
        double x = Math.pow(2,n);
        //set the base case
        if(n <= 0)
        {
            return n;
        }

        System.out.println("*");

        System.out.println(x);
        x -= 1;
        return starString(x,counter);
    }
}