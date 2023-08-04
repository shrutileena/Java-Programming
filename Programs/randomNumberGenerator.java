import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class randomNumberGenerator {
    public static void main(String[] args){
        // Generating random number

        // Math.random() method
        System.out.println(Math.random());

        int min = 1;
        int max = 6;

        double result = Math.random() * (max - min + 1) + min;

        System.out.println(Math.round(Math.floor(result)));

        // Random Class
        Random random = new Random();
        System.out.println(random.nextInt(6));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextGaussian());
        System.out.println(random.nextLong());

        // ThreadLocalRandom Class
        System.out.println(ThreadLocalRandom.current().nextInt(1,6));

        // int() method
        random.ints(2,1,6).forEach(System.out::println);
        random.ints(2).forEach(System.out::println);


    }
}
