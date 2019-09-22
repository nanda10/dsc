/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.*;
public class Person {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Enter no of person:");
        int n=id.nextInt();
        for(int i=0;i<n;i++) {
            int m=i+1;
        String name = id.next();
        int age=id.nextInt();
        String prof=id.next();
        System.out.println("Person:"+m+"\n"+"Name:"+name+"\n"+"Age:"+age+"\n"+"Profession:"+prof);
    }
  } 
}
