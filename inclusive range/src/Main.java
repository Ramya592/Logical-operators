import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter a: ");
       int a= scan.nextInt();
       if(a>=100 && a<=500){
           System.out.println("Inclusive range: "+a);
       }
       else{
           System.out.println("Exclusive range");
       }
    }
}