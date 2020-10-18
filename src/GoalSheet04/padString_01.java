package GoalSheet04;

public class padString_01 {

    public static void main(String[] args)
    {
       String paddedString = padString("hello", 5);
       System.out.println(paddedString);
    }
    //input - hello
    //output-            hello
    public static String padString(String value, int padding)
    {
        String startValue = value;
        for(int i = 0; i < padding; i++)
        {

            value = " " + value;
            if(value.equals(startValue))
            {
              return value;
            }

        }
        return value;
    }
}
