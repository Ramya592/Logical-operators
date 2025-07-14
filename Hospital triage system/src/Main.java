import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the HeartBeat: ");
       int heartBeat=scan.nextInt();
       System.out.print("Enter the level of Physical damage: ");
       String phydam=scan.next();
       boolean isConscious=true;

       if(heartBeat==72 || heartBeat>=65){
           if(phydam.equals("less")){
               if(isConscious){
                   System.out.println("Wait for few Minutes");
               }
           }
       }
       else{
           if(heartBeat<=65){
               if(phydam.equals("more")){
                   if(isConscious){
                       System.out.println("Take into ICU");
                   }
               }
           }
       }
    }
}