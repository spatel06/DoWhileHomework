import java.util.Scanner;

public class DoWhileMultiplication11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        int i = 0;
        do {
            System.out.println(num + "x" + i + "=" + num * i);
            i++;
        }while(i<=12);
        }
    }

