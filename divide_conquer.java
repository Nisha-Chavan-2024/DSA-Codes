class Divide
{

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void divide(int arr[],int si,int ei)
    {
        //base case
        if(si >= ei)
        {
            return;
        }

        //work
        int mid = si+(ei-si)/2;


        //left sort
        divide(arr,si,mid);
        //right sort
        divide(arr,mid+1,ei);

        //merge sorted
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei)
    {
        //craete temp array
        int[] temp = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= ei)
        {
            if(arr[i] < arr[j])
            {
                temp[k++] = arr[i++];//i++;k++;
            }
            else{
                temp[k++] = arr[j++];//k++;j++;
            }
        }

        //push remaing elemnt form the left side

        while(i <= mid)
        {
            temp[k++] = arr[i++];  
        }

        //push remainng element from the right side
        while(j <= ei)
        {
            temp[k++] = arr[j++];
        }

        //push temp array to original array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    //quick sort
    public static void quick(int arr[],int si,int ei)
    {
        //base case
        if(si >= ei)
        {
            return;
        }
        //work
        //find the partition point
        int pidx = partition(arr,si,ei);
        quick(arr,si,pidx-1);//left
        quick(arr,pidx+1,ei);
    }

    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;//place the elemnt smaller tan the pivot

        for(int j=si;j<ei;j++)
        {
            if(pivot >= arr[j])
            {
                i++;
                //swap arr[i]  and arr[j]
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
          
        }
        i++;
        //swap pivot  and arr[j]
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
       return i;
    }
    public static void main(String ag[])
    {
        int arr[]={6,3,2,5,4,9};
        // divide(arr,0,arr.length-1);
        // printArray(arr);

        quick(arr,0,arr.length-1);
        printArray(arr);
    }
}