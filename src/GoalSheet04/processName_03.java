package GoalSheet04;

public class processName_03 {
    public static void main(String[] args)
    {
      processesName("Hi my name is Samarth");

    }
    public static void processesName(String input)
    {
        String[] nameArray = input.split("\\s");
        int arrayCounter = nameArray.length;
        for(int i =nameArray.length; i >= 1; i--)
        {
            System.out.print(nameArray[i-1] + " ");
        }
    }
}
