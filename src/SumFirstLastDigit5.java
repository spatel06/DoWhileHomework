import java.util.Scanner;

public class SumFirstLastDigit5 {

    public static void main(String[] args) {

        int num,first_digit,last_digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any five digit number");

        num = sc.nextInt();
        first_digit = num;
        while(first_digit >= 10){
            first_digit = first_digit / 10;

        }
        last_digit = num % 10;

        System.out.println("\n The  first digit of given number is  : " +num+"="+first_digit);
        System.out.println("\n The last digit of given num : " +num+"="+last_digit);
        System.out.println("\n Sum of first and last digit : " +(first_digit+last_digit));



    }
}
