import java.util.Scanner;
public class numberPattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Pattern: ");

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0 && j%2!=0){
                    System.out.print("0 ");
                } else if(i%2==0 && j%2==0){
                    System.out.print("1 ");
                } else if(i%2!=0 && j%2==0){
                    System.out.print("0 ");
                } else if(i%2!=0 && j%2!=0){
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}