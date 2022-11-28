import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temprature in celsius");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius*9/5)+32;
        System.out.println("The temprature in fahrenhiet is " + fahrenheit);
    }
}
