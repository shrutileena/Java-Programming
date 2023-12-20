import java.util.Scanner;
public class factorial {

    public static int calcFactorial(int num){
        if(num == 1){
            return num;
        }
        return num * calcFactorial(num-1);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Factorial: " + calcFactorial(num));
    }
}
