import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scan.next();
        System.out.print("Entee the email: ");
        String email = scan.next();
        if (!name.equals(null)) {
            if (email.length() < 25) {
                System.out.println("Valid name and email format");
            } else {
                System.out.println("email is not valid");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}