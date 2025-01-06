class SubArray
{

    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=12;
        arr[1]=10;
        arr[2]=23;
        arr[3]=45;
        arr[4]=50;

        for(int i=0;i<5;i++)
        {
            
            for(int j=i;j<5;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}