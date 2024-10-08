import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;

        do {
            System.out.print("Enter the width of the rectangle (positive number): ");
            width = scanner.nextDouble();
            if (width <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (width <= 0);


        do {
            System.out.print("Enter the height of the rectangle (positive number): ");
            height = scanner.nextDouble();
            if (height <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (height <= 0);


        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));


        System.out.printf("Area of the rectangle: %.2f%n", area);
        System.out.printf("Perimeter of the rectangle: %.2f%n", perimeter);
        System.out.printf("Length of the diagonal: %.2f%n", diagonal);


        scanner.close();
    }
}