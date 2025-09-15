package ex_02_Java_Basics;

public class Lab003_Main_Structure
{
    public static void main(String[] Aish) {
        System.out.println("this is main method");
        main("calling...");
        main();
    }

    public static void main(String args) {
        System.out.println("this is dummy main");
    }

    public static void main() {
        System.out.println("this is dummy main 2" );
    }
}
