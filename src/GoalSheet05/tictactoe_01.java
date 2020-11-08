package GoalSheet05;
import java.util.*;
public class tictactoe_01 {
    public static void main(String[] args) {
        //initialize other variables
        boolean gameWon = false;
        String turn = "X";



        String[][] board;
        board = new String[][]{{"-", "-", "-"},{ "-", "-", "-"},{ "-", "-", "-"}};
        System.out.println(
                "| | | |\n" +
                        "| | | |\n" +
                        "| | | |");

        while(!gameWon)
        {
                System.out.println("Select a tile to place on by entering the  row and the column value (top left of the board - to bottom right). X goes first. ");
                System.out.println("First enter the row");
                Scanner userSelectionRow = new Scanner(System.in);
            int userInputRow = userSelectionRow.nextInt();
            System.out.println("Then enter the column");
            Scanner userSelectioncolumn = new Scanner(System.in);
            int userInputColumn = userSelectioncolumn.nextInt();
            if(userInputRow > 0 &&userInputColumn >0 && userInputRow <=9 && userInputColumn <=9 && board[userInputRow - 1][userInputColumn - 1].equals("-"))
            {
                // System.out.println("Tester");
                board[userInputRow - 1][userInputColumn - 1] = turn;
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
            for (int row = 0; row < board.length; row++)
            {
                for (int col = 0; col < board[row].length; col++)
                {
                    System.out.printf("%s", board[row][col]);
                }
                System.out.println();
            }

            //check if the game has been won


            gameWon = checkIfWon(board);




        }


    }
    public static  boolean checkIfWon(String[][] board )
    {
        String line = "";
        boolean gameIsWon = false;
        for(int i =1; i <= 8; i++)
        {
            if(i ==1)
            {
                line = board[0][0]+ board[1][1] + board[2][2];
            }
            if(i ==2)
            {
                line = board[2][0] + board[1][1] + board[0][2];
            }
            if(i ==3)
            {
                line = board[0][0] + board[0][1] + board[0][2];
            }
            if(i ==4)
            {
                line = board[1][0] + board[1][1] + board[1][2];
            }
            if(i == 5)
            {
                line = board[2][0] + board[1][2] + board[2][2];
            }
            if(i == 6)
            {
                line = board[2][0] + board[0][0] + board[1][0];
            }
            if(i == 7)
            {
                line = board[0][1] + board[1][1] + board[1][2];
            }
            if(i == 8)
            {
                line = board[0][2] + board[1][2] + board[2][2];
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

