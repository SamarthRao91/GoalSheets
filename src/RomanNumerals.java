public class RomanNumerals {
    public static void main(String[] args) {
      convertNumbers(1000);
    }
    public static void convertNumbers(int userInput)
    {
        String a = "";
       //1234

        int m1 = userInput  % 10; //4
        int m2 = userInput % 100; //34
        int m3 = userInput % 1000; //234
        int m4 = userInput % 10000; //1234

        int result1 = m4/1000;//1
        System.out.println(result1);
        int result2 = m3/100;//2
        System.out.println(result2);
        int result3 = m2/10;//3
        System.out.println(result3);
        int result4 = m1 /1;//4
        System.out.println(result4);

        //check result 1
        if(result1 == 1)
        {
             a = "M";
        }
        else if(result1 == 2)
        {
            a += "MM";
        }
        else if(result1 == 3)
        {
            a += "MMM";
        }

        //check result2

        if(result2 == 1)
        {
            a = "C";
        }
        else if(result2 == 2)
        {
            a += "CC";
        }
        else if(result2 == 3)
        {
            a += "CCC";
        }
        else if(result2 == 4)
        {
            a += "CD";
        }
        else if(result2 == 5)
        {
            a += "D";
        }
        else if(result2 == 6)
        {
            a += "DC";
        }
        else if(result2 == 7)
        {
            a += "DCC";
        }
        else if(result2 == 8)
        {
            a += "DCC";
        }
        else if(result2 == 9)
        {
            a += "CM";
        }

        //Check result#3
        if(result3 == 1)
        {
            a = "X";
        }
        else if(result3 == 2)
        {
            a += "XX";
        }
        else if(result3 == 3)
        {
            a += "XXX";
        }
        else if(result3 == 4)
        {
            a += "XL";
        }
        else if(result3 == 5)
        {
            a += "L";
        }
        else if(result3 == 6)
        {
            a += "LX";
        }
        else if(result3 == 7)
        {
            a += "LXX";
        }
        else if(result3 == 8)
        {
            a += "LXX";
        }
        else if(result3 == 9)
        {
            a += "XC";
        }

        //check result4
        if(result4 == 1)
        {
            a = "I";
        }
        else if(result4 == 2)
        {
            a += "II";
        }
        else if(result4 == 3)
        {
            a += "III";
        }
        else if(result4 == 4)
        {
            a += "IV";
        }
        else if(result4 == 5)
        {
            a += "V";
        }
        else if(result4 == 6)
        {
            a += "VI";
        }
        else if(result4 == 7)
        {
            a += "VII";
        }
        else if(result4 == 8)
        {
            a += "VII";
        }
        else if(result4 == 9)
        {
            a += "IX";
        }
     System.out.println(a);

    }
}
