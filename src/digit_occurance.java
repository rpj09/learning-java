import java.util.Scanner;

public class digit_occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long digit = input.nextLong();
        int count = 0;
        while(num>0){
            long rem = num%10;
            if(rem==digit){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
