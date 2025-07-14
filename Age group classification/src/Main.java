import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the age: ");
       int age= scan.nextInt();
       if(age<1){
           System.out.println("Infant");
       }
       else if(age>=2 && age<=12){
           System.out.println("Child");
       }
       else if(age>=13 && age<=19){
           System.out.println("Teen");
       }
       else if(age>=20 && age<=60){
           System.out.println("Adults");
       }
       else{
           System.out.println("Seniors");
       }
    }
}