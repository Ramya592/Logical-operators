import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the Password: ");
       String pass= scan.next();
       boolean hasDigit=false;
       boolean hasSpecial=false;
       for(char ch:pass.toCharArray()){
           if(Character.isDigit(ch)){
               hasDigit=true;
           }
           else if(!Character.isLetterOrDigit(ch)){
               hasSpecial=true;
           }
       }
       if(pass.length()>8 && hasDigit && hasSpecial){
           System.out.println("Strong password");
       }
       else{
           System.out.println("Weak password");
       }
    }
}