import java.util.*;
import java.util.Arrays;
class Greedy{


    public static void main(String aeg[])
    {//max activity count
        // int start[]={1,3,0,5,8,5};
        // int end[]={2,4,6,7,9,9};

        // int max=0;
        // ArrayList<Integer> ans=new ArrayList<>();

        // max=1;
        
        // int last=end[0];
        // for(int i=1;i<start.length;i++)
        // {
        //     if(start[i] >= last)
        //     {
        //         max++;
        //         
        //         last=end[i];
        //     }
        // }
        // System.out.println("Max count = "+max);




         //fractinal knapsack
        //  int val[]={60,100,120};
        //  int wt[]={10,20,30};
        //  int W=50;

        //  double ration[][]=new double[val.length][2];
        //  //1st index 2nd ration

        //  for(int i=0;i<val.length;i++)
        //  {
        //     ration[i][0]=i;
        //     ration[i][1]=val[i]/(double)wt[i];
        //  }

        //  Arrays.sort(ration,Comparator.comparingDouble(o -> o[1]));

        //  int capacity =W;
        //  int finalValue=0;

        //  for(int i=ration.length-1;i>=0;i--)
        //  {
        //     int idx=(int)ration[i][0];
        //     if(capacity >= wt[idx])
        //     {
        //         finalValue += val[idx];
        //         capacity -= wt[idx];

        //     }
        //     else{
        //         finalValue = (int)(capacity * ration[i][1]);
        //         capacity=0;
        //         break;
        //     }
        //  }

        //  System.out.println(finalValue);


        //min sum of diff between the pair
        
        // int A[]={4,1,8,7};
        // int B[]={2,3,6,5};

        // Arrays.sort(A);
        // Arrays.sort(B);

        // int sum=0;
        // for(int i=0;i<A.length;i++)
        // {
        //     sum += Math.abs(A[i]-B[i]);
        // }
        // System.out.println("Sum = "+sum);




        //Max length chain pairs
        // int a[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        // Arrays.sort(a,Comparator.comparingInt( o -> o[1]));

        // int max=1;
        // int last=a[0][1];
        // for(int i=1;i<a.length;i++)
        // {
        //     if(a[i][0] >= last)
        //     {
        //         max++;
        //         last=a[i][1];
        //     }
        // }

        // System.out.print("Max = "+max);



        //Indian coins problem

    //     Integer coin[]={1,2,5,10,20,50,100,500,2000};

    //    // Arrays.sort(coin,Comparator.reverseOrder());

    //     int count=0;
    //     int amt=590;
    //     for(int i=coin.length-1;i>=0;i--)
    //     {
    //         if(amt >= coin[i])
    //         {
    //             while(amt >= coin[i] && amt != 0)
    //             {
    //                 count++;
    //                 amt -= coin[i];
    //             }
    //         }
    //     }

    //     System.out.println("Count = "+count);



    //chocolo problem hard level

    Integer ver[]={2,1,3,1,4};
    Integer hor[]={4,1,2};

    Arrays.sort(ver,Comparator.reverseOrder());
    Arrays.sort(hor,Comparator.reverseOrder());

    int h=0;int v=0;
    int hp=1;int vp=1;
    int cost=0;


    while(v < ver.length && h < hor.length)
    {
        if(ver[v] <= hor[h])
        {
            cost += (hor[h] * vp);
            hp++;
            h++;
        }
        else{
            cost += (ver[v] * hp);
            vp++;
            v++;
        }
    }


    while(v < ver.length)
    {
        cost += (ver[v] * hp);
        vp++;
        v++; 
    }

    while(h < hor.length)
    {
        cost += (hor[h] * vp);
            hp++;
            h++;
    }

    System.out.print("Cost = "+cost);
    }
}