class Tries
{
    public static class Node{

        Node child[]=new Node[26];
        boolean end=false;

        Node()
        {
            for(int i=0;i<26;i++)
           {
            child[i]=null;
           }
        }
        
    }

    public static Node root=new Node();

    public static void insert(String word)
    {
        Node cur = root;

        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';

            if(cur.child[idx] == null)
            {
                cur.child[idx] = new Node();
            }
            
              cur=cur.child[idx];
            
        }

        cur.end = true;
    }

    public static boolean search(String word)
    {
        Node cur = root;

        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';

            if(cur.child[idx] == null)
            {
                return false;
            }
            
              cur=cur.child[idx];
            
        }

        return cur.end == true; 
    }

    //breakdown the words
    public static boolean breakdown(String key)
    {
        //base case
        if(key.length() == 0)
          {
            return true;
          }

          for(int i=1;i<=key.length();i++)
          {
             if(search(key.substring(0,i)) && breakdown(key.substring(i)))
             {
                    return true;
             }
          }

          return false;
    }

    public static boolean startwith(String prefix)
    {
        Node cur = root;

        for(int i=0;i<prefix.length();i++)
        {
            int idx=prefix.charAt(i)-'a';

            if(cur.child[idx] == null)
            {
                return false;
            }
            
              cur=cur.child[idx];
            
        }

        return true; 
    }
    public static void main(String aerg[])
    {
        // String ar[]={"the","a","there","thee"};
        // for(int i=0;i<ar.length;i++)
        // {
        //     insert(ar[i]);
        // }

        // System.out.println(search("the"));
        // System.out.println(search("theo"));
        // System.out.println(search("ther"));

        String arr[]={"i","like","sam","samsung","mobile","phone"};
        String key="ilikesamsungt";

        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i]); //creating the tries
        }

   //     System.out.println(breakdown(key));
        System.out.println(startwith("sa"));

    }
}