// The system of first-degree equations (linear system) with two variables 
package Lab01;
import java.util.Scanner;
public class ex2_2_6_p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a11x1 + a12x2 = b1; a21x2 + a22x2 = b2");
        System.out.println("Nhap a11: ");
        double a11 = scanner.nextDouble();
        System.out.println("Nhap a12: ");
        double a12 = scanner.nextDouble();
        System.out.println("Nhap a21: ");
        double a21 = scanner.nextDouble();
        System.out.println("Nhap a22: ");
        double a22 = scanner.nextDouble();
        System.out.println("Nhap b1: ");
        double b1 = scanner.nextDouble();
        System.out.println("Nhap b2: ");
        double b2 = scanner.nextDouble();
        
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 & D2 == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Sol x1 = " + x1 + "x2 = " + x2);
        }
        scanner.close();
    }
}
