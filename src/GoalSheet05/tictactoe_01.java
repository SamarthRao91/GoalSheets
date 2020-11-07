package GoalSheet05;
import java.util.*;
public class tictactoe_01 {
    public static void main(String[] args) {
        //initialize other variables
        boolean gameWon = false;
        String turn = "X";



       String board[] = new String[9];

       while(!gameWon)
       {
           System.out.println("Select a tile to place on by entering a value 1 to 9 (top left of the board - to bottom right). X goes first. ");
           System.out.println(gameWon);
           Scanner userSelection = new Scanner(System.in);
           int userInput = userSelection.nextInt();
          if(userInput > 0 && userInput <=9 && board[userInput -1] == null )
          {
             // System.out.println("Tester");
              board[userInput - 1] = turn;
              if(turn.equals("X"))
              {
                  turn = "O";
              }
               else
              {
                  turn = "X";
              }
          }
             else
              {
                  System.out.println("Please enter a valid input or that tile is already filled");
              }

          //check if the game has been won


           gameWon =  checkIfWon(board, 0,1,2);
           gameWon =  checkIfWon(board, 0,4,8);
           gameWon =  checkIfWon(board, 2,4,6);
           gameWon =  checkIfWon(board, 3,4,5);
           gameWon =  checkIfWon(board, 0,3,6);
           gameWon =  checkIfWon(board, 1,4,7);
           gameWon =  checkIfWon(board, 2,5,8);
           gameWon =  checkIfWon(board, 6,7,8);



       }


    }
    public static boolean checkIfWon(String[] board ,  int firstValue, int secondValue, int thirdValue)
    {
        String X = "X";
        String O = "O";
        boolean gameIsWon = false;
        if (board[firstValue].equals(X) || board[firstValue].equals(O) && board[secondValue].equals(X) || board[secondValue].equals(O) && board[thirdValue].equals(X) || board[thirdValue].equals(O)  ) {
            gameIsWon = true;
        }
        return gameIsWon;
    }

}

