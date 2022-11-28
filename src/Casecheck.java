import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char i = input.next().trim().charAt(0);
        if(i>='a' && i<='z'){
            System.out.println("lowercase");
        }
        else if(i>='A' && i<='Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("invalid");
        }
    }
}
