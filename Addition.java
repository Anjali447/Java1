/*  Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;
public class Addition {
    //bill of items
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         float pencil = sc.nextFloat();
         float pen = sc.nextFloat();
         float eraser = sc.nextFloat();

         float total;
         total = pencil+pen+eraser;
         System.out.println("Bill is : " +total);

         //add on-18% tax
         float newtotal;
         newtotal = total + (0.18f*total);
         System.out.println("Bill with 18% tax : " +newtotal);
    }
    
}
