// The first-degree equation (linear equation) with one variable 
package Lab01;
import java.util.Scanner;
public class ex2_2_6_p1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        if (a==0) {
            System.out.println("a cannot be 0");
        } else {
            double x = -b/a;
            System.out.println("Sol x = " + x);
        }
        scanner.close();
    }
}
