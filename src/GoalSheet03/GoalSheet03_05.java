package GoalSheet03;

import java.util.*;
import java.io.*;
public class GoalSheet03_05 {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner fileInput = new Scanner(new File("C:\\Users\\raosa\\IdeaProjects\\GoalSheets\\src\\GoalSheet03\\doc.txt"));
        int wordCount = 0;
        int characterCounter = 0;
        int countOfLines=0;



        while (fileInput.hasNextLine()) {


            wordCount++;
            String word = fileInput.next();

            for (int i = 33; i <= 126; i++ ) {
                char iNumber = (char)(i);
                for (int c = 0; c < word.length(); c++) {
                    if (word.charAt(c) == iNumber) {

                     characterCounter++;
                    }
                    if( word.charAt(c) == '\n')
                    {
                        countOfLines++;
                    }
                }


            }

        }
        System.out.println("WordCounter: " + wordCount);
        System.out.println("characterCounter: " + characterCounter);
        System.out.println("lineCount: " + countOfLines);
    }
}








