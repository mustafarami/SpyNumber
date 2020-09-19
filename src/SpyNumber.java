import java.util.Scanner;

/*
What is Spy Number?
 A Spy number is a number where the sum of its digits equals to the multiplication of its number.

Example:
 1124 is a spy number
 1+1+2+4 = 8
 1*1*2*4 = 8
*/

public class SpyNumber {


    public static void main(String[] args) {
        int number, digit, mul = 1, sum = 0;
        String result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        number = input.nextInt();
        int num = number;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            mul = mul * digit;
            number = number / 10;
        }

        result = sum == mul ? " is a Spy Number" : " is not a Spy Number";
        System.out.println(num + result);

    }

}