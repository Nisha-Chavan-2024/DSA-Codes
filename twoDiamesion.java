class Ass{

    public static void count(int arr[][])
    {
        int r=arr.length-1;
        int c=arr[0].length-1;
        int co=0;
        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=c;j++)
            {
                if(arr[i][j] == 7)
                {
                    co++;
                }
            }
        }
        System.out.print("COunt = "+co);
    }

    public static void  sum(int arr[])
    {
        int s=0;
        int n=arr.length-1;
        for(int i=0;i<=n;i++)
        {
            s+=arr[i];
        }
        System.out.println("Sum = "+s);
    }

    public static void tranpose(int arr[][])
    {
        int r=arr.length-1;
        int c=arr[0].length-1;
        for(int i=0;i<=c;i++)
        {
            for(int j=0;j<=r;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        //que 1

        // int arr[][]={{4,7,8},{8,8,7}};

        // count(arr);


        //Que 2
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        // sum(nums[1]);

        int arr[][]={{11,12,13},{21,22,23}};
        tranpose(arr);

    }
}