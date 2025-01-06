class BitManipulate
{

    //Check number is even or odd

    public static void convert(int n)
    {
        if((n&1) == 1)
        {
            System.out.print("Odd Number...");
        }
        else{
            System.out.println("Even Number...");
        }
    }


    //check number is power od 2 or not

    public static void power(int n)
    {
        if((n&(n-1)) == 0)
        {
            System.out.println("Number is power of two...");
        }
        else{
            System.out.println("Number is not power of two...");
        }
    }

    //Check number of set(1's) bit's

    public static void count(int n)
    {
        int c=0;
        
        while(n > 0)
        {
            if((n&1) != 0)
           {
            c++;
           }
        n = n>>1;
        }

        System.out.println("Count = "+c);
       
    }
    public static void main(String arg[])
    {
        //convert(13);
       // power(16);
       count(15);
    }
}