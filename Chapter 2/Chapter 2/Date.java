import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        String day = "Tuesday";
        String month = "September";
        int date = 9;
        int year = 2025;
  
        String inp = myObj.nextLine();
        if (inp.equals("hi"))
        {
            System.out.println("American Format:\n" + day + ", " + month + " " + date + ", " + year + "\n");
            System.out.println("European Format:\n" + day + " " + date + " " + month + " " + year);
        }
    }
}