import java.util.Scanner;
public class primeNumber2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (exit==false) {

            System.out.println("Enter the number: ");
            int num = scanner.nextInt();

            boolean isPrime = true;

            if(num==0 || num==1){
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.println(isPrime == true ? "It is a prime number." : "It is not a prime number.");

            System.out.println("You want to exit? (y/n) ");
            String wantToExit = scanner.next();

            if(wantToExit.equals("y")){
                exit = true;
            }

        }
    }
}
