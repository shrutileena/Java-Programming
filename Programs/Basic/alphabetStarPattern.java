public class alphabetStarPattern {
    public static void main(String[] args){
        for(int j=0; j<4; j++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.print("* ");
            for(int j=1; j<3; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        for(int j=0; j<4; j++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0; i<4; i++){
            System.out.print("* ");
            for(int j=1; j<3    ; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
    }
}
