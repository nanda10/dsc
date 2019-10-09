/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hollow_triangle;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Hollow_triangle {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the value : ");
       int n=s.nextInt();
       for(int i=0;i<(n-1);i++) {
           for(int j=1;j<=(i+1);j++) {
               if((j==1)||(j==(i+1)))
                   System.out.print(j);
               else
                   System.out.print(" ");
           }
           System.out.print("\n");
       }
       for(int k=1;k<=n;k++) {
           System.out.print(k);
       }
       System.out.println("\n");
    }
    
}
