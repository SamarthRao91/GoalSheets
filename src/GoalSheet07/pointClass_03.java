package GoalSheet07;

import org.jetbrains.annotations.NotNull;

public class pointClass_03 implements Comparable<pointClass_03> {
    int x;
    int y;

    //constructor
    public pointClass_03(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }


    public double distanceFromOrgin() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return "( " + x + " , " + y + " ) ";
    }


    public void transalate(int tx, int ty) {
        x += tx;
        y += ty;
    }

    public int compareTo(@NotNull pointClass_03 other) {
     return 0;
    }
}