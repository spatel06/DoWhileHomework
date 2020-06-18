import java.util.Scanner;

public class SumSquares17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = 0;
        int sum = 0;
        while(num<=Math.sqrt(100)){
            square = (num * num);
           // if(square >=100){break;}
            sum = sum + square;
            num++;

        }
        System.out.println(sum);

    }
}
