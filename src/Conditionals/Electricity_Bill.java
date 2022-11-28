package Conditionals;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int units = input.nextInt();
        int bill = 0;
        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = 100 * 10 + (units - 100) * 15;
        } else if (units <= 300) {
            bill = 100 * 10 + 100 * 15 + (units - 200) * 20;
        } else {
            bill = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25;
        }
        System.out.println(bill);
    }
}
