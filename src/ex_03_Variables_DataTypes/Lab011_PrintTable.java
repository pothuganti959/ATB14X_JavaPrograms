package ex_03_Variables_DataTypes;
import java.util.Scanner;

public class Lab011_PrintTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value: ");
        int table = sc.nextInt();
        System.out.printf("%d X 1 = %d%n", table, table*1);
        System.out.printf("%d X 2 = %d%n", table, table*2);
        System.out.printf("%d X 3 = %d%n", table, table*3);
        System.out.printf("%d X 4 = %d%n", table, table*4);
        System.out.printf("%d X 5 = %d%n", table, table*5);
        System.out.printf("%d X 6 = %d%n", table, table*6);
        System.out.printf("%d X 7 = %d%n", table, table*7);
        System.out.printf("%d X 8 = %d%n", table, table*8);
        System.out.printf("%d X 9 = %d%n", table, table*9);
        System.out.printf("%d X 10 = %d%n", table, table*10);
    }
}
