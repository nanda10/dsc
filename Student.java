/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
public class Student {
    static class stud {
        void studen() {
            Scanner stu=new Scanner(System.in);
            int n=stu.nextInt();
        String clas[]=new String[n];
        String stdname[]=new String[n];
        int marks[]=new int[n];
         int i=0;
        while(i<n) {
           System.out.print("name : ");
           stdname[i]=stu.nextLine();
           System.out.print("Sem : ");
           clas[i]=stu.nextLine();
           System.out.print("Marks : ");
           marks[i]=stu.nextInt();
           i++;
        }
        for(i=0;i<n;i++) {
            System.out.println("Student name : "+stdname[i]+"\n"+"Class : "+clas[i]+"\n"+"Marks : "+marks[i]);
    }
        }
    }
    public static void main(String[] args) {
        stud s=new stud(); 
        s.studen();
    }
    
}
