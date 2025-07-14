import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n%2==0){
            if(n%4==0){
                System.out.println(n+" is even and divisible by 4");
            }
            else{
                System.out.println(n+" is even and not divisible by 4");
            }
        }
        else{
            System.out.println(n+" is odd number");
        }
    }
}