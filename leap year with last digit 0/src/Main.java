import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the year: ");
       int year= scan.nextInt();
       if(year%4==0){
           if(year%10==0){
               System.out.println("Leap year with last digit 0");
           }
           else{
               System.out.println("Leap year but not the last digit is 0");
           }
       }
       else{
           System.out.println("Not a leap year");
       }
    }
}