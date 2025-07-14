import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the location");
      String location= scan.next();
      System.out.print("Enter the income: ");
      double income= scan.nextDouble();
      System.out.print("Enter the age: ");
      int age= scan.nextInt();

      if(location.equals("city")){
          if(income>500000){
              if(age>45){
                  double tax=income*(5.0/100);
                  tax=tax*(10.0/100);
                  tax=tax*(20.0/100);
                  tax=(tax*(30.0/100));
                  System.out.println("You have to pay Rs."+tax);
              }
              else{
                  double tax1=(income*(5.0/100));
                  System.out.println("You have to pay Rs."+tax1);
              }
          }
          else{
              System.out.print("There is no tax for your income");
          }
      }
      else{
          if(location.equals("Village")){
              if(income>500000){
                  if(age>45){
                      double tax2=income*(5.0/100);
                      tax2=(tax2*(10.0/100));
                      System.out.println("You have to pay Rs."+tax2);
                  }
                  else{
                      double tax3=(income*(5.0/100));
                      System.out.println("You have to pay Rs."+tax3);
                  }
              }
              else{
                  System.out.println("There is no tax for your income");
              }
          }
          else{
              System.out.println("invalid location");
          }
      }
    }
}