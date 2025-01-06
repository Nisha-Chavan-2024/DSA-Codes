class Trapped{



    public static void water(int arr[])
    {
        int n=arr.length;

        int left[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(arr[i],left[i-1]);
        }

        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(arr[i],right[i+1]);
        }

        int trap=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(left[i],right[i]);

            trap+=waterlevel-arr[i];
        }

        System.out.println("Trapped water is : "+trap);
    }


    public static void tarpped(int ht[])
    {
        int n=ht.length;

        //fill leftarray max(ht,previous elemnt of left);
        int left[]=new int[n];
        left[0]=ht[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(ht[i],left[i-1]);
        }

        //right array
        int right[]=new int[n];
        right[n-1]=ht[n-1];
        for(int i=n-2;i>=0;i--)
        {
         right[i]=Math.max(ht[i],right[i+1]);
        }

        //fix the level=min(left[i],right[i])
        //trap+=fixlevel-ht;
        int t=0;
        for(int i=0;i<n;i++)
        {
           int waterlevel=Math.min(left[i],right[i]);
           t+=waterlevel-ht[i];
        }

        System.out.println("Trapped water = "+t);
    }

    public static void main(String arg[])
    {
      int arr[]={1,8,6,2,5,4,8,3,7};
      tarpped(arr);
      //water(arr);
    }
}