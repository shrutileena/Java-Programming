import java.util.Scanner;
public class leftPascalsTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Pattern:");
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=n-1; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
