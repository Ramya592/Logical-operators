import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Basic Charge: ");
        int BasicCharge = input.nextInt();
        System.out.print("Enter the unit: ");
        int unit=input.nextInt();
        int amount;


        if(unit>100 && unit<=200){
            amount=BasicCharge+100;
        }
        else if(unit>200 && unit<=300){
            amount=BasicCharge+200;
        }
        else if(unit>300 && unit<=400){
            amount=BasicCharge+300;
        }
        else if(unit>400 && unit<500){
            amount=BasicCharge+400;
        }
        else if(unit>=500){
            amount=BasicCharge+1000;
        }
        else{
            amount=BasicCharge;
        }
        System.out.println("Electricity bill is "+amount);
    }
}