class Assigment{

    public static boolean check(int arr[])
    {
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
        }

        if(c>0)
        {
            return true;
        }
        else{
            return false;
        }


    }

    public static int search(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static void triplaet(int arr[])
    {
        int n=arr.length;
        int s;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               
                for(int k=j+1;k<n;k++)
                {
                    
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                    } 
                }
                System.out.println();
                
            }
        }
    }
    public static void main(String[] args) {
        // int a[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //   //int a[]={1, 2, 3, 4};
        // System.out.println(check(a));


    //     int nums[] = {4,  5, 6, 7, 0, 1, 2};
    //     int k=3;
    //    // search(nums,k);
    //     System.out.println(search(nums,k));

       int a[]={-1, 0,  1, 2, -1, -4};
       triplaet(a);
    }
}