/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author burkioo
 */
//scrum demo class example
// First functionality which takes user input 
public class Scrum {
	public static int add(int a , int b){
		return a+b;
	}
	public static int subtract(int a , int b){
		return a-b;
	}
	public static int multiply(int a , int b){
		return a*b;
	}
	public static int div(int a , int b){
		return a/b;
	}
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        int x = scrn.nextInt();
        int y = scrn.nextInt();
        
        System.out.println("x:" + x);
        System.out.println("y:" + y);
       
        System.out.println("answer:" + add(x,y));
        System.out.println("answer:" + multiply(x,y));
        System.out.println("answer:" + subtract(x,y));
        System.out.println("answer:" + div(x,y));


        // add the methods to add x and y
    }
}
