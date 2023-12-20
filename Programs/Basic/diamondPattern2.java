import java.util.Scanner;
public class diamondPattern2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Pattern:");
        for(int i=0; i<n; i++){
            for(int k=n-1; k>i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int k=n-1; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
