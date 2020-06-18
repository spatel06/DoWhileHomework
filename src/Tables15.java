import java.util.Scanner;

public class Tables15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
       // int num = sc.nextInt();

        int i = sc.nextInt();


        while(i <=10){
            int j = 0;
            while(j <= 10){
                j+= 2;
                System.out.println(i*j);

            }
            System.out.println();
            i+=2;
        }
    }

}
