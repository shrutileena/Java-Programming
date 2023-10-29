import java.util.Scanner;

public class numberPattern3 {
    private static int digit = 1;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Pattern: ");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(digit);
            }
            digit++;
            System.out.println();
        }
    }
}
