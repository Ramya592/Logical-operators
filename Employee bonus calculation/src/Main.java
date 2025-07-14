import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Basic salary: ");
        double BasicSalary=input.nextDouble();
        System.out.print("Enter the Service Type: ");
        String serviceType=input.next();
        if(serviceType.equalsIgnoreCase("Fresher")){
            System.out.println("Your Salary is Rs."+BasicSalary);
        }
        else if(serviceType.equalsIgnoreCase("Experienced")){
            System.out.println("years of ex[erience ");
            int experience=input.nextInt();
            int Bonus=experience*1000;
            double v = BasicSalary + Bonus;
            System.out.println("Your Salary is  Rs." +(int)v);
        }
    }
}
