
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int i=0;
        int j=str.length()-1;
        while (i<=j) {
            if (str.charAt(i)!=str.charAt(j)){
                System.out.println("Not palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }   
}
