import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,ch;
        
        Scanner s=new Scanner(System.in);
        System.out.print("enter the day");
        a=s.nextInt();
        System.out.println("enter 0 for sunday");
         System.out.println("enter 1 for monday");
          System.out.println("enter 2 for tuesday");
           System.out.println("enter 3 for wednesday");
            System.out.println("enter 4 for thursday");
             System.out.println("enter 5 for friday");
              System.out.print("enter your choice:");
              ch=s.nextInt();
              switch(ch)
              {
              case 1:
              
               System.out.println("Sunday :Free Personal Pizza on purchase of medium Pizza" +ans);
               break;
               case 2:
               
                System.out.println("Monday:Rs.101 OFF on a bill of Rs.400 and above" +ans);
               break;
               case 3:
               
                 System.out.println("Tuesday:Free Plain Garlic Bread on another medium pizza" +ans);
                 break;
                 case 4:
                 
                  System.out.println("Wednesday:Buy 1 Get 1 Free on any medium pizza" +ans);
                  break;
                  case 5:
                  
                   System.out.println("Thursday:Buy any medium pizza and get 50% off on another medium pizza" +ans); 
                  break;
                  case 6:
                  
                  System.out.println("Friday:Tastiest pizza 20% off on bill of Rs.399 or above" +ans);
                  break;
                  case 6:
                  
                  System.out.println("Saturday:Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350" +ans);
                  break;
                  default:
                  System.out.println("enter correct choice");
                  }
                  }
                  
                  
                 
        
	}
}