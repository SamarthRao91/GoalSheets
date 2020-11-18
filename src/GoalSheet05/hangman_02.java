package GoalSheet05;

import java.util.*;

public class hangman_02 {
    public static void main(String[] args) {
        //making some variables
        boolean gameFinished = false;
        String input;
        String splitWord= "";
        String word = "cool";
        int amountOfGuesses = 0;
        String[] wordsGuessed;
        wordsGuessed = new String[]{"", "", "", "", "", "", "", "", "", ""};
        boolean wordCorrect = false;
        String[] wordArray = new String[word.length()];
        String[] userWord = new String[word.length()];
        int counter =0;
        int nextEmptyIndex =0;
        wordArray = word.split("(?!^)");
        while (!gameFinished ) {
            //Getting the input from the user
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a letter");
            input = userInput.nextLine();

            //check the user input
            for(int c =0; c <= word.length(); c++) {
                for (int i = wordArray.length - 1; i >= 0; i--) {
                    if (input.equals(wordArray[i])) {

                        wordCorrect = true;
                        userWord[i] = input;

                    }
                }

                if (wordCorrect) {
                    System.out.println("That letter is correct");
                    amountOfGuesses++;
                    counter++;
                    System.out.println(Arrays.toString(userWord));
                    wordCorrect = false;
                    break;

                } else {
                    System.out.println("The letter you guessed was incorrect");
                    amountOfGuesses++;
                    wordsGuessed[nextEmptyIndex] = input;
                    nextEmptyIndex++;
                    System.out.println("Letters Guessed: "+Arrays.toString(wordsGuessed));
                    break;
                }
            }
            //check if the user has finished the game
            if (Arrays.equals(userWord,wordArray)) {
                gameFinished = true;
                System.out.println("You have guessed all the letters in the word. The word was: " + word);
            }
            if(amountOfGuesses == 10)
            {
                gameFinished = true;
                System.out.println("Sorry, you have used all your 10 guesses");
            }
        }
       }
    }


