import java.util.*;
class GreedyAssignment{

    //example 3
    public static void findsum(int n,int k)
    {
        char str[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        ArrayList<Character> s=new ArrayList<>();
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(k >= (i+1))
            {
                while(k >= (i+1) && k != 0)
                {
                    c++;
                    while(c != n)
                    {
                        k -= (i+1);
                        s.add(str[i]);
                        break;
                    }
                }
            }
            if(c == n)
                    {
                        break;
                    }
        }

       for(int i=0;i<s.size();i++)
       {
         System.out.print(s.get(i));
       }
    }

    //example 2
    // public static void kthele(int L,int R,int K)
    // {
    //     int c=0;
    //     int totalOdd;

    //     if(L%2 != 0 && R%2 != 0)
    //     {
    //         totalOdd = (R-L+1)/2;
    //     }
    //     else{
    //         totalOdd = ((R-L+1)/2 + 1);
    //     }
    //     if(K > totalOdd)
    //     {
    //         System.out.print("0");
    //     }
    //     for(int i=R;i>=L;i--)
    //     {
    //         if(i%2 != 0)
    //         {
    //             c++;
    //         }
    //         if(K == c)
    //         {
    //             System.out.print("Max odd No. : "+i);
    //             break;
    //         }
    //     }
    // }


    public static void main(String aeg[])
    {
        ///Example 1
        // String str="LRRRLL";
        // int r=0;int l=0;int c=0;
        // for(int i=0;i<str.length();i++)
        // {
        //     if(str.charAt(i) == 'L')
        //     {
        //         l++;
        //     }
        //     else if(str.charAt(i) == 'R')
        //     {
        //         r++;
        //     }
        //     if(l != 0 && r != 0 && l == r)
        //     {
        //         c++;
        //         l=0;r=0;
        //     }
        // }

        // System.out.print("Count = "+c);


        //example 2
        //kthele(-3,7,2);

        findsum(4,42);
    }
}