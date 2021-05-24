package GoalSheet14;

import java.sql.SQLOutput;

public class isReverse_02 {

    public static void main(String[] args)
    {
        boolean i =  isReverse("ta", "at");
         System.out.println(i);


    }

    public static boolean isReverse(String word1, String word2)
    {
        if(word1.length() ==0 && word2.length() ==0)
        {
            return true;
        }
        if(word1.length() ==word2.length())
        {
            int stringLength = word2.length();
            char firstLetter = Character.toUpperCase(word1.charAt(0));
            char secondLetter = Character.toUpperCase(word2.charAt(stringLength - 1));




            if( firstLetter == secondLetter)
            {
                //recursive call

                //cut off the first letter of a and the last letter of b
                return isReverse(word1.substring(1), word2.substring(0, stringLength -1));
            }

        }
        return false;
    }

}
