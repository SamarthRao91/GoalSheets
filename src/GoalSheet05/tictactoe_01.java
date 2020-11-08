package GoalSheet05;


import java.util.*;
public class tictactoe_01 {
    public static void main(String[] args) {
        //initialize other variables
        boolean gameWon = false;
        String turn = "X";



       String[] board;
       board = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " ",};

        while(!gameWon)
       {
           System.out.println("Select a tile to place on by entering a value 1 to 9 (top left of the board - to bottom right). X goes first. ");
           Scanner userSelection = new Scanner(System.in);
           int userInput = userSelection.nextInt();
          if(userInput > 0 && userInput <=9 && board[userInput - 1].equals(" "))
          {
             // System.out.println("Tester");
              board[userInput - 1] = turn;
              if(turn.equals("X"))
              {
                  turn = "O";
                  System.out.println("The turn has swapped to O");
              }
               else
              {
                  turn = "X";
                  System.out.println("The turn has swapped to X");
              }
          }
             else
              {
                  System.out.println("Please enter a valid input or that tile is already filled");
              }

          //check if the game has been won


             gameWon = checkIfWon(board);




       }


    }
    public static  boolean checkIfWon(String[] board )
    {
        String line = "";
        boolean gameIsWon = false;
       for(int i =1; i <= 8; i++)
       {
           if(i ==1)
           {
            line = board[0] + board[4] + board[8];
           }
           if(i ==2)
           {
               line = board[0] + board[3] + board[6];
           }
           if(i ==3)
           {
               line = board[2] + board[4] + board[6];
           }
           if(i ==4)
           {
               line = board[1] + board[4] + board[7];
           }
           if(i == 5)
           {
               line = board[0] + board[1] + board[2];
           }
           if(i == 6)
           {
               line = board[2] + board[5] + board[8];
           }
           if(i == 7)
           {
               line = board[3] + board[4] + board[5];
           }
           if(i == 8)
           {
               line = board[6] + board[7] + board[8];
           }
           if(line.equals("XXX")) {
               System.out.println("X has won the game!!");
               gameIsWon = true;
           }
           if(line.equals("OOO"))
           {
               gameIsWon = true;
               System.out.println("O has won the game");
           }
       }

        return gameIsWon;
    }

}

