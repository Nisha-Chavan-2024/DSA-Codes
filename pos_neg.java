import java.util.*;

class Positive{

    public static void main(String argp[])
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number : ");
        int a=sc.nextInt();

        if(a<0)
        {
            System.out.println("Number id negative..");
        }
        else{
            System.out.println("Positive..");
        }

    }
}