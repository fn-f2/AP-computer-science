import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int hour = 22;
        int minute = 53;
        int second = 10;
        
        
        String inp = myObj.nextLine();
        if (inp.equals("time"))
        {
            System.out.println("current time is: " + hour%12 + ":" + minute + ":" + second);
        }
    }
}