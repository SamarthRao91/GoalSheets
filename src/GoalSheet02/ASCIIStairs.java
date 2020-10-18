package GoalSheet02;

public class ASCIIStairs {
    public static void main(String[] args) {
        int numberOfStairs = 4;
         String bottomBar = "                 ****";
         String sideLine = "*";
       for (int i = numberOfStairs; i >= 0; i--) {
           sideLine = "      "+sideLine;
        }

        for (int i = numberOfStairs; i >= 0; i--) {
            printSpaces(i);
            System.out.print("             o");
            System.out.print("   *****  \n");
            printSpaces(i);
            System.out.print("            /|\\ *\n");
            printSpaces(i);
            System.out.print("            / \\ *"+sideLine+"\n");



        }



        for (int i = numberOfStairs; i >= 0; i--) {
            bottomBar = bottomBar + "******";
        }
        System.out.println(bottomBar);
    }
    public static void printSpaces(int ammount)
    {       
        for(int d = 0; d <= ammount; d++ ) {
            System.out.print("     ");
        }
    }

}

