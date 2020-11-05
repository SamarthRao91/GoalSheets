package GoalSheet05;

import java.util.*;

public class hangman_02 {
    public static void main(String[] args) {
        //making some variables
        boolean gameFinished = false;
        String input;
        String word = "cool";
        boolean wordCorrect = false;
        String[] wordArray = new String[word.length()];
        String[] userWord = new String[word.length()];
        wordArray = word.split("(?!^)");
        int counter = 0;
        while (gameFinished == false) {
            //Getting the input from the user
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a letter");
            input = userInput.nextLine();

            //check the user input
            for (int i = wordArray.length - 1; i >= 0; i--) {
                if (input == wordArray[i]) {

                    wordCorrect = true;
                }

                if(wordCorrect == true)
                {
                    System.out.println("That letter has correct");
                    input = userWord[i];
                    wordCorrect = false;
                }
                else
                {
                    System.out.println("The letter you guessed was incorrect");
                }

            }


            //check if the user has finished the game
            if (counter == word.length()) {
                gameFinished = true;
                System.out.println("The Game has finished, you have won");
            }
        }
       }
    }


