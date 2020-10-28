package GoalSheet03;

public class PrintRange {
    public static void main(String[] args) {
       printRange(1, 100);
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
        {  System.out.print("{");
            System.out.println(start);
            System.out.print("}");
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
