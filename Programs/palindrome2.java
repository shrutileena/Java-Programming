import java.util.Scanner;
import java.lang.String;
public class palindrome2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num = scanner.next();
        int size = num.length();
        boolean isPalindrome = true;

        for (int i=0; i<size/2; i++){
            if(num.charAt(i) != num.charAt(size-i-1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }
}
