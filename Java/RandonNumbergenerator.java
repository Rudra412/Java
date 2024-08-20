import java.until.Random;

public class RandomNumberGenerator{
    public static void main(String []args) {

        Random random = new Random();

        int randomnumber =  random.nextInt(100) + 1;

        System.out.println("Random number:" + randomNumber);
    } 
}