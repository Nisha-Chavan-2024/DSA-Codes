import java.util.*;

class Week{
    public static void main(String[] args) {
        
        System.out.println("ENter the Day of week : ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch(day)
        {
            case 1:System.out.println("Sunday");
                   break;

            case 2:System.out.println("Monday");
                   break;

            case 3:System.out.println("Tuesday");
                   break;

            case 4:System.out.println("wednesday");
                   break;

            case 5:System.out.println("Thrusday");
                   break;

            case 6:System.out.println("friday");
                   break;

            case 7:System.out.println("Saturday");
                   break;

            default : System.out.println("Wrong choice..");

        }
    }
}