class PrimeRange{

    public static boolean isPrime(int a)
    {
        
        boolean ch=true;
        if(a==2)
        {
            return true;
        }
        
            for(int i=2;i<=a-1;i++)
            {
                if(a%i==0)
                {
                    return false;
                   
                }
            }
        
        return true;
    }

    public static void rangePrime(int n)
    {

        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
              System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        rangePrime(15);
    }
}