package GoalSheet10;

import java.util.*;
class writeSquares_02 {
    public static void main(String[] args) {

        writeSquares(8);
    }
    public static void  writeSquares(int n)
    {
        //first n squares, odd in descending and even in acsending
        int value =0;
        if(n < 1)
        {
            return;
        }
        //System.out.print(n * n + " ");
        value = n*n;
        if((value % 2) == 0)
        {
            // arrange even squares
            writeSquares(n-1);
            System.out.print(value + " ");
        }
        else
        {
            //arrange odd squares here
            System.out.print(value + " ");
            writeSquares(n-1);
        }



    }


} 
