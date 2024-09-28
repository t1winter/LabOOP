package Lab01;
import java.util.Scanner;
public class ex_6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhap so hang, so cot
        System.out.println("Nhap so hang cua ma tran");
        int rows = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        // input 2 ma tran
        System.out.println("Nhap phan tu cua ma tran 1: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap phan tu cua ma tran 2: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // In 2 ma tran
        System.out.println("\n Ma tran 1: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n Ma tran 2: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        // print sum 2 ma tran
        System.out.println("\n Tong 2 ma tran la: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
