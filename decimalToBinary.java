class Decimal{

    public static void convert(int n)
    {
       int ans=0;
       int pow=0;

       while(n!=0)
       {
        int r=n%2;  //  5%2=1  2%2=0   1%2=1
        ans = ans + (r*(int)Math.pow(10,pow));//  0+1=1   1+(0*10)=1  1+(1*100)=101
        pow++;  // 1  2  3
        n=n/2;  // 5/2=2 2/2=1  1/2=0
       }
  
       System.out.println(ans);
    }
    public static void main(String aeg[])
    {
        convert(10); 
    }
}