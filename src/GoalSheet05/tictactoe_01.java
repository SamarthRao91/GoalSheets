package GoalSheet05;
import java.io.*;
import java.util.*;
public class tictactoe_01 {
    public static void main(String[] args) {
        //initialize other variables
        boolean gameWon = false;
        String turn = "X";

        String X = "X";
        String O = "O";

       String board[] = new String[9];

       while(!gameWon)
       {
           System.out.println("Select a tile to place on by entering a value 1 to 9 (top left of the board - to bottom right). X goes first. ");
           Scanner userSelection = new Scanner(System.in);
           int userInput = userSelection.nextInt();
          if(userInput > 0 && userInput <=9)
          {
             // System.out.println("Tester");
              board[userInput - 1] = turn;
              if(turn == "X")
              {
                  turn = "O";
              }
              else if(turn == "O")
              {
                  turn = "X";
              }
          }

          //check if the game has been won
           if (board[0] == X || board[0] == O && board[4] == X || board[4] == O && board[8] == X || board[8] == O  ) {
               gameWon = true;
           }
           if (board[0] == X || board[0] == O && board[1] == X || board[1] == O && board[2] == X || board[2] == O  ) {
               gameWon = true;
           }
           if (board[0] == X || board[0] == O && board[3] == X || board[3] == O && board[6] == X || board[6] == O  ) {
               gameWon = true;
           }
           if (board[1] == X || board[1] == O && board[4] == X || board[4] == O && board[7] == X || board[7] == O  ) {
               gameWon = true;
           }
           if (board[2] == X || board[2] == O && board[4] == X || board[4] == O && board[6] == X || board[6] == O  ) {
               gameWon = true;
           }
           if (board[2] == X || board[2] == O && board[5] == X || board[5] == O && board[8] == X || board[8] == O  ) {
               gameWon = true;
           }
           if (board[3] == X || board[3] == O && board[4] == X || board[4] == O && board[5] == X || board[5] == O  ) {
               gameWon = true;
           }
           if (board[6] == X || board[6] == O && board[7] == X || board[7] == O && board[8] == X || board[8] == O  ) {
               gameWon = true;
           }
       }


    }

}

