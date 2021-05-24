package GoalSheet13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class maxOccurences {
    public static void main(String[] args)
    {
        ArrayList<Integer> intValues = new ArrayList<>();
        intValues.add(1); //1
        intValues.add(1); //2
        intValues.add(17);
        intValues.add(1); //3
        intValues.add(1); //4
        intValues.add(4);
        intValues.add(1); //5
        intValues.add(2);
        intValues.add(22);
        intValues.add(4);
        intValues.add(7);
        intValues.add(6);
        intValues.add(1); //6
        intValues.add(2);
        intValues.add(1); //7
        System.out.println(max(intValues));

    }
    public static int max(ArrayList<Integer> numbers)
    {
        Map< String, Integer > maxValues = new HashMap<>();
        int maxOccurences = 0;
        maxValues.put("values" , maxOccurences);
        for(int i = 0; i < numbers.size(); i++)
        {
            for (Integer number : numbers) {
                //see how many times numbers[i] appear in numbers[k]
                if (numbers.get(i).equals(number)) {
                    maxOccurences++;

                }
                if(maxOccurences  > maxValues.get("values") )
                {
                    maxValues.replace("values" , maxOccurences);

                }

            }
        }


        return maxValues.get("values");
    }
}
