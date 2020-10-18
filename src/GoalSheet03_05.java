import java.util.Scanner;
public class GoalSheet03_05 {
    public static void main(String[] args) {
        int wordCount = 0;
        int emptySpace = 32;
        char charEmptySpace = (char) (emptySpace);
      Scanner charInput = new Scanner(System.in);
      System.out.println("Please input the values");
      String paperInput = charInput.nextLine();

           for(int c =0; c < paperInput.length(); c++)
           {
               if(paperInput.charAt(c) == charEmptySpace)
               {
                   wordCount++;
               }
           }
        int charCount = paperInput.length() - wordCount;

      System.out.print("WordCount: ");
       System.out.println(wordCount + 1);
        System.out.println("characterCount: " + charCount);


    }


}
