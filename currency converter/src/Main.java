import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Indian INR: ");
        double INR = scanner.nextDouble();
        System.out.print("Enter country code: ");
        String s = scanner.next();
        if (s.equals("USD")) {
            System.out.println("US Dollar is " + (INR * 0.012) + " dollars");
        } else if (s.equals("EUR")) {
            System.out.println("European Euro is " + (INR * 0.01) + " Euro");
        } else if (s.equals("JPY")) {
            System.out.println("Japanese yen is " + (INR * 1.71) + " Yen");
        }
       else
           System.out.println("Invalid Country code");
    }
}