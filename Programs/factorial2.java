import java.util.Scanner;
public class factorial2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int result = 1;

        for(int i=num; i>0; i--){
            result = result * i;
        }

        System.out.println("Factorial: " + result);
    }
}
