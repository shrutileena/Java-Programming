import java.util.Scanner;
public class fibonacciSeriesWithoutRecursion {

    public static void main(String[] args){

        int firstNum = 0;
        int secondNum = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total numbers you want in the series: ");
        int totalNumbers = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        System.out.print(firstNum + ", " + secondNum);

        for(int i=2; i<totalNumbers; i++){
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            System.out.print(", " + nextNum);
        }
    }
}
