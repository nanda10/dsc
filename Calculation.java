/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

/**
 *
 * @author Nandan R
 */
import java.util.*;
public class Calculation {
static void calc(String ch,int a,int b) {
    switch(ch) {
        case "+" : System.out.println("the result : "+(a+b));
        break;
        case "-" : System.out.println("the result : "+(a-b));
        break;
        case "*" :System.out.println("the result : "+(a*b));
        break;
        case "/" : if(b==0) {
            System.out.println("Mathematical error");
            }else {
            System.out.println("the reslut : "+a/b);
        }break;
        default : System.out.println("Enter valid choice");
    }
}
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);
        System.out.print("Enter your choice : ");
        String ch=cal.next();
        System.out.println("Enter the items");
        int a=cal.nextInt();
        int b=cal.nextInt();
        calc(ch,a,b);
    }
    
}
