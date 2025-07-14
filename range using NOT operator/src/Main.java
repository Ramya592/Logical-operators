import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num= scanner.nextInt();
       if(!(num>0 && num<10)){
           System.out.print("out of range");
       }
       else{
           System.out.print("within range");
       }
    }
}