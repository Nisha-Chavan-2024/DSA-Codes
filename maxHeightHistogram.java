import java.util.*;
class Histogram
{

    public static int maxArea(int ar[])
    {
        int left[]=new int[ar.length];
        int right[]=new int[ar.length];
        int area=0;

        Stack<Integer> s=new Stack<>();

        //fill the right array
        for(int i=ar.length-1;i>=0;i--)
        {
            if(!s.isEmpty() && ar[s.peek()] >= ar[i])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                right[i]=ar.length;
            }else{
                right[i]=s.peek();
            }
            s.push(i);
        }

        
        s=new Stack<>();

        //fill the left array
        for(int i=0;i<ar.length;i++)
        {
            if(!s.isEmpty() && ar[s.peek()] >= ar[i])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                left[i]=-1;
            }else{
                left[i]=s.peek();
            }
            s.push(i);
        }


        //cur area
        for(int i=0;i<ar.length;i++)
        {
            int ht=ar[i];
            int wi=right[i] - left[i] -1;
            int a=ht*wi;
            area=Math.max(a,area);
        }

        return area;



    }

    public static void main(String arg[])
    {
        int arr[]={2,1,5,6,2,3};

        System.out.print("Max Area is : "+maxArea(arr));
    }
}