import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ArmstrongNumber6 {


    public static void main(String[] args) {

        int num, number, temp, total = 0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        number = num;

        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;

        }
        if (total == num) {
            System.out.println(num + " is an Armstrong number");


        } else
            System.out.println(num + "is not an Armstrong number");
    }

}


