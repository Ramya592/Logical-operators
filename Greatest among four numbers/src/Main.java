import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = input.nextInt();
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println(num1+" is greater");
        }
        else if(num2>num1 && num2>num3 && num2>num4){
            System.out.println(num2+" is greater");
        }
        else if(num3>num1 && num3>num2 && num3>num4){
            System.out.println(num3+" is greater");
        }
        else{
            System.out.println(num4+" is greater");
        }
    }
}