import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        if(gpa>=8.0){
            System.out.print("Enter Attendance percentage: ");
            double percent = input.nextDouble();
            if(percent >= 75){
                System.out.print("Eligible to write exam");
            }
            else{
                System.out.print("Not eligible to write exam");
            }
        }
        else{
            System.out.print(" Not Qualified");
        }
    }
}