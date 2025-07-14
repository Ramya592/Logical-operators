import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the n: ");
       int n=scan.nextInt();
       int temp=n;
       int sum=0;
       if(n==0)
           return;
       while(n > 0){
           int fact=1;
           int digit=n%10;
           for(int i=1;i<=digit;i++) {
               fact = fact * i;
           }
           sum = sum + fact;
           n=n/10;
       }
       System.out.println("sum is "+sum );
       if(sum==temp){
           System.out.println("Strong number");
       }
       else System.out.println("Not a Strong number");
    }
}