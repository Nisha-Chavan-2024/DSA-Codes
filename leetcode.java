import java.util.ArrayList;
class Solution {
    public static void removeElement(int[] nums, int val) {
        
        int n=nums.length;
       // int r=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == val)
            {
                //r=i; 
                System.out.println(i);
                break;
            }
        
                if(val < nums[i])
                {
                    //r=i;
                    System.out.println(i);
                    break;
                }
                if(val > nums[n-1])
                {
                    //r=n;
                    System.out.println(n);
                    break;
                }
            


        }
       
      //  return n;

    }

    public static void main(String aeg[])
    {
        int arr[]={1,3,5,6};
     // System.out.println();
     removeElement(arr,7);
    }
}