import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the attendance percentage: ");
       int att= scan.nextInt();
       System.out.print("Enter the total marks: ");
       int mark= scan.nextInt();

       if(att>75 && mark>450) {
           System.out.println("extraordinary performance");
       }
       else if(att>75 || mark>450){
           if(att<75){
               System.out.println("You are lagging in attendance");
           }
           else if(mark>400 && mark<450){
               System.out.println("Good performance");
           }
       }
       else if(mark>400 && mark<450) {
           if (att < 75) {
               System.out.println("You have taken more leave");
           }
       }
       else{
           System.out.println("Need to improve more");
       }
    }
}