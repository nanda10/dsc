/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Star {

    public static void main(String[] args) {
        Scanner star=new Scanner(System.in);
       int n=star.nextInt();
       for(int i=0;i<n;i++) {
           for(int j=0;j<=i;j++){
               System.out.print("*");
       }
       System.out.print("\n");
       }
    }
    
}
