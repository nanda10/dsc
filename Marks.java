/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Marks {
    static class student {
        void avg_marks(int tot) {
            float avg;
            avg=((float)(tot)/6);
            System.out.println("Average marks is "+avg);
        }
    }
    static class total extends student {
        void total_(int a[]) {
            int tot=0;
            for(int i=0;i<6;i++) {
                tot=tot+a[i];
            }
            super.avg_marks(tot);
        }
    }
    public static void main(String[] args) {
        total t=new total();
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the marks of 6 subject : ");
        int a[]=new int[6];
        for(int i=0;i<6;i++) {
            a[i]=ch.nextInt();
        }
        t.total_(a);
    }
    
}
