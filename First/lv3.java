import java.util.Random;
import java.util.Scanner;

public class lv3 {
    public static void main (String[] args){
        System.out.print("输入对称矩阵的行列数：");
        Scanner sc = new Scanner(System.in);
        int rowline = sc.nextInt();
        int a[][] = new int[rowline][rowline];
        int b[][] = new int[rowline][rowline];
        int c[][] = new int[rowline][rowline];
        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < a[i].length ; j++) {
                Random ramd = new Random();
                int value = ramd.nextInt(10);
                a[i][j] = value;
            }
        }
        System.out.println("Output matrix a : ");
        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < a[i].length ; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0 ; i < b.length ; i++) {
            for (int j = 0 ; j < b[i].length ; j++) {
                Random ramd = new Random();
                int value = ramd.nextInt(10);
                b[i][j] = value;
            }
        }
        System.out.println("Output matrix b : ");
        for (int i = 0 ; i < b.length ; i++) {
            for (int j = 0 ; j < b[i].length ; j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < a.length ; j++) {
                for (int k = 0 ; k < a.length ; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Output two matrixes' product : ");
        for (int i = 0 ; i < c.length ; i++) {
            for (int j = 0 ; j < c[i].length ; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
