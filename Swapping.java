/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Swapping {
    static class swap {
        void display(int a,int b) {
            int temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("The output is a="+a+" "+"b="+b);
        }
    }

    public static void main(String[] args) {
        swap s=new swap();
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        int a=ch.nextInt();
        int b=ch.nextInt();
        s.display(a,b);
    }
    
}
