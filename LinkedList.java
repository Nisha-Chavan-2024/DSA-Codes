class Linked
{
    //create class for the node 
    public static class Node{

        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int s;

    //add node to first position
    public void addFirst(int data)
    {
        //step 1 - crate new node
        Node newNode = new Node(data);
        s++;

        //base case linked list is null\
        if(head == null)
        {
            head=tail=newNode;
        }

        //step 2 - newnode.next -> head
        newNode.next=head;

        //step 3 - head=newNode
        head=newNode;

    }
   
    ///add element at last position
    public void addLast(int data)
    {
        //create new node
        Node newNode = new Node(data);
        s++;
        //base case
        if(head == null)
        {
            head=tail=null;
        }

        //step 2 -> tail.next  -> newnode
        tail.next = newNode;

        //step 3 tail=newmode

        tail= newNode;

        newNode.next = null;
    }

    //print the linked list
    public void printList()
    {
        Node temp = head;

        if(head == null)
        {
            System.out.println("Linked List is empty..");
            return;
        }
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    //add element at middle of list
    public void addMiddle(int idx,int element)
    {
        //crate new node
        Node newNode = new Node(element);
        s++;

        int i=0;
        Node temp = head;

        if(head == null)
        {
            head=tail=newNode;
        }
        if(idx == 0)
        {
            head=newNode;
        }

        while(i < idx-1)
        {
            temp=temp.next;
            i++;
        }


        newNode.next = temp.next;
        temp.next=newNode;
    }

    //size of List
    public void count()
    {
        Node temp = head;
        int c=0;

        if(head == null)
        {
            System.out.println("0");
        }

        while(temp != null)
        {
            c++;
            temp=temp.next;
        }

        System.out.print("Count is : "+c);
    }

    //remove the first head
    public int removeFrist()
    {
        if(s == 0)
        {
            return 0;
        }
        else if(s == 1)
        {
            int val = head.data;
            head=tail=null;
            s=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        s--;
        return val;
    }
        //remove the last element from the list
        public int removeLast()
        {
            if(s == 0)
            {
                return 0;
            }
            if(s == 1)
            {
                int val = head.data;
                head=tail=null;
                s=0;
                return val;
            }
            Node temp=head;
            for(int i=0;i<s-2;i++)
            {
                temp=temp.next;
            }

            int val=tail.data;
            temp.next = null;
            tail=temp;
            s--;
            return val;

        }
    
        //search the element from the list
        public int search(int key)
        {
            Node temp=head;
            int i=0;
            boolean c=false;
            while(temp != null)
            {
                if(temp.data == key)
                {
                    return i;
                    //System.out.println("Found..");
                }
                temp=temp.next;
                i++;
            }

            return -1;
        }


         //remove the nth node from the end
    public void removeNend(int n)
    {
        ///find the size of list
        int s=0;
        Node temp=head;
        while(temp != null)
        {
            temp=temp.next;
            s++;
        }

        int i=1;
        Node pre=head;
        while(i < (s-n))
        {
            pre=pre.next;
            i++;
        }

        pre.next=pre.next.next;
        return;
    }

    //Slow fast methos to find the mid node
    public Node slow_fast(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast != null || fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Linked l=new Linked();
       
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(15);
        l.addMiddle(2,66);
        l.addLast(6);

        l.addLast(61);

        l.printList();

        // l.count();
        // System.out.println(l.s);

        // System.out.println(l.removeFrist());
        // l.printList();
        // System.out.println("Removed element us : "+l.removeLast());
        // l.printList();

        // if(l.search(4))
        // {
        //     System.out.println("Found...");
        // }
        // else{
        //     System.out.println("Not Found...");
        // }
      //  System.out.println("Found at : "+l.search(2));

      l.removeNend(3);
      l.printList();
    }
}