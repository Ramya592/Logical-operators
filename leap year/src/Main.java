import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int year= scanner.nextInt();
       boolean isLeap=true;
       if(year%4==0){
           if(year%100==0){
               if(year%400==0){
                   isLeap=true;
               }
               else
                   isLeap=false;
           }
           else
               isLeap=true;
       }
       else{
           isLeap=false;
       }
       if(isLeap){
           System.out.println(year+" is a leap year");
       }
       else
           System.out.println(year+" is not a leap year");
    }
}