import java.util.Scanner;

public class Triangle14 {

    public static void main(String[] args) {

        int i, j, n;
        System.out.println("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++)
                System.out.print("");
            {

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("@ ");
            }


            System.out.println();
        }
    }

}