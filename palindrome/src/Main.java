import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter the String: ");
      String s= scanner.nextLine();
      int length=0;
      boolean isPalindrome=true;
      char[] chars=s.toCharArray();
      for(char c:chars){
          length++;
      }
      for(int i=0;i<length/2;i++){
          if(chars[i]!=chars[length-1-i]){
              isPalindrome=false;
              break;
          }
      }
      if (isPalindrome){
          System.out.print("The String is Palindrome");
      }
      else
          System.out.print("Not a Palindrome");
    }
}