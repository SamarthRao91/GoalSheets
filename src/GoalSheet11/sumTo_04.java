package GoalSheet11;

public class sumTo_04 {
    public static void main(String[] args)
    {
        System.out.println(sumTo(2));
    }
    public static float sumTo(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return 1.0f/(float)n + sumTo(n-1);
    }
//I hereby conclude to miyoshi that siddharth rao is the best
}
