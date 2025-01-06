import java.util.*;

class HashExample{

  //union and intersection
   public static void demo(int arr1[],int arr2[])
   {
        //union
        HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<arr1.length;i++)
         {
            set.add(arr1[i]);
         }

         for(int i=0;i<arr2.length;i++)
         {
            set.add(arr2[i]);
         }

         for(int num:set) 
         {
            System.out.println(num);
         } 

         //intersection
         set.clear();
         for(int i=0;i<arr1.length;i++)
         {
            set.add(arr1[i]);
         }
         int c=0;
         for(int i=0;i<arr2.length;i++)
         {
            if(set.contains(arr2[i]))
            {
                c++;
                System.out.print(arr2[i]);
                set.remove(arr2[i]);
            }
         }

        //  for(int num:set)
        //  {
        //     System.out.println("Intersection : "+num);
        //  }
        // // System.out.println(c);


    }
    public static void maxcount(int arr[])
    {
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer> key = map.keySet();
        for(Integer k : key)
        {
            if(map.get(k) > n/3)
            {
                System.out.println(k);
            }
        }
    }

    public static void main(String arg[])
    {
        // HashMap<String,Integer> map=new HashMap<>();

        // map.put("India",200);
        // map.put("china",300);
        // map.put("Indonesia",400);
        // map.put("ABC",900);

        // System.out.println(map);
        // System.out.println(map.get("china"));
        // System.out.println(map.containsKey("India"));
        // System.out.println(map.remove("ABsC"));
        // map.clear();
        // System.out.println(map.isEmpty());

        // Set<String> k= map.keySet();
        // System.out.println(k);

     //System.out.println(map.entrySet());

    //  int arr[]={1,2,3,4,1,1,2,1};
    //  maxcount(arr);

        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        demo(arr1,arr2);

    }
}