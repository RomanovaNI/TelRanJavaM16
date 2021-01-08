package lesson02;

public class HomeworkTwoInt {
    public static void main(String[] args) {

        findPerimeterOfQuadrate();
        findSquareofQuadrate();
        findPerimeter();
        findSquare();
        findPerimeterOfRectangle();
        findSquareofRectangle();
        exercise02();
    }

    // Rectangle, sides 2 and 7
    // Find perimeter and square
    // int a=2
    // int b=7
    public static void findPerimeterOfRectangle() {
        int a = 2;
        int b = 7;
        int perimeter = 2 * (a + b);
        System.out.println("Perimeter of Rectangle is:" + perimeter);
    }

    public static void findSquareofRectangle() {
        int a = 2;
        int b = 7;
        int square = a * b;
        System.out.println("Square of Rectangle is:" + square);
    }

    // Quadrate, side 3
    // Find perimeter and square
    // int a=3
    public static void findPerimeterOfQuadrate() {
        int a = 3;
        int perimeter = 4 * a;
        System.out.println("Perimeter of Quadrate is:" + perimeter);
    }

    public static void findSquareofQuadrate() {
        int a = 3;
        int square = a * a;
        System.out.println("Square of Quadrat is:" + square);
    }

    // Cube, one side 10;
    // Find square and perimeter;
    // int a=10;


    public static void findPerimeter() {
        int a = 10;
        int perimeter = 12 * a;
        System.out.println("Perimeter of Cube is: " + perimeter);
    }

    public static void findSquare() {
        int a = 10;
        int quadratSquare = a * a;
        int cubeSquare = 6 * quadratSquare;
        System.out.println("Cube Square is:" + cubeSquare);

    }

    public static void exercise02() {
        int a, b, square, perimeter;
        a = 5;
        b = 10;
        perimeter = (a + b) * 2;
        square = a * b;
        System.out.println("perimeter " + perimeter);
        System.out.println("square " + square);
    }
}
