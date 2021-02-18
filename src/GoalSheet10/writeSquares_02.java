package GoalSheet10;

import java.util.*;
class writeSquares_02 {
    public static void main(String[] args) {

        System.out.println(writeSquares(10));
    }
    public static int  writeSquares(int n)
    {
        //first n squares, odd in descending and even in acsending
        int value =0;
        if(n < 2)
        {
            return n;
        }
        //System.out.print(n * n + " ");
        value = n*n;
        if((value % 2) == 0)
        {
            //arrange even squares here
        }
        else
        {
            //arrange odd squares here
        }
        return writeSquares(n-1);

    }


} 
