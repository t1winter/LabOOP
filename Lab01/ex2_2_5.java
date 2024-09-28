package Lab01;
import java.util.Scanner;
public class ex2_2_5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Num2: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("quotient is not defined.");
        }
        scanner.close();
    }
}
