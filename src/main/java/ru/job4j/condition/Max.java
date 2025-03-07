package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public static int max(int one, int two, int three) {
        int result = three > max(one, two) ? three : max(one, two);
        return result;
    }

    public static int max(int one, int two, int three, int four) {
        int result = four > max(one, two, three) ? four : max(one, two, three);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 2));
        System.out.println(max(3, 2, 5));
        System.out.println(max(3, 2, 5, 7));

    }
}
