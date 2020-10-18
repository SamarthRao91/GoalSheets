package GoalSheet03;

import java.util.Scanner;
public class GoalSheet03_05 {
    public static void main(String[] args) {
        int wordCount = 0;
        int emptySpace = 32;
        int endOfLine = 0x0D0A0;
        char charEmptySpace = (char) (emptySpace);
      Scanner charInput = new Scanner(System.in);
      System.out.println("Please input the values");
      String paperInput = charInput.nextLine();

           for(int c =0; c < paperInput.length(); c++)
           {
               if(paperInput.charAt(c) == charEmptySpace||paperInput.charAt(c) == endOfLine)
               {
                   wordCount++;
               }
           }
        int charCount = paperInput.length() - wordCount;

      System.out.print("WordCount: ");
       System.out.println(wordCount + 1);
        System.out.println("characterCount: " + charCount);


    }


    public static class Repl {

        public static void main(String[] args) {
            String result;


            result = repl("hello",10);
            System.out.println(result);
        }
     public static String repl(String value, int repetitions )
     {  String start = "";
         for(int i = 0; i < repetitions; i++)
         {

            start = start + value;

         }

         return start;
     }

    }
}
