package GoalSheet06;

public class RectangularPrisim extends Sides implements ThreeDimensionalShape{

    public double getSurfaceArea() {
   //A=2(wl+hl+hw)
        double surfaceArea = (2 *(super.width * super.length) + (super.height * super.length) + (super.height * super.height));
         return surfaceArea;
    }


    public double getVolume() {
        double volume = (super.width * super.height * super.length);
        return volume;
    }
}
