package GoalSheet05;

import java.util.*;

public class hangman_02 {
    public static void main(String[] args) {
        int continueOn = 0;
        String word = "cow";
        String[] splitWord = new String[word.length()];
        String[] userWord = new String[word.length()];
        splitWord = word.split("(?!^)");
        while (continueOn == 0) {
            //Getting the input from the user
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a letter");
            String input = userInput.nextLine();

            //checking the input
            for (int i = splitWord.length -1 ; i >= 0; i--) {

                if (input == splitWord[i]) {
                    input = userWord[i];
                    System.out.println("correct");
                } else {
                    System.out.println("incorrect");
                }

            }

            if (splitWord == userWord) {
                continueOn = 1;
            }


        }
    }
}

