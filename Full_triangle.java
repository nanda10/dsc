/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package full_triangle;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Full_triangle {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=s.nextInt();
        int a;
        a=n;
        for(int i=0;i<n;i++) {
            for(int j=0;j<(a-1);j++) {
                System.out.print(" ");
            }a--;
            for(int k=0;k<=(2*i);k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
