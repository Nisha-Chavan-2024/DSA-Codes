class Recursion{
    //print numbers in decreasing order

    public static void decrease(int n)
    {
        System.out.println(n);
        if(n>1)
        {
            decrease(n-1);
           
        }
        
    }

    //print the numbers in increasing order
    public  void increasing(int n)
    {
        // int s=10;
        // if(s==n)
        // {
        //     System.out.print(n);
        //     return;
        // }
        
        // System.out.print(n+" ");
        // increasing(n+1);
 
        if(n==1)
        {
            System.out.print(n);
            return;
        }

        increasing(n-1);
        System.out.print(n+" ");

    }

    //factorial of given number
    public static int fact(int n)
    {
        if(n==0)
        {
        return 1;
        }

        return n*fact(n-1);
    }

    //sum of n natural number
    public static int sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        return n+sum(n-1);
    }

    //fibonnacci series

    public static int fibo(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        return fibo(n-1)+fibo(n-2);
        
    }

    //check array is sorted or not
    public static boolean sorted(int arr[],int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }

        if(arr[i] > arr[i+1])
        {
            return false;
            
        }

        return sorted(arr, i+1);
    }

    //find the 1st occurance of the key in aaray

    public static int occurance(int a[],int i,int k)
    {
        //base condition
        if(i == a.length)
        {
            return -1;
        }
        if(a[i] == k)
        {
            return i;
        }
        
        return occurance(a, i+1, k);
    }
    
    //find the x to power n
    public static int power(int x,int n)
    {
        if(n == 1)
        {
            return x;
        }

        return x * power(x, n-1);
    }

    //optimezed code for x to power n
    public static int optimized(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int h =optimized(x,n/2);
        int half =  h * h;
        

        if(n % 2 != 0)
        {
            half = half * x;
        }

        

        return half;
    }

    //find all the occurance of the element return index
    public static int occ(int arr[],int i,int k)
    {
        if(i == arr.length)
        {
            return i;
        }
        
            if(arr[i] == k)
            {
                System.out.println(i);
            }
           
        return occ(arr, i+1, k);
    }
    public static void main(String arg[])
    {
        Recursion r=new Recursion();

       // decrease(10);
       //r.increasing(10);
      // System.out.println(fact(5));;

     // System.out.print(sum(5));

      //System.out.println(fibo(250));

    //   int arr[]={1,2,3,4,8,5};
    //   System.out.println(sorted(arr, 0));

    // int ar[]={1,2,3,4,5,6,3,2,1,6,9,3};
    //  System.out.println(occurance(ar,0,3));

    //System.out.println(power(2,5));

    //System.out.println(optimized(2, 5));

    int arr[]={3,2,4,5,6,2,7,2,2};
    
    occ(arr, 0, 2);

    }
}