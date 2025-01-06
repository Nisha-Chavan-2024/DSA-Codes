class StringOperation 
{
    public static boolean isPlindrome(String str)
    {
       int n=str.length();
       for(int i=0;i<n/2;i++)
       {
        if(str.charAt(i) != str.charAt(n-i-1))
        {
            return false;
        }
       }

       return true;
    }

    public static float path_pattern(String p)
    {
        int x=0;int y=0;
       int n=p.length();
       for(int i=0;i<n;i++)
       {
         char dir=p.charAt(i);

         if(dir == 'W')
         {
            x--;
         }
         else if(dir == 'N')
         {
            y++;
         }
         else if(dir == 'E')
         {
            x++;
         }
         else if(dir == 'S')
         {
            y--;
         }
       }

       int x2=x*x;
       int y2=y*y;

    return (float)Math.sqrt(x2+y2);
    }


    public static String substring(String s,int s1,int e)
    {
        String ans="";
      for(int i=s1;i<e;i++)
      {
        ans+=s.charAt(i);
      }

      return ans;
    }


    //String Builder data structure - mutable,m/m efficiency

    public static void builder()
    {
        StringBuilder s=new StringBuilder();

        for(char ch='a';ch<='z';ch++)
        {
            s.append(ch+" ");
        }

        System.out.print(s);
    }

    //convert "hi, i am nisha" to "Hi, I Am Nisha"
    public static void convert(String str)
    {
        StringBuilder s=new StringBuilder();

        char ch=Character.toUpperCase(str.charAt(0));
        s.append(ch);

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                s.append(str.charAt(i));
            }
        }

        System.out.print(s.toString());
    }


    //aaabbcccdd o/p - a3b2c3d2
    public static void compress(String  str)
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str.length();i++)
        {

            Integer count=1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++; //2 3 
                i++;//2
            }
            sb.append(str.charAt(i));//a //b
            if (count > 1) {
                sb.append(count.toString());//a3 //b2
            }
           
        }

        System.out.print(sb.toString());
    } 

   public static void main(String arg[])
   {
     // System.out.println(isPlindrome("noonr"));

    //  String path="WNEENESENNNEEE";
    //  System.out.println(path_pattern(path));

    // String c="HelloWorld";
    // System.out.println(substring(c,0,5));

//  convert("hi, i am nisha");


    compress("aaabbcccdd");
   // builder();
    // String s1="Nisha";
    // String s2="Nishaaaa";
    // String s3=new String("Chavan");
    // if(s1 == s2)
    // {
    //     System.out.println("Palindrome...");
    // }
    // else{
    //     System.out.println(" not Plindrome...");
    // }

    // if(s2.equals(s3))
    // {
    //     System.out.print("Palindrome..");
    // }else{
    //     System.out.println(" not Plindrome...");
    // }
   }
}