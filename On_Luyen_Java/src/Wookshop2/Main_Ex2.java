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
public class Main_Ex2 {

    static int n;
    static Scanner sc = new Scanner(System.in);
    static Child_Ex2 ex2[] = new Child_Ex2[100];

    //Input
    public static void Input() {
        System.out.print("Input n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Car " + (i + 1));
            System.out.print("Input name: ");
            String name = sc.nextLine();
            System.out.print("Input price: ");
            double price = sc.nextDouble();
            System.out.print("Input series: ");
            int series = sc.nextInt();

            Child_Ex2 ex = new Child_Ex2(series, name, price);
            ex2[i] = ex;
        }
    }

    //Output
    public static void Output() {
        System.out.println("List of car");
        System.out.println("Name" + "\t" + "Price" + "\t" + "Series" + "\t" + "Sale");
        for (int i = 0; i < n; i++) {
            System.out.println(ex2[i].toString());
        }
    }

    //Search
    public static void Search(String nam) {
        nam = sc.nextLine();
        System.out.println("Car with name");
        System.out.println("Name" + "\t" + "Price" + "\t" + "Series" + "\t" + "Sale");
        for (int i = 0; i < n; i++) {
            if (ex2[i].getName().equals(nam)) {
                System.out.println(ex2[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input name search: ");
        String nam = sc.nextLine();
        Search(nam);
    }
}
