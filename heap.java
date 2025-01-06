import java.util.*;
class HeapExample{

    public static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data)
        {
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par))
            {
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }

            x=par;
            par=(x-1)/2;
          
        }
        public int peek()
        {
            int da = arr.get(0);
            return da;
        }


        //heapify
        public void heapify(int i)
        {
            int left = 2*i+1;
            int right = 2*i+2;
            int min = i;

            if(left < arr.size() && arr.get(min) > arr.get(left))
            {
                min=left;
            }

            if(right < arr.size() && arr.get(min) > arr.get(right))
            {
                min=right;
            }

            if(min != i)
            {
                //swap the min and i
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }

        }



        public int remove()
        {
            //get the root value
            int data = arr.get(0);

            //swap the root with last element
            int temp=arr.get(arr.size()-1);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //delete the last element(root)

            arr.remove(arr.size()-1);


            //heapify
            heapify(0);
            return data;

        }

       public  boolean isEmpty()
       {
        return arr.size() == 0;
       }

       //sort the array in ascending order(Using the max heap)
      
        
    }

    public static void heapSort(int arr[])
    {
       //create the max heap 
       int n=arr.length;

       for(int i=n/2;i>=0;i--)
       {
         heapify_max(arr,i,n);
       }

       //sort the element (largest to frist)
       for(int i=n-1;i>0;i--)
       {
         int temp = arr[0];
         arr[0]=arr[i];
         arr[i]=temp;

         heapify_max(arr,0,i);
       }
    }

    public static void heapify_max(int arr[],int i,int n)
    {
      int left= 2*i+1;
      int right=2*i+2;
      int max=i;

      if(left < n && arr[left] > arr[max])
      {
         max=left;
      }

      if(right < n && arr[right] > arr[max])
      {
         max=right;
      }

      if(max != i)
      {
         int temp=arr[i];
         arr[i]=arr[max];
         arr[max]=temp;

         heapify_max(arr,max,n);
      }
    }

    //nearby cars
    public static class Queue implements Comparable<Queue>{
        int x;
        int y;
        int sqdist;
        int id;

        Queue(int x,int y,int sqdist,int id)
        {
            this.x=x;
            this.y=y;
            this.sqdist=sqdist;
            this.id=id;
        }

        @Override
        public int compareTo(Queue q1)
        {
            return this.sqdist - q1.sqdist;
        }
    }

    //weakiest solder
    public static class Roww implements Comparable<Roww>{
        int sol;
        int idx;

        Roww(int sol,int idx)
        {
            this.sol=sol;
            this.idx=idx;
        }

        @Override
        public int compareTo(Roww r1)
        {
            if(this.sol == r1.sol)
            {
                return this.idx-r1.idx;
            }
            else{
                return this.sol-r1.sol;
            }
        }
    } 


    public static void main(String arg[])
    {
        // Heap h=new Heap();
        // h.add(3);
        // h.add(4);
        // h.add(1);
        // h.add(5);


        // while(!h.isEmpty())
        // {
        //     System.out.println(h.peek());
        //     h.remove();
        // }

        // int arr[]={1,2,5,4,3};
        // heapSort(arr);

        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }


        // int arr[][]={{3,3},{5,-1},{4,2}};int k=2;
        // PriorityQueue<Queue> q=new PriorityQueue<>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     int dist = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
        //     q.add(new Queue(arr[i][0],arr[i][1],dist,i));
        // }

        // for(int i=0;i<k;i++)
        // {
        //     System.out.println("C"+q.remove().id);
        // }


        int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        PriorityQueue<Roww> pq=new PriorityQueue<>();
        int k=2;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=0;j<arr[0].length;j++)
            {
                c += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Roww(c,i));
        }

        for(int i=0;i<k;i++)
        {
            System.out.println("R"+pq.remove().idx);
        }
    }
}