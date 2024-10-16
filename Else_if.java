import java.util.*;
public class Else_if {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("GRADE - A");
        }
         
        else if (marks > 75 && marks < 90) {
            System.out.println("GRADE - B");
        }

        else{
            System.out.println("GRADE - C");
        }
    }
    
}
