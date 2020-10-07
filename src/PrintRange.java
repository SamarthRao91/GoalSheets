public class PrintRange {
    public static void main(String[] args) {
       printRange(3, 5);
    }
    public static void printRange(int start, int end)
    {
        if(start > end)
        {
            for(int i = end +1; i < start; i++)
            {
                System.out.println(i);
            }
        }
        else if(start == end)
        {
            System.out.println(" There is no range");
        }
        else {
            for (int i = start + 1; i < end; i++) {
                System.out.println(i);
            }
        }
    }
}
