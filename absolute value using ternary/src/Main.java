import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num=scan.nextInt();
      int res=num>0?num:(num<0?-num:0);
      System.out.println("The absolute value of "+num+" is "+res);
    }
}