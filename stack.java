import java.util.*;
class StackOperation{

    // static class Satck{

    //    static ArrayList<Integer> list=new ArrayList<>();

    //     //isEmpty
    //     public static boolean isEmpty()
    //     {
    //         return list.size() == 0;
    //     }

    //     //push
    //     public void push(int data)
    //     {
    //         list.add(data);
    //     }
    //     //pop
    //     public int pop()
    //     {
    //         if(isEmpty())
    //         {
    //             return -1;
    //         }
    //         int top=list.get(list.size() - 1);
    //         list.remove(list.get(list.size() - 1));
    //         return top;
            
    //     }

    //     //peek
    //     public int peek()
    //     {
    //         if(isEmpty())
    //         {
    //             return -1;
    //         }

    //         int top=list.get(list.size()-1);
    //         return top;
    //     }

    // }

//    static class Node {
//         int data;
//         Node next;

//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
   
//     static class Stack{
//         static Node head=null;

        //isEmpty
    //     public static boolean isEmpty()
    //     {
    //        return head == null;
    //     }

    //     //push
    //     public static void push(int data)
    //     {
    //         Node newNode =new Node(data);
    //         if(isEmpty())
    //         {
    //             head=newNode;
    //             return;
    //         }

    //         newNode.next=head;
    //         head=newNode;

    //     }

    //     //pop
    //     public static int pop()
    //     {
    //         if(isEmpty())
    //         {
    //             return -1;
    //         }

    //         int top = head.data;
    //         head=head.next;
    //         return top;
    //     }

    //     //peek
    //     public static int peek()
    //     {
    //         if(isEmpty())
    //         {
    //             return -1;
    //         }

    //         return head.data;
    //     }



    // }



    public static StringBuilder reverseString(String s)
    {
        Stack<Character> s1=new Stack<>();

        int i=0;
        while(i < s.length())
        {
            s1.push(s.charAt(i));
            i++;
        }

        StringBuilder s2=new StringBuilder("");

        while(!s1.isEmpty())
        {
            char t=s1.pop();
            s2.append(t);
        }

        return s2;

    }


    
    public static void bottomPush(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top=s.pop();
        bottomPush(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s)
    {
        // int t=s.pop();
        // reverse(s);
        // return t;
        while(!s.isEmpty())
        {
            int t=s.pop();
            System.out.println(t);
        }

    }



    //equal parenthesis example
    public static boolean parenthesis(String str)
    {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                s.push(ch);
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }

                if((s.peek() == '(' && ch == ')') || 
               ( s.peek() == '[' && ch == ']')||
                (s.peek() == '{' && ch == '}') )
                {   
                    s.pop();
                }else{
                    return false;
                }
            }
    }
    
    if(s.isEmpty())
    {
        return true;
    }else{
        return false;
    }
       
}

    
    public static void main(String arg[])
    {
        //Stack s=new Stack();

     //  Stack<Integer> s1=new Stack<>();

        // s1.push(1);
        // s1.push(2);
        // s1.push(3);

        // while(!s1.isEmpty())
        // {
        //     System.out.println(s1.peek());
        //     s1.pop();
        // }

        // Stack<Integer> s1=new Stack<>();
        // s1.push(1);
        // s1.push(2);
        // s1.push(3);

        // reverse(s1);

     //  System.out.println(reverseString("abc"));

        // while(!s1.isEmpty())
        // {
        //     System.out.println(null);
        // }

        //  bottomPush(s1,4);
        // while(!s1.isEmpty())
        // {
        //         System.out.println(s1.pop());
        // }



        //greater element

        // int arr[]={7,0,8,2,4,1};

        // Stack<Integer> s=new Stack<>();
        // int newA[]=new int[arr.length];

        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     //while 
        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i])
        //     {
        //         s.pop();
        //     }

        //     if(s.isEmpty())
        //     {
        //         newA[i]=-1;
        //     }
        //     else{
        //         newA[i]=arr[s.peek()];
        //     }
        //     s.push(i);
        // }


        // for(int i=0;i<newA.length;i++)
        // {
        //     System.out.print(newA[i]+" ");
        // }
       
       
        System.out.println(parenthesis("()[]{}["));

    }
}