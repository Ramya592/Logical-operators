import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the number of subjects: ");
       int sub=scan.nextInt();
       int  total=0;
       double percentage=0;
       int[] marks=new int[sub];
       for(int i=0;i<sub;i++){
           System.out.print("Enter mark: ");
           marks[i]= scan.nextInt();
           if(marks[i]<0 || marks[i]>100){
               System.out.println("Invalid marks entered");
               return;
           }
           total+=marks[i];
       }
       percentage=((double) total/(sub*100))*100;
       if(percentage>=90)
           System.out.println('O');
       else if (percentage>=80 && percentage<90) {
           System.out.println('A');
       }
       else if(percentage>=70 && percentage<80)
           System.out.println('B');
       else
           System.out.println("Fail");
    }
}