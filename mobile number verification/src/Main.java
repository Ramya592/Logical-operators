import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        String mobile = scan.next();
        if(mobile.length() < 11) {
            char[] ch=mobile.toCharArray();
            if(ch[0]=='9' || ch[0]=='8' || ch[0] == '7'){
                System.out.println("mobile number is verified");
            }
            else{
                System.out.println("Sorry! mobile number should starts with 9 or 8 or 7");
            }
        }
        else{
            System.out.println("Invalid mobile number");
        }
    }
}