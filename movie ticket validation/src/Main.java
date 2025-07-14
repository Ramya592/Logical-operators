import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the age: ");
       int age= scan.nextInt();

       boolean isAlongAdult=true;

       if(age>18){
           System.out.print("Enter the ID: ");
           String ID= scan.next();
           if((ID.equalsIgnoreCase("teacher")) || (!isAlongAdult)){
               System.out.print("ID verified");
           }
           else{
               System.out.print("come along with adult");
           }
       }
       else{
           System.out.print("You are under 18 years old");
       }
    }
}