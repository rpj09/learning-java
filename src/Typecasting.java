import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //typecasting
        int num = (int)(78.322f);//it returns only integer value of passed float value
        System.out.println(num);
        int a = 257;
        byte bj = (byte)(a); //257%256=1
        System.out.println(bj);

        byte ba = 40;
        byte ca = 70;
        byte da = 100;
        int ma = ba*ca/da; //here ba*ca is > than 256 which cannot be stored into a byte so java promoted its type to int
        //all the byte,character,short values are promoted to integer
        //if any of your operation is type long then whole expression is prototed to long
        System.out.println(ma);

        byte ga = 50;
        //ga = b*2;// it is wrong as while doing b*2 java will promote the expression's type to int which further cannot be stored in b which is byte
        int numi = 'A';
        System.out.println(numi); //it will give ascii code of numi as we are storing character into integer data type

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f*b)+(i/c)-(d*s);
        // float +int - double = double
        System.out.println((f*b)+ " " + (i/c) + " " +(d*s));
        System.out.println(result);

    }
}
