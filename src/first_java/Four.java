package first_java;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String operator = input.next();
        if(operator.equals("+")){
            System.out.println(num1+num2);
        }
        else if(operator.equals("-")){
            System.out.println(num1-num2);
        }
        else if(operator.equals("*")){

            System.out.println(num1*num2);
        }
        else if(operator.equals("/")){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Invalid operator");
        }
    }
}
