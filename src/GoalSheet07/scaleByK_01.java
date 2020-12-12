package GoalSheet07;

import java.util.*;
public class scaleByK_01 {
    static int nextEmptyIndex =0;
    public static void main (String[] args)
    {

        ArrayList<Integer> toBeScaled = new ArrayList<>(Arrays.asList(4,1,5,3));

        System.out.println(scalesByK(toBeScaled));
        System.out.println("Test");

    }

    public static ArrayList<Integer> scalesByK(ArrayList<Integer> numbers)
    {   int value;
        for(int i =0; i < numbers.size(); i++) {
            //remove the 0's and the negative values
            if (numbers.get(i) == 0 || numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }

        for(int i =0; i < numbers.size(); i++)
        {

            //make sure that the value is not null
            if(numbers.get(i) != null)
            {
                value = numbers.get(i);

                //looping value times and adding (value) at the next EmptyIndex
                for(int a =0; a < value; a++)
                {

                    numbers.add(nextEmptyIndex, value);
                    nextEmptyIndex++;
                }

            }


        }
        return numbers;
    }

}
