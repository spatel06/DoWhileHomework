import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a string");
        str = sc.nextLine();
        ReverseString r = new ReverseString();
        r.reverseMethod(str);
        System.out.println("Reverse of a string is : ");
        int i = str.length();
        while(i>0){
            System.out.println(str.charAt(i-1));
            i--;
        }
    }

    private void reverseMethod(String str) {
    }
}
