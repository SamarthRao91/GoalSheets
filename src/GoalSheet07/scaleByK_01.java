package GoalSheet07;

import java.util.*;
public class scaleByK_01 {
    //static int nextEmptyIndex =0;
    public static void main (String[] args)
    {
        ArrayList<Integer> toBeScaled = new ArrayList<>(Arrays.asList(4,1,5,3, -3, 0, -4, 6, -6));

        System.out.println(scalesByK(toBeScaled));
    }

    public static ArrayList<Integer> scalesByK(ArrayList<Integer> numbers)
    {   int value;
        ArrayList < Integer > returnAL = new ArrayList<Integer>();

        for(int i =0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 0)
                numbers.remove(i);
        }
        for(int i =0; i <  numbers.size(); i++)
        {
            for(int k =0; k < numbers.get(i); k++)
            {
                returnAL.add(numbers.get(i));
            }
        }
        return returnAL;
    }

}
