//display all numbers entered by the user except multiple of 10

import java.util.*;

public class Continue1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println(" enter your number : ");
            int n =  sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("your number is : ");
            System.out.println(n);
        } while(true);
              
        
    }
}
