import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the year: ");
      int year= scan.nextInt();
      String leap=year%4==0?"leap year":"Not a leap year";
      System.out.println("The year "+year+" is "+leap);
    }
}