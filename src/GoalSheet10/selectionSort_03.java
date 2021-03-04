package GoalSheet10;

import java.util.Arrays;

public class selectionSort_03
{
    public static void main(String[] args) {
        int[] series =  new int[]{1,3,6,9};
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
        for(int j =list.length - 1; j > 0; j--)
        {
            //check each one to be the smallest value
            largestIndex  = j;
            for(int k = list.length -1; k <j-1 ; k++)
            {
                if(list[k] < list[largestIndex])
                {
                    swapMethod(list, largestIndex, k);
                }
            }
        }
        System.out.println( Arrays.toString(list));
    }
}
// loop from the end of the array to the beginning of an array
//check if that value -1 is the largest value
// swap it