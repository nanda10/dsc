/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Nandan R
 */
public class Matrix {
    static void matrx(int m,int n) {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) {
                System.out.print("1 ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
       int n=3;
       int m=3;
       matrx(m,n);
    }
    
}
