package GoalSheet07;

import java.io.*;
import java.util.*;

public class reverse_05 {
    public static void main(String[] args) throws FileNotFoundException {
        String sentence = "";;
        String filePath = "C:\\Users\\raosa\\IdeaProjects\\GoalSheets\\src\\GoalSheet03\\doc.txt";
        Scanner fileInput = new Scanner(new File(filePath));
        while (fileInput.hasNext()) {
            sentence = sentence + " " + fileInput.next();
        }
        fileInput.close();
        ArrayList<Character> letters = new ArrayList<>();
        //loop over sentence and put each character into letters
        for(int i =0; i < sentence.length(); i++)
        {
            letters.add(sentence.charAt(i));
        }
        for(int i = letters.size()-1; i >= 0; i--)
        {
            System.out.print(letters.get(i));
        }
    }
}
