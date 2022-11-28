package first_java;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }
        else if(b>a){
            System.out.println("b is greater");
        }
    }
}
