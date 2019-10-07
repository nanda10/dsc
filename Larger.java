/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larger;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Larger {

    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the values : ");
        int a=ch.nextInt();
        int b=ch.nextInt();
        if(a>b)
        System.out.println(a+" is larger");
        else
        System.out.println(b+" is larger");
    }
    
}
