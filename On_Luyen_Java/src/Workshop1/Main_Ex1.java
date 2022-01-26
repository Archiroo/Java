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
public class Main_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fan code: ");
        String code = sc.nextLine();
        System.out.print("Enter fan price: ");
        double price = sc.nextDouble();
        System.out.println("1. TC = 1 - test getCode()");
        System.out.println("2. TC = 1- test setPrice()");
        System.out.print("Enter TC: ");
        int tc = sc.nextInt();
        Excercise1 ex1 = new Excercise1(code, price);
        if(tc==1){
            System.out.println("OUTPUT: " + ex1.getCode());
        }
        if(tc==2){
            System.out.println("OUTPUT: " + ex1.getPrice());
        }
    }
}
