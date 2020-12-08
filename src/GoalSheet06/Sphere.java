package GoalSheet06;

public class Sphere extends NoSides implements ThreeDimensionalShape{

    public double getSurfaceArea() {
        double sufaceArea = ((4*super.pi) *(super.radius * super.radius));
        return sufaceArea;
    }


    public double getVolume() {
       double volume = ((4/3)* super.pi *(super.radius * super.radius * super.radius) );
       return volume;
    }
}
