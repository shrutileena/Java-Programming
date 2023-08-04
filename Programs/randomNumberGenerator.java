import java.lang.Math;
import java.util.Random;
public class randomNumberGenerator {
    public static void main(String[] args){
        // Generating random number
        System.out.println(Math.random());

        Random random = new Random();
        System.out.println(random.nextInt(6));
    }
}
