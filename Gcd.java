/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcd;

/**
 *
 * @author 91787
 */
public class Gcd {

    public static int gcd(int m, int n) //gcd = greatest common digit
    {
        while(m != n)
        {
           if(m > n) m = m - n;
           else n = n - m;
        }
        return n;
    }
    public static void main(String[] args) 
    {
      System.out.println(gcd(35,91));
      
      /* if we don't write static in the the function so we
      have to create a reference with the same name of the class name */
      
    /*  Gcd x = new Gcd();
      System.out.println(x.gcd(35,91)); //call the method */
      
    }
    
}
