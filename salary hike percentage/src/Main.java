import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the experience: ");
      int exp= scan.nextInt();
      String hike=exp>5?"20%":"10%";
      System.out.println("Percentage of hike is "+hike);
    }
}