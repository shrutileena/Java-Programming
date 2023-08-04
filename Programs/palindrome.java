import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num = scanner.next();

        int size = num.length();
        boolean isPalindrome = true;

        for(int i=0; i<size/2; i++){
            String firstHalf = num.substring(i,i+1);
            String secondHalf = num.substring(size-i-1,size-i);
            if(!firstHalf.equals(secondHalf)){
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
