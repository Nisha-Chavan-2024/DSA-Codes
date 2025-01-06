import java.util.*;

class Leap{
    public static void main(String argp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enteer the year : ");
        int year=sc.nextInt();

        if(year%4==0 || year%100==0 || year%400==0)
        {
            System.out.println("leap year...");

        }
        else{
            System.out.println("Not leap year...");
        }
    }
}