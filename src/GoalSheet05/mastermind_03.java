package GoalSheet05;

import java.util.Scanner;

public class mastermind_03 {
    public static void main(String[] args)
    {
        //declare variables
        String[] userGuesses = new String[6];
        String[] guessFeedback = new String[4];
        //make mastermind code
        String[] code = {"red", "blue", "green", "purple", "orange", "yellow"};
        //get the user input
        //first user color input
        System.out.println("Please enter your first guess");
        Scanner userInputOne = new Scanner(System.in);
        String firstUserGuess = userInputOne.next();
        userGuesses[1] = firstUserGuess;
        //enter the second color input
        System.out.println("Please enter your second guess");
        Scanner userInputSecond = new Scanner(System.in);
        String secondUserGuess = userInputSecond.next();
        userGuesses[2] = secondUserGuess;
        //third colour input
        System.out.println("Please enter your third guess");
        Scanner userInputThird = new Scanner(System.in);
        String thirdUserGuess = userInputThird.next();
        userGuesses[3] = thirdUserGuess;
        //fourth user input
        System.out.println("Please enter your fourth guess");
        Scanner userInputFourth = new Scanner(System.in);
        String fourthUserGuess = userInputFourth.next();
        userGuesses[4] = fourthUserGuess;
        ///fifth user input
        System.out.println("Please enter your fifth guess");
        Scanner userInputFifth = new Scanner(System.in);
        String fifthUserGuess = userInputFifth.next();
        userGuesses[5] = firstUserGuess;
        //sixth user input
        System.out.println("Please enter your sixth guess");
        Scanner userInputSixth = new Scanner(System.in);
        String sixthUserGuess = userInputSixth.next();
        userGuesses[6] = sixthUserGuess;
        //check the user input

        //check if they have won the game

    }
}
