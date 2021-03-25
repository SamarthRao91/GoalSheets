/*
* Write a recursive method called writeNums that takes an integer n as a parameter and prints to the console the first
* xn integers starting with 1 in sequential order, separated by commas. (BJP Ch 12 Ex 2)
* */
package GoalSheet11;

public class writeNums_02 {
    public static void main(String[] args)
    {
      writeNums(10);
    }
    public static void writeNums(int n)
    {
        if(n < 1)
        {
             return;
        }
        writeNums(n-1);
        System.out.println( " " + n);
    }
}
