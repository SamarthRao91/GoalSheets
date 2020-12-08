package GoalSheet06;

public class Cuboid extends Sides implements ThreeDimensionalShape {

    public double getSurfaceArea() {
        double surfaceArea = (6 * (super.edge * super.edge));
        return surfaceArea;
    }


    public double getVolume() {
        double volume = (super.edge * super.edge * super.edge);
        return volume;
    }
}
