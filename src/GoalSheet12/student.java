package GoalSheet12;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;
import java.io.*;
import java.util.Comparator;
import java.util.Scanner;

class student {
    String lastName, firstName, letterGrade;
    int ID;
    double gradePercentage;

    public student(String lastName, String firstName, String letterGrade, int ID, double gradePercentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradePercentage = gradePercentage;
        this.letterGrade = letterGrade;
        this.ID = ID;

    }
    public String toString() {
        return "Student: " + lastName + ", " + firstName  + ", " + ID + ", " + gradePercentage +  ", " + letterGrade + "\n";
    }

}

     class Sortbylastname implements Comparator<student> {
         public int compare(student o1, student o2) {
             return o1.lastName.compareTo(o2.lastName);
         }
     }

      class Sortbyfirstname implements Comparator<student> {
         public int compare(student o1, student o2) {
             return o1.firstName.compareTo(o2.firstName);
         }
     }

     class SortbyID implements Comparator<student> {
         public int compare(student o1, student o2) {
             return o2.ID - o1.ID;
         }
     }

     class Sortbypercentage implements Comparator<student> {
         public int compare(student o1, student o2) {
             return (int)(o2.gradePercentage - o1.gradePercentage);
         }
     }

     class Sortbyletter implements Comparator<student> {
         public int compare(student o1, student o2) {
             return o1.letterGrade.compareTo(o2.letterGrade);         }
     }

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String line;
        String word;
        ArrayList<student> students = new ArrayList<student>();
        //open the file, get input and close the file
        //file path stored in a string
        String filePath = "C:\\Users\\raosa\\IdeaProjects\\GoalSheets\\src\\GoalSheet12\\studentFile.txt";
        Scanner fileInput = new Scanner(new File(filePath));
        while(fileInput.hasNext())
        {
            String[] words;

            int Id;
            double gradePercentage;

            line = fileInput.nextLine();
            words = line.split("\\s+");

            Id = Integer.parseInt(words[2]);
            gradePercentage = Double.parseDouble(words[3]);
            //order of data - last name, first na me, ID, percentage, Grade
            //order of data needed for constructor -  lastName,  firstName,  letterGrade,  ID,  gradePercentage
            students.add(new student(words[0],words[1],words[4],Id, gradePercentage));
        }

         Scanner userChoice = new Scanner(System.in);
        System.out.println("How do you want to sort your data, \n 1- FirstName, 2 - LastName, 3 - ID, 4-letterGrade, 5- Percantage");
        System.out.print("\n");
        int input = userChoice.nextInt();

         if(input== 1)
         {
             Collections.sort(students, new Sortbyfirstname());
         }
         else if (input == 2) {

             Collections.sort(students, new Sortbylastname());
         }
         else if (input == 3) {

             Collections.sort(students, new SortbyID());
         }
         else if (input == 4) {

             Collections.sort(students, new Sortbyletter());
         }
         else if (input == 5) {

             Collections.sort(students, new Sortbypercentage());
         }





        System.out.println(students);






    }
}

