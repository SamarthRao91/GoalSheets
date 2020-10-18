package GoalSheet02;
public class Triangle {
    public static void main(String[] args) {

        triangle(1,1.414,1);

    }

    public static void triangle(double side1, double side2, double side3)
    {
        //Calculating first Angle
       double CosineA = ((side2 *side2) + (double)(side3 * side3)  - (double)(side1 * side1))/(2*side2*side3);

         double ArcSineA = Math.acos(CosineA);
         ArcSineA =ArcSineA * (180/3.14);

        double Angle1 = ArcSineA;
        System.out.println("First Angle: " + Angle1 + "\n");
        //End of Calculating first Angle

        //Start OF Calculating 2nd angle
        double CosineB = ((double)(side3 *side3) + (double)(side1 * side1)  - (double)(side2 * side2))/(2*side3*side1);

        double ArcSineB = Math.acos(CosineB);
        ArcSineB =ArcSineB * (180/3.14);
        double Angle2 = ArcSineB;
        System.out.println("Second Angle: " + Angle2 + "\n");
        //end of calculation second angle

        // Calculate 3rd angle
        double Angle3 = 180 - (Angle1 + Angle2);
        System.out.println("Third Angle: " + Angle3);
        //end of calculating third angle

  
    }

}
