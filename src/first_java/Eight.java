package first_java;

import java.util.Scanner;
//palindrome
public class Eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next() , rev = "";
        for(int i = 0 ; i<str.length() ; i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}
