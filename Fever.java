/*Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever. */

import java.util.*;
public class Fever {
    public static void main(String[] args) {
        double temp = 103.5;

        if (temp >= 100) {
            System.out.println("You have fever");
         }  
         else{
          System.out.println("You do not have fever");
         }
  }
}