//calculating the average from 25 exam scores

import java.util.*;
public class calculation {
    public static void main(String args[]){
        int sum = 0;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Exam Score s : ");
        int s = sc.nextInt();
           sum = sum + s;
           c = c + 1;

           while (c == 25) {
            int avg = sum / 25;
           }
    }
    
}
