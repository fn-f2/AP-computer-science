import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randnum = random.nextInt(100) + 1;
        
        System.out.print("guess my suoer cool nunbmer between\n 1 and one hundrod: ");
        
        while (true)
        {
            int num = (int) in.nextDouble();
            if (num == randnum)
            {
                System.out.printf("yay uou got it it was %d", num);
                break;
            } else if (num > randnum)
            {
                System.out.print("lower !!!! guess again: ");
            } else
            {
                System.out.print("higher !!!!!!! guess again: ");
            }
        }
        
    }
}