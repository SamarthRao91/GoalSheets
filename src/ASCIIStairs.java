public class ASCIIStairs {
    public static void main(String[] args) {
        int numberOfStairs = 6;
         String bottomBar = "                 ****";

        for (int i = numberOfStairs; i >= 0; i--) {
            printSpaces(i);
            System.out.print("             o");
            System.out.print("   *****  \n");
            printSpaces(i);
            System.out.print("            /|\\ *\n");
            printSpaces(i);
            System.out.print("            / \\ *\n");

        }
        for (int i = numberOfStairs; i >= 1; i--) {
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

