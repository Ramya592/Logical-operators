import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the ID: ");
        String Id= scan.next();
        System.out.print("Enter the weight of luggage: ");
        double weight= scan.nextDouble();
        boolean isTiceketConfirm= true;
        if(Id.length()<=8){
            if(weight<=3){
                if(isTiceketConfirm){
                    System.out.println("Check in completed");
                }
            }
            else{
                System.out.println("You  have to reduce the weight to check in");
            }
        }
        else{
            System.out.println("Enter the valid Id");
        }
    }
}