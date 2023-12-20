public class recursionProgram1 {

    private static void printHello(){
        System.out.println("Hello!");
        printHello();
    }
    public static void main(String[] args){
        printHello();
    }
}
