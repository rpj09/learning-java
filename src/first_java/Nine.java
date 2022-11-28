package first_java;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int int1  = input.nextInt();
        int int2  = int1;
        String numi = Integer.toString(int1);
        int num = 0;
        while (int1!= 0) {
            num += Math.pow((int1 % 10), numi.length());
            int1 = int1 / 10;
        }
        if(int2== num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
