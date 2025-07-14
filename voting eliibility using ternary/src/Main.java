import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the age: ");
      int age= scan.nextInt();
      String vote=age>18?"Eligible to vote":"Not eligible to vote";
      System.out.println("You are "+vote);
    }
}