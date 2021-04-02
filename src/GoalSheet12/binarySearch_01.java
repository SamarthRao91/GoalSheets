package GoalSheet12;
import java.util.*;
import java.io.*;

public class binarySearch_01 {
  public static void main(String[] args) throws FileNotFoundException
  {
      String word1;
      String word2;
      ArrayList<String> dictionary = new ArrayList<String>();
      int nextEmptyIndex = 0;

      String filePath = "C:\\Users\\raosa\\IdeaProjects\\GoalSheets\\src\\GoalSheet12\\DictionaryAll.txt";
      Scanner fileInput = new Scanner(new File(filePath));

      while (fileInput.hasNext()) {
             dictionary.add(fileInput.next());
      }
      fileInput.close();

      //getting the words form the user
      Scanner userInput = new Scanner(System.in);
      word1 = userInput.nextLine();
      Scanner userInput2 = new Scanner(System.in);
      word2 = userInput2.nextLine();

      //find the location of the two words in the dictionary
      int firstWordLocation = binarySearch(dictionary, word1);
      int secondWordLocation = binarySearch(dictionary, word2);

      //Find the number of words between them
      int difference = secondWordLocation - firstWordLocation;
      if(difference < 0)
      {
          difference = difference *-1;
      }
      System.out.println(difference);
  }
   public static int binarySearch(ArrayList<String> dictionary, String target)
   {
       System.out.println("The binary search is being called");
     int min = 0;
     int max = dictionary.size() - 1;

     while(min <= max) {
         int mid = (max + min) / 2;
         int targetLocation = dictionary.get(mid).compareTo(target);
         if(targetLocation == 0)
         {
             //the string was found
             System.out.println("The guess was found");
             return mid;
         }
         else if(targetLocation < 0)
         {
             min = mid + 1;
             System.out.println("the guess was to small");
         }
         else
         {
              max  = mid -1;
              System.out.println("the guess was to big");
         }

     }
       System.out.println("could not find it");
     return -1;


     //target is not found in the dictionary
   }
}
