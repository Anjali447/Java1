// print a even number between 9 and 100

import java.util.*;

public class even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter i : ");
        int i = sc.nextInt();
        while(i <= 100){
            System.out.println(i);
            i += 2;
        }
        }

    }

