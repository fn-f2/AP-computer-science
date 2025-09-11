import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a temperature in Celius: ");
        
        double c = in.nextDouble();
        
        double f = c * (9.0/5.0) + 32;
        
        System.out.printf("%.1f C = %.1f F", c, f);
    }
}