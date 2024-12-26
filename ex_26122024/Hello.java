package ex_26122024;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Scanner scan_input = new Scanner(System.in);
        System.out.print("Type your Name:\t");
        String myName = scan_input.nextLine();
        System.out.println("My Name is "+myName);
        System.out.print("Type your Age:\t");
        int Age = scan_input.nextInt();
        System.out.println("My Age is "+Age);
        scan_input.nextLine();
        System.out.print("Type your Address:\t");
        String Address = scan_input.nextLine();
        System.out.println("My address is "+Address);
    }
}
