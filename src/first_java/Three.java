package first_java;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("The simple interest is " + si);
    }
}
