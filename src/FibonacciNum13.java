import java.util.Scanner;

public class FibonacciNum13 {
    public static void main(String[] args) {

        int count,num1 = 0,num2 = 1;
        System.out.println("How many numbers you want in the sequence : " );
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci series of "+count+"numbers : ");
        int i = 1;
        while(i<=count){
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1+num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
