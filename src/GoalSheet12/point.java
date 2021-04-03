package GoalSheet12;

import java.lang.Math;

public class point implements Comparable<point> {
    private float x;
    private float y;

    public point(float x, float y)
    {
      this.x = x;
      this.y = y;
    }
    public int compareTo(point o)
    {
        final double distance = Math.sqrt((x -0)*(x-0)) +((y -0)*(y-0));
        final double otherDistance =Math.sqrt((o.x -0)*(o.x-0)) +((o.y -0)*(o.y-0));


        return (int) (distance - otherDistance);
    }
}

