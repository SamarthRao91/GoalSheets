package GoalSheet05;

import java.util.Scanner;

public class mastermind_03 {
    public static void main(String[] args)
    {
        //declare variables
        boolean gameWon = false;
        int blackPegs=0;
        int whitePegs=0;
        int counter = 0;
        int checkForWhite;
        int[] userGuesses = {0, 0,0,0,0};
        String[] guessFeedback = new String[4];
        int[] code = {6,6,8,4};
        int  checkForBlack;
        while(!gameWon) {
            blackPegs = 0;
            whitePegs = 0;
            System.out.println("Please enter your first guess");
            Scanner userInputOne = new Scanner(System.in);
            int firstUserGuess = userInputOne.nextInt( );
            userGuesses[0] = firstUserGuess;
           // checkAnswer(code,guessFeedback,firstUserGuess,1);
            checkForBlack = checkAnswer(code,guessFeedback,firstUserGuess,1);
            if(checkForBlack ==1)
            {
                counter++;
                blackPegs++;
            }
            if(checkForBlack == 2)
            {
                whitePegs++;
            }
            System.out.println("So far, you have " + blackPegs + " black pegs and " + whitePegs + " white pegs");
            //enter the second color input
            System.out.println("Please enter your second guess");
            Scanner userInputSecond = new Scanner(System.in);
            int secondUserGuess = userInputSecond.nextInt();
            userGuesses[1] = secondUserGuess;
            //checkAnswer(code,guessFeedback,secondUserGuess,2);
            checkForBlack = checkAnswer(code,guessFeedback,secondUserGuess,2);
            if(checkForBlack ==1)
            {
                counter++;
                blackPegs++;

            }
            if(checkForBlack == 2)
            {
                whitePegs++;
            }
            System.out.println("So far, you have " + blackPegs + " black pegs and " + whitePegs + " white pegs");

            //third colour input
            System.out.println("Please enter your third guess");
            Scanner userInputThird = new Scanner(System.in);
            int thirdUserGuess = userInputThird.nextInt();
            userGuesses[2] = thirdUserGuess;
            //checkAnswer(code,guessFeedback,thirdUserGuess,3);
            checkForBlack = checkAnswer(code,guessFeedback,thirdUserGuess,3);
            if(checkForBlack ==1)
            {
                counter++;
                blackPegs++;

            }
            if(checkForBlack == 2)
            {
                whitePegs++;
            }
            System.out.println("So far, you have " + blackPegs + " black pegs and " + whitePegs + " white pegs");

            //fourth user input
            System.out.println("Please enter your fourth guess");
            Scanner userInputFourth = new Scanner(System.in);
           int fourthUserGuess = userInputFourth.nextInt();
            userGuesses[3] = fourthUserGuess;
            //checkAnswer(code,guessFeedback,fourthUserGuess,4);
            checkForBlack = checkAnswer(code,guessFeedback,fourthUserGuess,4);
            if(checkForBlack ==1) {
                counter++;
                blackPegs++;

            }
            if(checkForBlack == 2)
            {
                whitePegs++;
            }
            System.out.println("So far, you have " + blackPegs + " black pegs and " + whitePegs + " white pegs");

            //check if they have won the game
            if(blackPegs == 4)
            {
                gameWon = true;
                System.out.println("You have guessed the code correctly and won the game");
            }

        }


   }
   public static int checkAnswer(int[] code, String[] guessFeedback, int userGuess, int guessNumber)
   {    int peg = 3;
       int blackCounter = 0;
       int whiteCounter = 0;
       boolean isPeg = false;
      // int[] valuesChecked = new int[4];
       //0 is no peg

       //2 is a white peg

       //1 is a black peg
       // check for the black pegs
       if(userGuess == code[guessNumber -1])
       {
           blackCounter++;
           guessFeedback[0] = "black";
           System.out.println("The guess returned a black peg");
           isPeg = true;
           peg = 1;
           return peg;
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
               peg = 2;
               return peg;
           }
       }
      //checking for no pegs matched
       if(!isPeg)
       {
           System.out.println("Your guess is not in the code");
           return 3;

       }

            return peg;
                }

}
    