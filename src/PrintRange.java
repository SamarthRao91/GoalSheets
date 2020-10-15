public class PrintRange {
    public static void main(String[] args) {
       printRange(10000, 1);
    }
    public static void printRange(int start, int end)
    {
        if(start > end)
        { System.out.print("{");
            for(int i = start ; i >= end; i--)
            {
                System.out.print(i+ " ,");
            }
            System.out.print("}");
        }
        else if(start == end)
        {
            System.out.println(start);
        }
        else {
            System.out.print("{");
            for (int i = start; i <=end; i++) {
                System.out.print(i + " ,");

            }
            System.out.print("}");
        }
    }
}
