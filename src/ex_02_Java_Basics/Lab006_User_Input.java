package ex_02_Java_Basics;

import java.util.Scanner;

public class Lab006_User_Input
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter name: ");
       String name= scanner.nextLine();
        System.out.println("Your name is: "+ name);
    }
}
