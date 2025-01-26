package ru.job4j;

public class MathFunction {
    public static int func1(int x) {
        int y = x*x +1;
        return y;
    }
    public static int func2(int x) {
        int y1 = 1/x;
        return y1;
    }
    public static void main(String[] args) {
        int resul1 = func1(100);
        int resul2 = func2(100);
        int total = resul1 + resul2;
        System.out.println(total);
    }
}
