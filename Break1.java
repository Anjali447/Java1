//keep entering number till user enters a multiple of 10

import java.util.*;

public class Break1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your number : ");
            int n = sc.nextInt();
            if( n % 10 == 0){
                break;
               }
               System.out.println("your number is : ");
            System.out.println(n);                
        } while (true);
    }
}