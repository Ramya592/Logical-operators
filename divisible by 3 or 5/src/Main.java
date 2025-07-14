import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num= scan.nextInt();
       if(num%3==0){
           if(num%5!=0){
               System.out.println(num+" is divisible by 3 but not by 5");
           }
           else{
               System.out.println(num+" is divisible by both 3 and 5");
           }
       }
       else if(num%5==0){
           if(num%3!=0){
               System.out.println(num+" is divisible by 5 but not by 3");
           }
           else{
               System.out.println(num+" is divisible by both 5 and 3");
           }
       }
       else{
           System.out.println(num+" is not divisible by both 3 and 5");
        }
    }
}