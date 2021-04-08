package GoalSheet08;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

class removeFromRange {
  public static void main(String[] args) {
  //pass in a linked list and then add the values to the list
    LinkedList<Integer> numbers = new LinkedList<Integer>();
    numbers.add(0, 1);
    numbers.add(1, 2);
    numbers.add(2, 3);
    numbers.add(3, 4);
    numbers.add(4, 5);
    Iterator tester = numbers.iterator();
      while(tester.hasNext())
      {
        System.out.println(tester.next());
      }

  System.out.println("RemoveFromRange - ");
    removedFromRange(1, 2, numbers);
  }
  public static void removedFromRange(int startValue, int endValue,LinkedList<Integer> list)
    {
      // iterate from start value until end value
      LinkedList<Integer> copy = list;
      for( int i = endValue; i >= startValue; i-- )
      {
          copy.remove(i);
      }
      

      //printing the linked list
      Iterator it =  copy.iterator();
      while(it.hasNext())
      {
        System.out.println(it.next());
      }
    }
} 