package Lab01;
import java.util.Scanner;
public class ex6_3 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();   
    }
}

