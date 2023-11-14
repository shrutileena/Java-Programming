public class recursionProgram2 {

    private static void printHello(int n){
        if(n>0) {
            System.out.println("Hello");
            printHello(n - 1);
        } else {
            System.out.println("Out of Bound");
        }
    }

    public static void main(String[] args){
        printHello(5);
    }
}
