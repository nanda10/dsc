/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squ_cube;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Squ_cube {
      static class cube {
         void cube(int a) {
              System.out.println("The cube value is "+(a*a*a));
          }
      }
      static class square extends cube {
        void squ(int a) {
            System.out.println("The square value is "+(a*a));
            super.cube(a);
        }  
      }
    public static void main(String[] args) {
        square s=new square();
        Scanner ch=new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a=ch.nextInt();
        s.squ(a);
    }
    
}
