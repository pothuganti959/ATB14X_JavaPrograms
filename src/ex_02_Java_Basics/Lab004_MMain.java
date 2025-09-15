package ex_02_Java_Basics;

public class Lab004_MMain
{
    public static void Main(String[] args) {
        System.out.println("this is not main method");
    }


    public static void main(String[] args) {
//        Main({"main", "call"});
        Main(new String[]{"main", "call"});
        System.out.println("this is main");
    }

}
