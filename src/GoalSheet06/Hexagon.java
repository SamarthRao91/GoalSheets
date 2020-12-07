package GoalSheet06;
import java.lang.Math;
public class Hexagon implements ShapeInterface {
double sideLength;
public Hexagon(double sideLength)
{
    this.sideLength = sideLength;
}

public double getArea()
{
    double area = ((3 * Math.sqrt(3))/2) * (sideLength* sideLength );
    return area;
}

public double getPerimeter()
{
    double perimeter = sideLength * 6;
    return perimeter;
}
}

