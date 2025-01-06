class Solve{

    public static void year(int n)
    {
        String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(n==0)
        {
            return;
        }
        int last = n%10;
        year(n/10);
        System.out.print(digit[last]+" ");
    
    }

    //lenght of string
    public static int length(String srr)
    {
        if(srr.length() == 0)
        {
            return 0;
        }

        return length(srr.substring(1)) + 1;
    }

    public static void main(String arg[])
    {
       // year(2004);

       System.out.print(length("Nisha"));
    }
}