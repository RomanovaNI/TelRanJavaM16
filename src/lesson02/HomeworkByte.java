package lesson02;

public class HomeworkByte {
    public static void main(String[] args) {
        findPerimeterByte();
        findSquareofByte();
    }

    // Quadrate, side 3
    // Find perimeter and square
    // byte a=132
    public static void findPerimeterByte() {
        byte a = (byte) 132;
        byte perimeter = (byte) (4 * a);
        System.out.println("Perimeter of Quadrate is:" + perimeter);
    }

    public static void findSquareofByte() {
        byte a = (byte) 132;
        byte square = (byte) (a * a);
        System.out.println("Square of Quadrat is:" + square);
    }
}

