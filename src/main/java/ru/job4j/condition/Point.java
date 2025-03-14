package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/*public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt((Math.pow((x2 - x1), 2)) + (pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, -1, 1, 2);
        System.out.println("result (0, -1) to (1, 2) " + result);
        result = Point.distance(1, 1, 12, 6);
        System.out.println("result (1, 1) to (12,6) " + result);
        result = Point.distance(6, 2, 3, 4);
        System.out.println("result (6, 2) to (3, 4) " + result);
    }
}*/

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(1, 2, 3);
        Point d = new Point(6, 7, 8);
        double distance = a.distance(b);
        double distance3d = d.distance3d(c);
        System.out.println(distance);
        System.out.println(distance3d);
    }
}
