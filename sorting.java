class Sorting{

    //time complexity o(n^2)
    public static void bubble(int arr[])
    {
        int n=arr.length;

        //turns
        for(int i=0;i<n-1;i++)
        {
            //each turn 
            for(int j=0;j<n-1-i;j++)
            {
                //check and swap
                if(arr[j] > arr[j+1]) // compare element with their next
                {
                    int t= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        //print the sorted array
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }


    //bubble dort optimzed code time - o(n)
    public static void optimise(int arr[])
    {
        boolean swap=true;
        while(swap)
        {
            swap=false;
            for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
                swap=true;
            }
        }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }


    //Selecction sort

    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int  min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min] > arr[j])
                {
                    min=j;
                }
            }

            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }


        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }



    public static void main(String[] args)
    
    {
       int arr[]={23, 12,56,10,9,33,21,67,89,32};    
     //  bubble(arr);
  //   optimise(arr);

  selection(arr);
    }
}