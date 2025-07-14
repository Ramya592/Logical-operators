import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter the String: ");
     String word= scanner.next();
     String res=word.length()>10?"long":"short";
     System.out.println("The length of the string \""+word+"\" is "+res);
    }
}