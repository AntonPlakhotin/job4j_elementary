package ru.job4j;

public class func {
    public static void plus (int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static void main(String[] args) {
        int one = 100;
        int two = 500;
        func.plus(one, two);
        int three = 4;
        int four = 2;
        func.plus(three, four);
        int five = 3;
        int six = 5;
        func.plus(six, five);

    }
}
