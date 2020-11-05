package GoalSheet05;

import java.util.*;

public class hangman_02 {
    public static void main(String[] args) {
        //making some variables
        boolean gameFinished = false;
        String input;
        String word = "I am cool";
        boolean wordCorrect = false;
        String[] wordArray = new String[word.length()];
        String[] userWord = new String[word.length()];
        int counter =0;
        wordArray = word.split("(?!^)");
        while (!gameFinished) {
            //Getting the input from the user
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a letter");
            input = userInput.nextLine();

            //check the user input
            for (int i = wordArray.length - 1; i >= 0; i--) {
                if (input.equals(wordArray[i])) {

                    wordCorrect = true;
                    userWord[i] = input;

                }
            }

            if(wordCorrect)
            {
                System.out.println("That letter has correct");
                counter++;
                System.out.println(Arrays.toString(userWord));
                wordCorrect = false;
            }
            else
            {
                System.out.println("The letter you guessed was incorrect");
            }

            //check if the user has finished the game
            if (counter == word.length()) {
                gameFinished = true;
                System.out.println("You have guessed all the letters in the word. The word was: " + word);
            }
        }
       }
    }


