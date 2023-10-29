import java.util.Scanner;
public class triangleStarPattern2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Pattern: ");

        for(int l=0; l<(2*n); l++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=n-1; i>0; i--){
            for(int j=n-1; j>=i; j--){
                    System.out.print(" ");
            }
            System.out.print("*");
            if(i>1) {
                for(int k=1; k<(2*i-1); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
