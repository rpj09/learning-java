package first_java;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name  = input.nextLine();
        System.out.print("Hello ");
        System.out.println(name);
    }
}
