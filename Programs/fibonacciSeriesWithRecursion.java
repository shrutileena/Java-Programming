import java.util.Scanner;
public class fibonacciSeriesWithRecursion {
    public static int count =0;
    public static void main(String[] args){

        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Enter the total numbers you want in the series");
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        System.out.print(firstNum + ", " + secondNum);

        calcNextNum(firstNum, secondNum, totalNumbers);

    }

    private static void calcNextNum(int firstNum, int secondNum, int totalNumbers) {
        count++;
        if(count <= totalNumbers-2){
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            System.out.print(", " + nextNum);
            calcNextNum(firstNum, secondNum, totalNumbers);
        }
    }
}