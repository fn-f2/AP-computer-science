import java.util.Scanner;

public class ConvertTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a time in seconds: ");
        
        int s = in.nextInt();
        int h = (int) s/3600;
        int rs = (int) s%3600;
        int m = (int) rs/60;
        int s2 = (int) rs%60;
        
        
        System.out.printf("%,d seconds = %dh %dm %ds", s, h, m, s2);
    }
}