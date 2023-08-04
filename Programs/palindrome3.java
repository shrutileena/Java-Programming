import java.util.Scanner;
public class palindrome3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        int temp = num;
        int r, revNum=0;

        while(num > 0){
            r = num % 10;
            revNum = (revNum * 10) + r;
            num = num / 10;
        }
        if(temp == revNum){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

    }
}
