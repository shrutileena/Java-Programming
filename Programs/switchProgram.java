import java.util.Scanner;

public class switchProgram {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String choice = sc.next();

        switch(choice){
            case "on": System.out.println("Switch On");
                break;

            case "On": System.out.println("Switch On");
                break;

            case "ON": System.out.println("Switch On");
                break;

            case "off": System.out.println("Switch Off");
                break;

            case "Off": System.out.println("Switch Off");
                break;

            case "OFF": System.out.println("Switch Off");
                break;

            default: System.out.println("Nothing chosen");
                break;
        }
    }
}
