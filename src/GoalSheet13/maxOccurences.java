package GoalSheet13;

/**
 * Finds the mode of a given arraylist of integers
 * @param list ArrayList of integers to be searched
 * @return The mode of the given ArrayList
 */
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
        int maxOccurence =0;
        int retVal = 0;
        Map< Integer, Integer > maxValues = new HashMap<>();

        for (Integer i : numbers)
        {
            maxOccurence = maxValues.getOrDefault(i , 0);
            maxOccurence++;
            maxValues.put(i , maxOccurence);
        }


        for(Map.Entry<Integer, Integer> mapValue : maxValues.entrySet())
        {
             retVal = mapValue.getValue();
            for(Map.Entry<Integer, Integer> innerMapValue : maxValues.entrySet())
            {
                    if(retVal < innerMapValue.getValue())
                    {
                        retVal = innerMapValue.getValue();
                    }
            }
        }
        return retVal;
     }


}
