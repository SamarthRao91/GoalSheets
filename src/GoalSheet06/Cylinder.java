package GoalSheet06;

public class Cylinder extends Sides implements ThreeDimensionalShape{
    public double getSurfaceArea()
    {
        double surfaceArea = ((2* super.pi * super.radius * super.height) + (2 * super.pi *(super.radius * super.radius)));
       return surfaceArea;
    }
    public double getVolume()
    {
        double volume  = (super.pi * (super.radius * super.radius) * super.height);
        return volume;
    }
}
