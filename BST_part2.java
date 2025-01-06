import java.util.*;
class BSTPart2
{
    public static class Node{

        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
    }


    //created the Balanced BSt from the sortede array
    public static Node sortedArray(int arr[],int st,int end)
    {
        if(st > end)
          return null;

        int mid=(st+end)/2;

        Node root=new Node(arr[mid]);
        root.left = sortedArray(arr,st,mid-1);
        root.right = sortedArray(arr,mid+1,end);
        return root; 

    }
    public static void preorder(Node root)
    {
        if(root == null)
          return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //Convert the BST to balanced BST
    public static Node balance(ArrayList<Integer> a,int st,int end)
    {
        if(st > end)
          return null;

          int mid = (st+end)/2;
        Node root = new Node(a.get(mid));
        root.left = balance(a, st, mid-1);
        root.right = balance(a, mid+1, end);

        return root;
    }
    public static Node balancedeBst(Node root)
    {
        ArrayList<Integer> a = new ArrayList<>();
        inorder(root,a);

        root = balance(a,0,a.size()-1);

        return root;
    }

    public static void inorder(Node root,ArrayList<Integer> a)
    {
        if(root ==  null)
          return;

        inorder(root.left,a);
        a.add(root.data);
        inorder(root.right,a);
    }

    public static void main(String[] args) {
        
        // int arr[] = {3,5,6,8,10,11,12};

        // Node root = sortedArray(arr,0,arr.length-1);
        // preorder(root);

        Node root = new Node(8);
         root.left =  new Node(6);
         root.left.left = new Node(5);
         root.left.left.left = new Node(3);

          root.right = new Node(10);
          root.right.right = new Node(11);
          root.right.right.right = new Node(12);


         Node root1 =  balancedeBst(root);
          preorder(root1);

    }
}