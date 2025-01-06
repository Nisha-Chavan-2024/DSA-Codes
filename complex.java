import java.util.*;

class Complex{
    int r,r1;
    int i,i1;
   Scanner sc=new Scanner(System.in);
    void addition()
    {
        System.out.println("Enter the Real and imaganry part of 1st number");
        r=sc.nextInt();
        i=sc.nextInt();

        System.out.println("Enter the Real and imaganry part of 2nd number");
        r1=sc.nextInt();
        i1=sc.nextInt();

        int r2=r+r1;
        int i2=i+i1;

        System.out.println(r2+" + "+i2+"i");
   }

   void subtraction()
   {
    System.out.println("Enter the Real and imaganry part of 1st number");
    r=sc.nextInt();
    i=sc.nextInt();

    System.out.println("Enter the Real and imaganry part of 2nd number");
    r1=sc.nextInt();
    i1=sc.nextInt();

    int r2=r-r1;
    int i2=i-i1;

    System.out.println(r2+" + "+i2+"i");
   }

   void multiplication()
   {
    System.out.println("Enter the Real and imaganry part of 1st number");
    r=sc.nextInt();
    i=sc.nextInt();

    System.out.println("Enter the Real and imaganry part of 2nd number");
    r1=sc.nextInt();
    i1=sc.nextInt();

    int r2=r*r1;
    int i2=i*i1;

    System.out.println(r2+" + "+i2+"i");
   }
    public static void main(String arg[])
    {
        Complex c=new Complex();
        //c.addition();
        //c.subtraction();
        c.multiplication();
    }
}