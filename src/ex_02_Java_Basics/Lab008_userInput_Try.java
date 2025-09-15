package ex_02_Java_Basics;

import java.util.Scanner;

public class Lab008_userInput_Try
{
    public static void main(String[] args) {

        try(Scanner scanner= new Scanner(System.in))
        {
            System.out.print("enter int1:");
            int i1= scanner.nextInt();
            System.out.println(i1);

            System.out.print("enter int2: ");
            int i2= scanner.nextInt();
            System.out.println(i2);

            int i3= i1/i2;
            System.out.println(i3);
        }
        catch (Exception e)
        {
            System.out.println("Error cached: "+ e);
        }
    }
}
