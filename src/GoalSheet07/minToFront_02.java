package GoalSheet07;

import java.util.ArrayList;
import java.util.Arrays;

public class minToFront_02 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4,1,5,3));
        System.out.println(minToFront(a));
        //Should print (1,4,5,3)
    }
    public static  ArrayList<Integer> minToFront(ArrayList<Integer> numbers) {
        int element = 0;
        ArrayList < Integer > arrayList;
        arrayList =numbers;
        int value = arrayList.get(0);

        for (int i = 1; i <= arrayList.size(); i++) {
            //get the lowest value from the array
            if (arrayList.get(i-1) <= value) {
                value = arrayList.get(i-1);
                element = i-1;
            }

        }
        arrayList.remove(element);
        arrayList.add(0, value);

        return arrayList;

    }

}