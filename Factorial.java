/*Write a program to find the factorial of any number entered by the user. */

import java.util.*;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int fact;

        System.out.println("enter num : ");
        num = sc.nextInt();

        int i;
        fact = 1;

        for(i=1; i <= num; i++){
            fact *= i;
        }
        System.out.println("factorial is : " +fact);

    }
}
