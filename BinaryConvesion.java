import java.util.*;

class BinaryToDec{

    public static void binary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Number : ");
         int n = sc.nextInt();

        int sum=0;
        int pow=0;

        while(n!=0)
        {
            int lastD = n%10;

            sum = sum + (lastD*(int)Math.pow(2,pow));

            n = n/10;

            pow++;
        }

        System.out.println("Decimal Number is : "+sum);
    }
  public static void main(String arg[])
  {
    binary();

  }
}