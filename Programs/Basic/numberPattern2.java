public class numberPattern2 {

    private static int digit = 1;

    public static void main(String[] args){
        for(int i=0; i<7; i++){
            for(int j=0; j<=i; j++){
                System.out.print(digit+" ");
                digit++;
            }
            System.out.println();
        }
    }
}
