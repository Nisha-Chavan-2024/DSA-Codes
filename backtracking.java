class Backtracking{

    public static void changeArray(int arr[],int i,int n)
    {
        //base case
        if(arr.length == i)
        {
            printArray(arr);
            return;
        }

        //recursion
        arr[i]=n;
        changeArray(arr, i+1, n+1);

        arr[i]=arr[i]-2;
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //find the subset of string
    public static void findSubset(String str,int i,String anss)
    {
        //base case
        if(i == str.length())
        {
            if(anss.length() == 0)
            {
                System.out.print("null");
            }
            else{
                System.out.println(anss);
            }
            return;
        }

        //recursion
        findSubset(str,i+1,anss+str.charAt(i));
        findSubset(str,i+1,anss);//backtracking

    }


    //find the permutation of the "abc" => "abc","acb","bca","bac","cab","cba"  3!
    public static void permutation(String str,String ans)
    {
        //base case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String newstr = str.substring(0,i)+ str.substring(i+1);
            permutation(newstr, ans+ch);

        }
    }

    //n Queen
    public static boolean isSafe(char board[][],int r,int c)
    {
        //check the proper place for the particular queen
        //vertical up
        for(int i=r-1;i>=0;i--)
        {
            if(board[i][c]=='Q')
            {
                return false;
            }
        }

        //left diagonal
        for(int i=r-1, j=c-1 ; i>=0 && j>=0 ; i-- , j--)
        {
                if(board[i][j] == 'Q')
                {
                    return false;
                }
        }

        //right diagonal
        for(int i=r-1,j=c+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j] == 'Q')
                {
                    return false;
                }
        }

        return true;
    }
    public static void nQueen(char board[][],int row)
    {
        //base case
        if(row == board.length)
        {
            printBoard(board);
            return;
        }
        //place the queen
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nQueen(board,row+1);//recursion
                board[row][j]='x';
            }
        }
    }

    public static void printBoard(char board[][])
    {
        System.out.println("--------Board--------");
        for(int i=0;i<board.length;i++)
        {
            
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    //GRID WAY
    public static int gridway(int i,int j,int n,int m) {
        //base case
        if(i == n-1 || j == m-1)
        {
            return 1;
        }
        else if(i == n || j==m)
        {
            return 0;
        }

        int w1=gridway(i+1,j,n,m);
        int w2=gridway(i,j+1,n,m);
        return w1+w2;
    }

    //Raze in met
    public static void raze(int mat[][],int n,int x,int y)
    {
        //base case
        if(x < 0 || y<0 || x==n || y==n || mat[x][y]==0)
        {
            return;
        }

        if(x == n-1 && y==n-1)
        {
            mat[x][y]=0;
            printMat(mat,n);
            return;
        }

        mat[x][y]=0;
        raze(mat,n,x+1,y);
        raze(mat,n,x,y+1);
        raze(mat,n,x-1,y);
        raze(mat,n,x,y-1);
        mat[x][y]=1;
    }

    public static void printMat(int mat[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        // int arr[]=new int[5];
        // changeArray(arr,0,1);
        // printArray(arr);

    //     String str="abc";
    //    // findSubset(str,0,"");
    //     permutation("abc","");

        // int n=4;
        // char board[][]=new char[n][n];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         board[i][j]='X';
        //     }
        //     System.out.println();
        // }

        // nQueen(board,0);

      //  System.out.println(gridway(0,0,3,3));

      int mat[][]={ { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };
     //int mat[][]=new int[4][4];
      raze(mat,4,0,0);

    }
}