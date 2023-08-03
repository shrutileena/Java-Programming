import java.util.Scanner;
public class fibonacciSeriesWithRecursion2 {

    private static int firstNum = 0;
    private static int secondNum = 1;
    private static void printFibonacci(int n){
        if(n>0){
            int nextNum = firstNum + secondNum;
            System.out.print(", " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
            printFibonacci(n-1);
        }
    }

    public static void main(String args[]){

        System.out.println("Enter the total numbers you want in the series: ");
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = scanner.nextInt();
        System.out.println("Fibonacci Series: ");
        System.out.print(firstNum + ", " + secondNum);
        printFibonacci(totalNumbers-2);
    }
}
