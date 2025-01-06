import java.util.ArrayList;
class BST{

    public static class Node{

        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node insert(Node root,int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data > val)
        {//left side insert
          root.left=  insert(root.left,val);
        }

        if(root.data < val)
        {
            //right side insert
           root.right= insert(root.right,val);
        }

        return root;
    }

    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
         


        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    // public static int nonSpecialCount(int l, int r) {
        
    //     int total=0;
    
        
    //     for(int i=l;i<=r;i++)
    //             {
    //                 int c=0;
    //                 for(int j=1;j<i;j++)
    //                 {
    //                     if(i%j == 0 && i != j)
    //                     {
    //                         c++;
    //                     }
                        
    //                 }
    //                  if(c != 2)
    //                     {
    //                         total++;
    //                     }
    //             }
                
    //             return total;
    // }

    public static boolean isFound(Node root,int val)
    {
        if(root == null)
          return false;

        if(root.data == val)
            return true;

        if(root.data > val)
        {
          return isFound(root.left,val);
         }else
         {
            return isFound(root.right,val);
         }
         
    }

    //deleting the node from the tree
    public static Node delete(Node root,int val)
    {
        if(root.data > val)
        {
            root.left = delete(root.left,val);
        }else if(root.data < val)
        {
            root.right = delete(root.right,val);

        }else{
            //delete leaf node
            if(root.left == null && root.right == null)
            {
                return null;
            }

            //one child
            if(root.right == null)
              return root.left;

            if(root.left == null)
              return root.right;

            //two child

            Node ins=findInorder(root.right);
            root.data=ins.data;
            root.right = delete(root.right, ins.data);
        }

        return root;
        
    }

    public static Node findInorder(Node root)
    {
        while(root.left != null)
        {
            root=root.left;
        }

        return root;
    }

    //find the element in range
    public static void inrange(Node root,int k1,int k2)
    {
        if(root == null)
         return;
        if( root.data >= k1  && root.data <= k2)
        {
            inrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            inrange(root.right, k1, k2);
        }
        else if(root.data < k1)
        {
            inrange(root.left,k1,k2);
        }
        else{
            inrange(root.right,k1,k2);
        }
    }


    //print the path from root to leaf
    public static void printPath(Node root,ArrayList<Integer> path)
    {
      
        if(root == null)
          return;

        path.add(root.data);

        if(root.left == null && root.right == null)
           printAllPath(path);
        
        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size()-1);
    }

    public static void printAllPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("Null");
    }

    //Validate the BST
    public static boolean validPath(Node root)
    {
        ArrayList<Integer> a=new ArrayList<>();

        if(root == null)
          return true;
        inorderTraversal(root,a);

        for(int i=1;i<a.size();i++)
        {
            if(a.get(i-1) >= a.get(i))
            {
                return false;
            }
        }

        return true;
    }

   public static void inorderTraversal(Node root,ArrayList<Integer> a)
    {
        if(root == null)
          return;

          inorderTraversal(root.left,a);
          a.add(root.data);
          inorderTraversal(root.right,a);
    }

    //find the mirroe image
    public static Node mirroe(Node root)
    {
        if(root == null)  
           return null;

        root.right = mirroe(root.left);
        root.left = mirroe(root.right);

        return root;
    }
    public static void main(String arg[])
    {
        int arr[]={2,1,3};
        Node root=null;

        for(int i=0;i<arr.length;i++)
        {
            root = insert(root,arr[i]);
        }

         //inorder(root);

        // int ans=nonSpecialCount(1,5);
        // System.out.println(isFound(root,9));

        // root=delete(root,4);
        // System.out.println();
        // inorder(root);

        // inrange(root, 5, 11);

        // ArrayList<Integer> a=new ArrayList<>();
        // printPath(root, a);
       // System.out.println(validPath(root));

      // inorder(root);
       System.out.println();
       mirroe(root);
       inorder(root);

    }
}