class DynamicProgrammin{

    ///using recusion only take more time
    public static int recursion(int n)//exponential TC
    {
        if(n==1 || n==0)
          return n;

        return recursion(n-1)+recursion(n-2);
    }

   ///using dp Memoization(recursion) O(n)
   public static int memoization(int n,int[] f)
   {
    if(n==1 || n==0)
      return n;

    if(f[n] != 0)
      return f[n];

    f[n]=memoization(n-1,f)+memoization(n-2,f);

    return f[n];
   }

   //tabulation-iteration
   public static int tabulation(int n,int dp[])
   {

    dp[0]=0;
    dp[1]=1;

    for(int i=2;i<=n;i++)
    {
        dp[i]=dp[i-1]+dp[i-2];
    }

    return dp[n];
   }
    public static void main(String arg[])
    {
        int n=5;
        int f[]=new int[n+1];
      //  System.out.println(n);
      //  System.out.println(memoization(n,f));
      System.out.println(tabulation(n,f));
    }
}