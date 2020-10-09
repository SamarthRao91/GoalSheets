public class PrintRange {
    public static void main(String[] args) {
       printRange(5, 10);
    }
    public static void printRange(int start, int end)
    {
        if(start > end)
        {
            for(int i = start - 1; i > end; i--)
            {
                System.out.println(i);
            }
        }
        else if(start == end)
        {
            System.out.println(start);
        }
        else {
            for (int i = start + 1; i < end; i++) {
                System.out.println(i);
            }
        }
    }
}
