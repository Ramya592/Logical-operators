import java.util.*;
public class Main {

    public static boolean isPerfectSquare(int a){
        int s=(int)Math.sqrt(a);
        return s*s==a;
    }
    public static boolean isFibonacci(int num){
        return isPerfectSquare(5*num*num+4) || isPerfectSquare ( 5*num*num-4);
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=sca.nextInt();

        for(int i=0;i<n;i++){
            if(isFibonacci(i)){
                System.out.println(i);
            }
        }
    }
}