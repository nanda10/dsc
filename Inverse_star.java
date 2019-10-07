/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverse_star;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Inverse_star {

    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        int n=ch.nextInt();
        int i,j,k;
        int l;
        l=n;
        for(i=0;i<n;i++) {
            for(j=0;j<l-1;j++) {
                System.out.print(" ");
            }l--;
            for(k=0;k<(n-j);k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
