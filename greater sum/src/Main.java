import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=scan.nextInt();
        int evensum=0;
        int oddsum=0;
        while(n !=0){
            int digit=n%10;
            if(digit%2==0){
                evensum+=digit;
            }
            else{
                oddsum+=digit;
            }
            n=n/10;
        }
        if(evensum>oddsum)
           System.out.println("Even sum is greater: "+evensum);
        else
           System.out.println("Odd sum is greater: "+oddsum);
    }
}