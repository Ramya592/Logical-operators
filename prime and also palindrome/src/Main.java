import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

       System.out.print("Enter the number: ");
       int num= scan.nextInt();
       int org=num;
       int rev=0;

       if(num%2!=0){
           if(num%1==0 && num%num==0){
               while(num!=0){
                   rev=rev*10+(num%10);
                   num=num/10;
               }
               if(rev==org){
                   System.out.println("The number is prime and also palindrome");
               }
               else{
                   System.out.println("The number is prime but not palindrome");
               }
           }
           else{
               System.out.println("The number is odd but not prime");
           }
       }
       else{
           System.out.println("The number is even");
       }
    }
}