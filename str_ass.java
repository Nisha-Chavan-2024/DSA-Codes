import java.util.Arrays;
class Operate{

    public static void lower(String str)
    {
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
               if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
               str.charAt(i)=='o' || str.charAt(i)=='u')
               {
                 c++;
               }
            }
        }

        System.out.print("Count = "+c);
    }

    public static void anagram(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2 =  str2.toLowerCase();

        if(str1.length() == str2.length())
        {
           char ch1[]=str1.toCharArray();
           char ch2[]=str2.toCharArray();

           Arrays.sort(ch1);
           Arrays.sort(ch2);

           boolean r= Arrays.equals(ch1,ch2);
           if(r)
           {
             System.out.print("anagram...");
           }
           else{
            System.out.print(" not anagram...");
           }
        }
        else{
            System.out.print("Not anagram...");
        }
    }

    public static void main(String arg[])
    {
        //que 1
        //lower("nIshae");


        //que 2

        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        //que 3
        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);

        //que 4
        anagram("race","cared");
    }
}