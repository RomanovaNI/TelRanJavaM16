package lesson02;

public class HomeworkShort {
    public static void main(String[] args) {
        findShortPerimeter();
        findShortSquare();
    }

    // Rectangle, sides 8 and 12
    // Find perimeter and square
    // short a=8
    // short b=12
    public static void findShortPerimeter() {
        short a = 8;
        short b = 12;
        short perimeter = (short) (2 * (a + b));
        System.out.println("Perimeter of Rectangle is:" + perimeter);
    }

    public static void findShortSquare() {
        short a = 8;
        short b = 12;
        short square = (short) (a * b);
        System.out.println("Square of Rectangle is:" + square);
    }
}









