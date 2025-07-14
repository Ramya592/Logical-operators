import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.print("Enter the mark1: ");
        int mark1= scan.nextInt();
        System.out.print("Enter the mark1: ");
        int mark2= scan.nextInt();
        System.out.print("Enter the mark1: ");
        int mark3= scan.nextInt();
        System.out.print("Enter the mark1: ");
        int mark4= scan.nextInt();
        System.out.print("Enter the mark1: ");
        int mark5= scan.nextInt();

        if(mark1>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        if(mark2>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        if(mark3>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        if(mark4>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        if(mark5>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        if(mark1>=50 && mark2>=50 && mark3>=50 && mark4>=50 && mark5>=50){
            System.out.println("Overall Pass");
        }
        else{
            System.out.println("Overall Fail");
        }
    }
}