import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Customer type: ");
        String type=scan.next();
        System.out.print("Enter the amount spent: ");
        double amount= scan.nextDouble();
        System.out.print("Enter the day: ");
        String day=scan.next();
        double amt;
        if(day.equals("weekend")){
            if(type.equals("old")){
                if(amount>2000){
                    amt=amount-500;
                    System.out.println("You have to pay Rs."+amt);
                }
                else{
                    amt=amount-100;
                    System.out.println("You have to pay Rs."+amt);
                }
            }
            else if(type.equals("new")){
                if(amount>3000){
                    amt=amount-500;
                    System.out.println("You have to pay Rs."+amt);
                }
                else{
                    amt=amount-100;
                    System.out.println("You have to pay Rs."+amt);
                }
            }
        }
        else{
            if(day.equals("weekdays")){
                if(type.equals("old")){
                        System.out.println("You have to pay Rs."+amount);
                    }
                    else{
                        System.out.println("You have to pay Rs."+amount);
                    }
            }
        }
    }
}