class Arrays{


    public static int linearSearch(int arr[],int key)
    {
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==key)
        {
            return i;
            //break;
        }
      }
      return -1;

      
    }

    public static void largestNum(int arr[])
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                max=arr[i];
            }
        }

        System.out.print(max);
    }


    public static int binarySearch(int arr[],int key)
    {
        int start=0;
        int end= arr.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(arr[mid]==key)
            {
               return mid;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else if(arr[mid]>key)
            {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void reverse_array(int arr[])
    {
      int n=arr.length;

      int s=0;
      int l=n-1;

      while(s<=l)
      {
        int t=arr[s];
        arr[s]=arr[l];
        arr[l]=t;

        s++;
        l--;
      }

      for(int i=0;i<n;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }

    public static void array_pair(int arr[])
    {
      int n=arr.length;

      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          System.out.print("("+arr[i]+","+arr[j]+")");
        }
        System.out.println();
      }
    }


    public static void subarray(int arr[])
    {
      int n=arr.length;
      int t=0;
      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {

          for(int k=i;k<=j;k++)
          {
            System.out.print(arr[k]+" ");
            t++;
          }
          System.out.println();
        }
      }

      System.out.println(t);
    }


    public static void max_subarray_sum(int arr[])
    {
       int n=arr.length;
       int cur_sum=0; //current sum
       int max=Integer.MIN_VALUE;

      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
          for(int k=i;k<=j;k++)
          {
             cur_sum+=arr[k];
          }
          System.out.println("Sum  = "+cur_sum);
          if(max<cur_sum)
          {
            max=cur_sum;
          }
        }
      }
      System.out.println("max= "+max);
    }
    public static void main(String arg[])
    {
      int arr[]={2,3,4,5};
      int key=121;
      max_subarray_sum(arr);
      //subarray(arr);
      //array_pair(arr);
     // reverse_array(arr);
      // int ans=binarySearch(arr,key);
      // if(ans==-1)
      // {
      //   System.out.println("Not found..");

      // }
      // else{
      //   System.out.println("Found at : "+ans);
      // }


      //largestNum(arr);
    //  int ans=linearSearch(arr,key);

    //   if(ans==-1)
    //   {
        
    //     System.out.println("not found..");
    //   }
    //   else{
    //     System.out.println("found at "+ ans);
    //   }

    }
}