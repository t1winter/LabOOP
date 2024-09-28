// The second-degree equation with one variable 
package Lab01;
import java.util.Scanner;
public class ex2_2_6_p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();


        if (a==0) {
            System.out.println("a cannot be 0");
        } else {
            double delta = b*b - 4*a*c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("2 nghiem x1 = " + x1 + " x2 = " + x2);
            } else if (delta == 0) {
                double x0 = -b / (2 * a);
                System.out.println("Nghiem kep x = " + x0);
            } else {
                System.out.println("Vo nghiem");
            }
        }
        scanner.close();
    }
}

