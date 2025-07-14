import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner (System.in);
       int n=scan.nextInt();
       int org=n;
       int count=0;
       double sum=0;
       int temp=n;
       while(temp !=0){
           count++;
           temp=temp/10;
       }
       System.out.println("count is "+count);
        while(n !=0) {
            double digit = n % 10;
            double as = Math.pow(digit, count);
            sum=sum+as;
            n = n / 10;
        }
        System.out.println("The number is " + (int)sum);
        if(sum==org)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}