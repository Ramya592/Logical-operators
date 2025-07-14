import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the mark: ");
       int mark= scan.nextInt();
       char res=mark>90?'O':mark>80?'A':mark>70?'B':mark>60?'C':mark>50?'D':'U';
       System.out.println("Grade is "+res);
    }
}