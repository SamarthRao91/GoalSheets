package GoalSheet03;

public class Repl {

    public static void main(String[] args) {
        String result;


        result = repl("hello",10);
        System.out.println(result);
    }
    public static String repl(String value, int repetitions )
    {  String start = "";
        for(int i = 0; i < repetitions; i++)
        {

            start = start + value;

        }

        return start;
    }

}