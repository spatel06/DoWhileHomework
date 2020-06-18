import java.util.Scanner;

public class TotalOddEven3 {

    public static void main(String[] args) {

        int number,i,evenSum = 0,oddSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any number : ");
        number = sc.nextInt();

        for(i = 1; i <= number; i++){
            if(i % 2 == 0){
                evenSum = evenSum+i;

            }else {
                oddSum = oddSum+i;
            }
            System.out.println("\n The Sum of Even number upto : "+ number +"=" + evenSum);
            System.out.println("\n The Sum of Odd number upto: " + number + "=" + oddSum);

        }


        }
    }

