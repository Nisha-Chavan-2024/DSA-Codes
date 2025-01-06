class Conquer
{
    public static void printString(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void divide(String arr[],int si,int ei)
    {
        //base case
        if(si >= ei)
        {
            return;
        }

        //work
        int mid = si + (ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid + 1,ei);

        merge(arr,si,mid,ei);

    }

    public static void merge(String arr[],int si,int mid,int ei)
    {
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= ei)
        {
            if(isSmaller(arr[i],arr[j]))
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }

        while(i <= mid)
        {
            temp[k++]=arr[i++];
        }

        while(j <= ei)
        {
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k < temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    public static boolean isSmaller(String str1,String str2)
    {
        if(str1.compareTo(str2) < 0)
        {
            return true;
        }

        return false;
    }


    public static int mcount(int arr[],int n)
    {
        int majority = n/2;

        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    c++;
                }
            }
            
        if(c > majority)
        {
                return arr[i];
        }
        }
        return -1;
    }

    public static int check(int arr[])
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] > arr[j] && i < j)
                {
                    c=c+1;
                }
            }
        }

        return c;
    }

   

    public static void main(String arg[])
    {
        // String[] arr= {"sun","earth","mars","mercury"};
        // divide(arr,0,arr.length-1);
        // printString(arr);

        // int arr[]={3,2,3};
        // System.out.print(mcount(arr,arr.length));


        int ar[]={2, 4, 1, 3, 5};
        System.out.print(check(ar));
    }

}