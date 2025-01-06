import java.util.*;

// class Table{

//     public static void main(String arg[])
//     {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number for table : ");
//        int n=sc.nextInt();

//        for(int i=1;i<=10;i++)
//        {
//         System.out.println(i*n);
//        }
//     }
// }


// class Factorial{

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int n=sc.nextInt();
//          int fact=1;
//         for(int i=n;i>0;i--)
//         {
//            fact*=i;
//         }

//         System.out.println(fact);
//     }
// }

class Sum{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int esum=0;
       int osum=0;
       int c;
       do{
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        if(n%2==0)
        {
            esum+=n;
        }
        else{
            osum+=n;
        }

        System.out.println("Do you want to continue? if Yes pree 1 else 0");
         c=sc.nextInt();
       }while(c==1);

       System.out.println("Sum of even number = "+esum);
       System.out.println("Sum of odd number = "+osum);
    }

   
}