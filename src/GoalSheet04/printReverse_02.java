package GoalSheet04;

public class printReverse_02 {
public static void main(String[] args)
{
    String backwardsInput;
    backwardsInput = printReverse("Samarth");
    System.out.println(backwardsInput);

}

public static String printReverse(String input)
{

    String reversedString;
    String start = "";

    for(int i = input.length(); i >=0; i-- )
    {
        System.out.println("Hello World");
        reversedString = "" + input.charAt(i);
       start = start + reversedString;

    }
    return start;
}
}

