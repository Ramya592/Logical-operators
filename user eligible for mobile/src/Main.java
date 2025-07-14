import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String usage= scan.nextLine();
      if(usage.equals("minimum")){
          System.out.println("Minimum version mobile is enough for You");
      }
      else if(usage.equals("secure and cost effective")){
          System.out.println("Android mobile is suitable for you");
      }
      else{
          System.out.println("IOS is preferrable");
      }
    }
}