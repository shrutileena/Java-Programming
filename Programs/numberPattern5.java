import java.util.Scanner;
public class numberPattern5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Pattern: ");

        for(int i=1; i<=n; i++){
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
