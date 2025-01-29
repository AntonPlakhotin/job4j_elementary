package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, -1, 1, 2);
        System.out.println("result (0, -1) to (1, 2) " + result);
        result = Point.distance(1, 1, 12, 6);
        System.out.println("result (1, 1) to (12,6) " + result);
        result = Point.distance(6, 2, 3, 4);
        System.out.println("result (6, 2) to (3, 4) " + result);
    }
}
