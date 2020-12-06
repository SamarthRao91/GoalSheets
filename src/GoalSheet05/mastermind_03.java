package GoalSheet05;

import java.util.Arrays;
import java.util.Scanner;

public class mastermind_03 {
    public static void main(String[] args)
    {
        boolean gameWon = false;
        int nextEmptyIndex=0;
        int[] userGuesses = {0, 0,0,0,0};
        String[] win = new String[]{"black","black", "black", "black"};
        String[] guessFeedback = new String[4];
        int[] code = {6,6,8,4};

        while(!gameWon) {

            System.out.println("Please enter your first guess");
            Scanner userInputOne = new Scanner(System.in);
            int firstUserGuess = userInputOne.nextInt( );
            userGuesses[0] = firstUserGuess;
           // checkAnswer(code,guessFeedback,firstUserGuess,1);
            guessFeedback = checkAnswer(code,firstUserGuess,1, nextEmptyIndex);
            System.out.println(Arrays.toString(guessFeedback));
            //enter the second color input
            System.out.println("Please enter your second guess");
            Scanner userInputSecond = new Scanner(System.in);
            int secondUserGuess = userInputSecond.nextInt();
            userGuesses[1] = secondUserGuess;
            //checkAnswer(code,guessFeedback,secondUserGuess,2);
            guessFeedback = checkAnswer(code,firstUserGuess,2, nextEmptyIndex);
            System.out.println(Arrays.toString(guessFeedback));

            //third colour input
            System.out.println("Please enter your third guess");
            Scanner userInputThird = new Scanner(System.in);
            int thirdUserGuess = userInputThird.nextInt();
            userGuesses[2] = thirdUserGuess;
            //checkAnswer(code,guessFeedback,thirdUserGuess,3);
            guessFeedback = checkAnswer(code,firstUserGuess,3, nextEmptyIndex);
            System.out.println(Arrays.toString(guessFeedback));

            //fourth user input
            System.out.println("Please enter your fourth guess");
            Scanner userInputFourth = new Scanner(System.in);
           int fourthUserGuess = userInputFourth.nextInt();
            userGuesses[3] = fourthUserGuess;
            //checkAnswer(code,guessFeedback,fourthUserGuess,4);
            guessFeedback = checkAnswer(code,firstUserGuess,4, nextEmptyIndex);
            System.out.println(Arrays.toString(guessFeedback));

            //check if they have won the game
            if(Arrays.equals(guessFeedback, win))
            {
                gameWon = true;
                System.out.println("You have guessed the code correctly and won the game");
            }

        }
   }
   public static String[] checkAnswer(int[] code,int userGuess, int guessNumber, int nextEmptyIndex)
   {    int peg = 3;
       int blackCounter = 0;
       int whiteCounter = 0;
       String[] guessFeedback = new String[4];
       boolean isPeg = false;
       if(userGuess == code[guessNumber -1])
       {
           blackCounter++;
           guessFeedback[0] = "black";
           System.out.println("The guess returned a black peg");
           isPeg = true;
           guessFeedback[nextEmptyIndex] = "black";
           nextEmptyIndex++;
           System.out.println(nextEmptyIndex);
           return guessFeedback;
       }
       //check for the white pegs
       for(int i = code.length - 1; i >=0; i-- )
       {
           if(userGuess == code[i])
           {
               blackCounter++;
               guessFeedback[i] = "white";
               System.out.println("The guess returned a white peg");
               isPeg = true;
               guessFeedback[nextEmptyIndex] = "white";
               nextEmptyIndex++;
               System.out.println(nextEmptyIndex);
               return guessFeedback;
           }
       }
      //checking for no pegs matched
       if(!isPeg)
       {
           System.out.println("Your guess is not in the code");
           return guessFeedback;

       }

            return guessFeedback;
                }

}
    