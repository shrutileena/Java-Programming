import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int temp = num;
        int size = Integer.toString(num).length();
        int sum = 0;

        for(int i=0; i<size; i++){
            int dig = num % 10;
            sum += Math.pow(dig, size);
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("It is an Armstrong Number.");
        } else {
            System.out.println("It is not an Armstrong Number.");
        }
    }
}
