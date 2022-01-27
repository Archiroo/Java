/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wookshop2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main_Ex1 {

    static int n;
    static Scanner sc = new Scanner(System.in);
    static Excercise1 ex1[] = new Excercise1[100];

    //Input
    public static void Input() {
        System.out.print("Input n: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.print("Input code: ");
            String code = sc.nextLine();
            System.out.print("Input price: ");
            double price = sc.nextDouble();

            Excercise1 ex = new Excercise1(code, price);
            ex1[i] = ex;
        }
    }

    //Output
    public static void Output() {
        System.out.println("List of Fan: ");
        System.out.println("Code" + "\t" + "Price");
        for (int i = 0; i < n; i++) {
            System.out.println(ex1[i].toString());
        }
    }

    //Search
    public static void Search(String name) {
        name = sc.nextLine();
        System.out.println("Code" + "\t" + "Price");
        for (int i = 0; i < n; i++) {
            if (ex1[i].getCode().equals(name)) {
                System.out.println(ex1[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input name: ");
        String name = sc.nextLine();
        Search(name);
    }
}
