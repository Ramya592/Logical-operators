import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       char ch=scan.next().charAt(0);
       if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
           System.out.println("Vowel");
       }
       else if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
           if (ch > 'a' && ch < 'z') {
               System.out.println("Consonant");
           }
       else {
               if (ch == 0 || ch > 0 || ch < 0) {
                   System.out.println("Digit");
               } else {
                   System.out.println("Special Characters");
               }
           }
       }
    }
}