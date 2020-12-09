package GoalSheet07;

import java.util.*;
public class scaleByK {
    static int nextEmptyIndex =0;
    public static void main (String[] args)
    {
      ArrayList<Integer> toBeScaled = new ArrayList<Integer>();

        toBeScaled.set(0, 2);
        toBeScaled.set(1, 3);
        toBeScaled.set(2, 3);
        toBeScaled.set(3, 1);
        System.out.println(scalesByK(toBeScaled));

    }

    public static ArrayList<Integer> scalesByK(ArrayList<Integer> numbers)
    {   int value = 0;
        for(int i =0; i <= numbers.size(); i++) {
            //remove the 0's and the negative values
            if (numbers.get(i) == 0 || numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }

        for(int i =0; i <= numbers.size(); i++)
        {

            //make sure that the value is not null
            if(numbers.get(i) != null)
            {
                value = numbers.get(i);

                //looping value times and adding (value) at the next EmptyIndex
                for(int a =0; a < value; a++)
                {

                    numbers.set(nextEmptyIndex, value);
                    nextEmptyIndex++;
                }

            }


        }
        return numbers;
    }

}
