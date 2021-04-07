package GoalSheet12;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;
import java.io.*;
import java.util.Comparator;

class student {
     String lastName, firstName, letterGrade;
     int ID, gradePercentage;

     public student(String firstName, String lastName, String letterGrade, int ID, int gradePercentage) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.gradePercentage = gradePercentage;
         this.letterGrade = letterGrade;
         this.ID = ID;

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
             return o1.ID - o2.ID;
         }
     }

     class Sortbypercentage implements Comparator<student> {
         public int compare(student o1, student o2) {
             return o1.gradePercentage - o2.gradePercentage;
         }
     }

     class Sortbyletter implements Comparator<student> {
         public int compare(student o1, student o2) {
             return o1.letterGrade.compareTo(o2.letterGrade);         }
     }

 }
class Main {
    public static void main(String[] args) {
        ArrayList<student> school = new ArrayList<student>();
        school.add(new student("bob", "joe", "A", 9334, 97));
        school.add(new student("rob", "steve", "C", 9462, 75));
        school.add(new student("todd", "jim", "F", 9432, 32));

        Collections.sort(school, new Sortbyfirstname());
    }
}

