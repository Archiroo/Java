/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main_Ex2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.println("1. Test getName()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        int tc = sc.nextInt();
        Excercise2 ex2 = new Excercise2(name, price);
        if(tc == 1){
            System.out.println("OUTPUT: " + ex2.getName().charAt(0)+ex2.getName().charAt(1)+ex2.getName().charAt(2));
        }
        if(tc == 2){
            System.out.print("Enter new price: ");
            ex2.setPrice(sc.nextDouble());
            System.out.println("OUTPUT: " + ex2.getPrice());
        }
    }
}
