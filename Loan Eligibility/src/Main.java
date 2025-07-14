import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=input.nextInt();
        System.out.print("Enter the income: ");
        double income=input.nextDouble();
        System.out.print("Enter the CIBIL Score: ");
        int CIBIL=input.nextInt();

        if(age>21){
            if(income>300000){
                if(CIBIL>700){
                    System.out.println("You are eligible for loan");
                }
                else{
                    System.out.println("CIBIL Score is too low");
                }
            }
            else{
                System.out.println("Your income is too low");
            }
        }
        else{
            System.out.println("You are not eligible for getting loan");
        }
    }
}