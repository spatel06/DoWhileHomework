import java.util.Scanner;

public class SumNaturalNum12 {

    public static void main(String[] args) {

        int i, n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("The first natural numbers are : " + n);
       for(i=1;i<=n;i++) {
            System.out.println(i);
            sum += i;

        }
        System.out.println("The Sum of natural number upto "+n+ "terms : " +sum);


    }



}



