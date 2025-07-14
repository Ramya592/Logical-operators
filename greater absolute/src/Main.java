import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the value of a: ");
       int a=scanner.nextInt();
       System.out.println("Enter the value  of b: ");
       int b= scanner.nextInt();
       int absA=Math.abs(a);
       int absB=Math.abs(b);

       if(absA>absB)
           System.out.println("Absolute of A is greater by "+absA);
       else
           System.out.println("Absolute of B is greater by "+absB);
    }
}