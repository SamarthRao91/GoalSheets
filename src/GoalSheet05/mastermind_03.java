package GoalSheet05;

import java.util.Scanner;

public class mastermind_03 {
    public static void main(String[] args)
    {
        //declare variables
        boolean gameWon = false;
        int counter =0;
        int[] userGuesses = {0, 0,0,0,0};
        String[] guessFeedback = new String[4];
        //make mastermind code
        int[] code = {0, 0, 0, 0};
        //get the user input
        //first user color input
        while(!gameWon) {
            System.out.println("Please enter your first guess");
            Scanner userInputOne = new Scanner(System.in);
            int firstUserGuess = userInputOne.nextInt( );
            userGuesses[0] = firstUserGuess;
            //enter the second color input
            System.out.println("Please enter your second guess");
            Scanner userInputSecond = new Scanner(System.in);
            int secondUserGuess = userInputSecond.nextInt();
            userGuesses[1] = secondUserGuess;
            //third colour input
            System.out.println("Please enter your third guess");
            Scanner userInputThird = new Scanner(System.in);
            int thirdUserGuess = userInputThird.nextInt();
            userGuesses[2] = thirdUserGuess;
            //fourth user input
            System.out.println("Please enter your fourth guess");
            Scanner userInputFourth = new Scanner(System.in);
           int fourthUserGuess = userInputFourth.nextInt();
            userGuesses[3] = fourthUserGuess;

            //check the user input
            for (int i = 0; i <= code.length; i++) {
                if (userGuesses[i] == (code[i])) {
                    guessFeedback[i] = "black";
                }

            }
            //check if they have won the game
            for(int i = guessFeedback.length -1; i >=0; i--)            {
                if(guessFeedback[i].equals("black"))
                {
                    counter++;
                }
            }
            if(counter == 4)
            {
                gameWon = true;
                System.out.println("You have won the game");
            }
        }

        
    }
}
