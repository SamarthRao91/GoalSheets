package GoalSheet06;


public class Cone extends NoSides implements ThreeDimensionalShape {


    public double getSurfaceArea() {
       double surfaceArea = (super.pi * super.radius *(super.radius + Math.sqrt((super.height * super.height) * (super.radius * super.radius))));
        return surfaceArea;
    }


    public double getVolume() {
        double volume = (super.pi * (super.radius * super.radius) * (super.height/3));
        return volume;
    }
}