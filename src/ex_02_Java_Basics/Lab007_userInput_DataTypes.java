package ex_02_Java_Basics;
import java.util.Scanner;

public class Lab007_userInput_DataTypes {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s= scanner.nextLine();
        System.out.println("You entered: " + s);

        System.out.print("Enter a Integer: ");
        int i= scanner.nextInt();
        System.out.println(i);

        System.out.print("Enter a Double: ");
        double d= scanner.nextDouble();
        System.out.println(d);

        System.out.print("Enter a float: ");
        float f= scanner.nextFloat();
        System.out.println(f);

        System.out.print("Enter a boolean: ");
        boolean b= scanner.nextBoolean();
        System.out.println(b);

        System.out.print("Enter 2 strings: ");
        String s1= scanner.next();
        System.out.println(s1);
    }
}
