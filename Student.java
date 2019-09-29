/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner stu=new Scanner(System.in);
        System.out.println("Enter no of students : ");
        int n=stu.nextInt();
        String clas[]=new String[n];
        String stdname[]=new String[n];
        int marks[]=new int[n];
        int i=0;
        while(i<n) {
            System.out.print("name : ");
           stdname[i]=stu.next();
           System.out.print("Class : ");
           clas[i]=stu.next();
           System.out.print("Marks : ");
           marks[i]=stu.nextInt();
           i++;
        }
        for(i=0;i<n;i++) {
            System.out.println("Student name : "+stdname[i]+"\n"+"Class : "+clas[i]+"\n"+"Marks : "+marks[i]);
        }
    }
    
}
