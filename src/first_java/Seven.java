package first_java;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        //fibbonacci series
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int a = 0,b= 1;
        for(int i=2;i<=n;i++){
            int c = b;
            b = b+a;
            a = c;
        }
        System.out.println("");
        System.out.println("fibbonacci number of "+n+"th term is "+b);

        }
}

