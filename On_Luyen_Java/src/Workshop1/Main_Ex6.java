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
public class Main_Ex6 {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static Excercise6 ex6[] = new Excercise6[100];

    //Input
    public static void Input() {
        System.out.print("Input n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input Country: ");
            String Country = sc.nextLine();
            System.out.print("Input Color: ");
            String Color = sc.nextLine();
            System.out.print("Input Price: ");
            double Price = sc.nextDouble();

            Excercise6 ex = new Excercise6(ID, Name, Country, Color, Price);
            ex6[i] = ex;
        }
    }

    //Output
    public static void Output() {
        System.out.println("List of car: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Country" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(ex6[i].getID() + "\t" + ex6[i].getName() + "\t" + ex6[i].getCountry() + "\t" + ex6[i].getColor() + "\t" + ex6[i].getPrice() + "\t" + ex6[i].Discount());
        }
    }

    // Count number car have price less than Price of the first car
    public static void Count() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ex6[i].getPrice() > ex6[0].getPrice()) {
                count++;
            }
        }
        System.out.println("The number car have price less than price of the first car: " + count);
    }

    public static void main(String[] args) {
        Input();
        Output();
        Count();
    }
}
