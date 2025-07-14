import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num= scan.nextInt();
       String res=(num%2==0) ? "Even number":"Odd number";
       System.out.println(num+" is "+res);
    }
}