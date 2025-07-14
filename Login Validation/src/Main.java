import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username = scan.next();
        System.out.print("Enter the password: ");
        String password = scan.next();
        String a = "Ramya";
        String b = "password";
        if (username.equals(a) && password.equals(b)) {
            System.out.print("Enter the mobile number: ");
            String mobile = scan.next();
            if (mobile.length() <= 10) {
                System.out.print("Enter the OTP: ");
                String otp = scan.next();
                if (otp.length() <= 6) {
                    System.out.print("Login Successfully");
                }
                else{
                    System.out.println("Invalid OTP");
                    System.out.print("Enter the correct OTP");
                }
            }
            else{
                System.out.println("Invalid mobile number");
                System.out.print("Enter the valid mobile number ");
            }
        }
        else {
            System.out.println("Invalid username or password");
        }
    }
}