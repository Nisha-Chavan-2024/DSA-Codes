class Palindrome
{
    public static void reverse(int n)
    {
        int ori=n;
        int sum=0;
       
        while (n!=0) 
        {
          int r=n%10; //  121%10=1  12%10=2  1%10=1
          sum = r + (sum*10);  // 1+0=1   2+(1*10)=12  1+(12*10)=121
          
          n=n/10;// 121/10=12  12/10=1
          
        }



        if(ori==sum)
        {
            System.out.println("Palindrome..");
        }
        else{
            System.out.println("Not Palindrome..");
        }
    }


    public static void sum(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s = s+r;
            n=n/10;
        }

        System.out.println(s);
    }
    public static void main(String[] args) {
        
       // reverse(122);
       sum(124);
    }
}