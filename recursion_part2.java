class Recursion_part_2
{

    //tiling problem
    public static int tiling(int n)//2 * n(length) floor size
    {
        //base case
        if(n == 0 || n == 1)
        {
            return 1;
        }

        //horizontal 
        // int h=tiling(n-2);

        // //vertical
        // int v=tiling(n-1);

        // int t=h+v;
        // return t;

        return tiling(n-2) + tiling(n-1);
    }



    //Remove duplicates from the array....
    public static void remove(String str,boolean ar[],int idx,StringBuilder newstr)
    {
        //base case
        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }

        //work
        char cur = str.charAt(idx);
        if(ar[cur - 'a'] == true)
        {
            remove(str, ar, idx+1, newstr);
        }
        else{
            ar[cur - 'a'] = true;
            remove(str, ar, idx+1, newstr.append(cur));
        }

    }

    public static int pair(int n)
    {
        //base case
        if(n==1 || n==2)
        {
            return n;
        }

        //single 1 and (n-1)
        //pair  2 and(n-2)   2=1,1 (1 and n-1) (1 and n-1) =(n-1)*(n-2)
        return pair(n-1) + (n-1) * pair(n-2);
    }

    //print the binary number without consecutive ones

    public static void binary(int n,int lastidx,String str)
    {

        //base case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }

        //work
        
        binary(n-1,0,str+"0");
        if(lastidx == 0)
        {
            binary(n-1,1,str+"1");
        }
    }
    public static void main(String arg[])
    {
        //System.out.println(tiling(4));
       //remove("appnacollege",new boolean[26],0,new StringBuilder(""));

       //System.out.println(pair(3));

       binary(4,0,"");
    }
}