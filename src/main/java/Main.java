import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        // I used this formula instead, yours was weird.
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        System.out.printf("The area of the hexagon is: %.2f\n", area);
    }
}