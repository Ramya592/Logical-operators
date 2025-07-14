import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        int s3= scan.nextInt();
        if(s1==s2) {
            if (s1 == s3) {
                System.out.println("Equilateral Triangle");
            } else {
                System.out.println("Isoceles traingle");
            }
        }
        else if(s2==s3) {
            if(s2==s1){
                System.out.println("Euilateral Triangle");
            }
            else{
                System.out.println("Isoceles Triangle");
            }
        }
        else{
            System.out.println("Scalene Triangle");
        }

    }
}