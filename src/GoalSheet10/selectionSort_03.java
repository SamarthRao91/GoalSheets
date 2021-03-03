package GoalSheet10;

import java.util.Arrays;

public class selectionSort_03
{
    public static void main(String[] args) {
        int[] series =  new int[]{4,3,6,1};
        selectionSort(series);
    }
    public static void swapMethod(int[] list, int i, int b)
    {
        //i is the index of the first value and b is the index of the second value
       //want to take value at i and put it in the place of jth value and take the value at j and put in the ith value
        int temp  =  list[b];
        list[b] = list[i];
        list[i] = temp;
    }
    public static void selectionSort(int[] list)
    {
        int largestIndex = 0;
        for(int j =0; j < list.length; j++)
        {
            //check each one to be the smallest value
            largestIndex  = j;
            for(int k = j +1; k < list.length; k++)
            {
                if(list[k] > list[largestIndex])
                {
                    swapMethod(list, largestIndex, k);
                }
            }
        }
        System.out.println( Arrays.toString(list));
    }
}