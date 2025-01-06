import java.util.*;
class ClassRomm
{
    //swap two numbers
    public static void swap(ArrayList<Integer> list,int i1,int i2)
    {
        int temp=list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
    }

    public static void main(String arg[])
    {
        // ArrayList<Integer> list1=new ArrayList<>();

        // list1.add(11);
        // list1.add(2);
        // list1.add(30);
        // list1.add(14);
        // list1.add(25);

       // System.out.println(list1);
        // System.out.println(  list1.get(3));
        // list1.set(2,12);
        // list1.remove(2);
        // System.out.println(list1.size());

        // for(int i=0;i<list1.size();i++)
        // {
        //     System.out.print(list1.get(i)+" ");
        // }

        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list1.size();i++)
        // {
        //     max=Math.max(max,list1.get(i));
        // }
        // System.out.println("Max elemrnt is : "+max);

        // System.out.println(list1);
        // swap(list1,2,3);
        // System.out.println(list1);

        // Collections.sort(list1,Collections.reverseOrder());
        // System.out.println(list1);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for(int i=0;i<mainList.size();i++)
        {
            list2.add(i*2);
            list3.add(i*3);
            list4.add(i*4);
        }

        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer> cur = mainList.get(i);
            for(int j=0;j<cur.size();j++)
            {
                System.out.println(cur.get(j)+" ");
            }
            System.out.println();
        }
        
    }

}