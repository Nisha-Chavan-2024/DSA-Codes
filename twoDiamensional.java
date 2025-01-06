import java.util.*;
class TwoDiamension{

    //print 2d array

    public static void show(int row,int col)
    {
        int arr[][]=new int[row][col];
        Scanner sc=new Scanner(System.in);

        //take input from user
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //print output
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    //search specific element
    public static boolean search(int arr[][],int key)
    {
        int r=arr.length;
        int c=arr[0].length;
         
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("Found at "+i+","+j);
                    return true;
                }
                
            }
        }

        return false;

    }


    //find max and min form the 2d array
    public static void find(int arr[][])
    {
        int r=arr.length;
        int c=arr[0].length;
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }

        System.out.println("Max= "+max);
        System.out.println("Min = "+min);

    }


    //Spiral array 
    public static void spiral(int arr[][])
    {
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;

        while(startrow <= endrow && startcol <= endcol)
        {
            //top constant - startrow change - col(startcol to endcol)
            for(int j=startcol ; j<=endcol ; j++)
            {
                System.out.print(arr[startrow][j]+" ");
            }

            //right constant - endcol change - row(startrow+1 to endrow)
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(arr[i][endcol]+" ");
            }

            //bottom constant - endrow change - col(endcol-1 to startcol)

            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startcol == endcol)
                {
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }

            //left  constant - startcol  change - row(endrow-1 to startrow+1 )
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startrow == endrow)
                {
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            
            }

            startrow++;
            endrow--;

            startcol++;
            endcol--;
        }
    }


    public static void sumOfDiagonal(int arr[][])
    {
        int row=arr.length;
        int col=arr[0].length;

        int primarySum = 0;
        int secondarySum = 0;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i == j)
                {
                    primarySum += arr[i][j];
                }

                if(i+j == row-1)
                {
                    secondarySum += arr[i][j];
                }
            }
        }

        System.out.println("Primary Sum  = "+primarySum);
        System.out.println("Secondary Sum  = "+secondarySum);
    }

    public static void main(String arg[])
    {
       // show(3,3);

      // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

      int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

                    sumOfDiagonal(arr);
                    //spiral(arr);        
                           //find(arr);
             //System.out.println(search(arr,7));
    //    boolean re=search(arr,7);
    //    if(re==true)
    //    {
    //     System.out.println("Found");
    //    }
    //    else{
    //     System.out.println("Not Found");
    //    }
    }
}