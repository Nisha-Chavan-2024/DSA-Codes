class Pattern{

    public static void hallow_pattern(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1 || i==r || j==1 || j==c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void space_pattern(int n)
    {
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void arrow_pattern(int n)
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n-i+1;j++)
        {
            System.out.print(j);
        }

        System.out.println();
       }
    }

    public static void floyds_pattern(int n)
    {
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void zero_one(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
               
            }
            System.out.println();
        }
    }


    public static void butterfly(int n)
    {
        //for 1st half
        for(int i=1;i<=n;i++)
        {
            //star i

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //space 2*(n-i)

            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //star i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
         
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            //star i

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //space 2*(n-i)

            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //star i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
         
            }
            System.out.println();
        }



    

       
    }

    public static void hallow(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        for(int j=1;j<=n;j++)
        {
            if(i==1 || i==n || j==1 || j==n)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }

        System.out.println();

      }
    }

    
public static void solidPattern(int n)
{
    for(int i=1;i<=n;i++)
    {
        //spcace n-i
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
         //star n
        for(int j=1;j<=n;j++)
        {
            System.out.print("*");
        }
     System.out.println();    
    }
}


    public static void diamond(int n)
    {
        //1st half
        for(int i=1;i<=n;i++)
        {
           //Space n-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //star 2i-1
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half

        for(int i=n;i>=1;i--)
        {
           //Space n-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //star 2i-1
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
       // hallow_pattern(4,5);

       //space_pattern(4);
      // arrow_pattern(5);
     // butterfly(4);
        //zero_one(5);
     // floyds_pattern(5);

     diamond(5);
    }
}