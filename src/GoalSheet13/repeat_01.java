package GoalSheet13;

public class repeat_01 {
    public static void main(String[] args)
    {
       System.out.println(repeat("hello", 5));
    }
    public static String repeat(String text, int reps)
    {
        //base case is done
        if(reps == 0)
        {
            return  " ";
        }
        //recursive call
       return text + repeat(text, --reps);
    }
}
