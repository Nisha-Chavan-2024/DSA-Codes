import java.util.*;

public class Test {
    public static void main(String[] args){

   Scanner sc=new Scanner(System.in);
   int i=sc.nextInt();
   int tax;
   
   if(i<500000)
   {
       tax=0;
   }
   else if(i>=500000 && i<1000000)
   {
        tax=(int)(income*0.20);
        
    }
    else{
       tax=(int)(income*0.30);
        
    }
    System.out.println(tax);
}
}