import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String pass= scan.nextLine();
      int length= pass.length();
      boolean hasDigit= true;
      boolean  hasSymbol=true;
      for(int i=0;i<pass.length();i++){
          char ch=pass.charAt(i);
          if(Character.isDigit(ch)){
              hasDigit=true;
          }
          else if(!Character.isLetterOrDigit(ch)){
              hasDigit=true;
          }
      }
      if(length<20){
          if(hasDigit && hasSymbol){
              System.out.println("Password is Strong");
          }
          else{
              System.out.println("Moderate");
          }
      }
      else{
          System.out.println("Weak Password");
      }
    }
}