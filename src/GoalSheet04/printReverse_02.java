package GoalSheet04;

public class printReverse_02 {
public static void main(String[] args)
{
    String inputValue = "My name is Samarth Rao";
    String backwardsInput;
    backwardsInput = printReverse(inputValue);
    System.out.println(backwardsInput);


}

public static String printReverse(String input)
{

    String reversedString;
    String start = "";

    for(int i = input.length()-1; i >= 0; i-- )
    {

        reversedString = "" + input.charAt(i);
       start = start + reversedString;

    }
    return start;
}
}

