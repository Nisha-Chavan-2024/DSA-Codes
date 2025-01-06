 import java.util.*;

class Prime{

    public static void main(String arg[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        boolean ch=true;
        if(n==2)
        {
            System.out.println("Prime number...");
        }
        else{
            
            for(int i=2;i<=n-1;i++)
            {
                if(n%i==0)
                {
                   ch=false;
                }
            }
        }

        if(ch==true)
        {
            System.out.println("Prime...");
        }
        else{
            System.out.println("not prime..");
        }
    }
}

