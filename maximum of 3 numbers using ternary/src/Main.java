import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2= scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3= scanner.nextInt();
        int res=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("The maximum of three numbers is "+res);
    }
}