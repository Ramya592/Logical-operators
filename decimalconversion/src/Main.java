import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the number: ");
       long num= scanner.nextLong();
       String val;
       long org=num;
       boolean isBinary=true;
       while(num!=0){
           long digit=num%10;
           if(digit!=0 && digit != 1){
               isBinary=false;
               break;
           }
           num=num/10;
       }
        System.out.println("It is a binary number");
       if(!isBinary){
           System.out.println("Not a Binary number");
       }
       val=String.valueOf(org);
       long dec=Integer.parseInt(val,8);
       if(dec%2==0){
           System.out.println("Divisible by 2");
       }
       else{
           System.out.println("Not divisible by 2");
       }
    }
}