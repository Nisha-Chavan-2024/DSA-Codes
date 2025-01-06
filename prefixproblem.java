class PrefixProblem{

    public static class Node{
        Node child[]=new Node[26];
        boolean end=false;
        int freq;

        Node()
        {
            for(int i=0;i<26;i++)
            {
                child[i]=null;
            }
            freq=1;
        }
    
    }
    public static Node root=new Node();
    //insert the node
    public static void insert(String word)
    {
        Node cur=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(cur.child[idx] == null)
            {
                cur.child[idx]=new Node();
            }
            else{
                cur.child[idx].freq++;
            }

            cur=cur.child[idx];
        
        }

        cur.end=true;
    }

    public static void findprifix(Node root,String ans)
    {
        if(root == null)
          return;

        if(root.freq == 1)
        {
          System.out.println(ans);
          return;
        }

        for(int i=0;i<26;i++)
        {
            if(root.child[i] != null)
            {
                findprifix(root.child[i],ans+(char)(i+'a'));
            }
        }
    }


    public static void main(String arh[])
    {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i]);
        }
        root.freq=-1;
        findprifix(root,"");
    }

}