import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[3];
        int i;
        for(i=0;i<3;i++) {
            System.out.println("Enter number: ");
            numbers[i] = scan.nextInt();
        }
            if(3!=0)
                System.out.println("Middle value is "+ numbers[i-2]);
            else
                System.out.println("No return");

    }
}