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
public class Main_Ex7 {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static Excercise7 ex7[] = new Excercise7[100];

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

            Excercise7 ex = new Excercise7(ID, Name, Country, Color, Price);
            ex7[i] = ex;
        }
    }

    //Output
    public static void Output() {
        System.out.println("List of car: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Country" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount" + "\t" + "New Price");
        for (int i = 0; i < n; i++) {
            System.out.println(ex7[i].getID() + "\t" + ex7[i].getName() + "\t" + ex7[i].getCountry() + "\t" + ex7[i].getColor() + "\t" + ex7[i].getPrice() + "\t" + ex7[i].Discount() + "\t" + "\t" + ex7[i].NewPrice());
        }
    }

    //Display car with smallest price
    public static void SmallestPrice() {
        double smallest = ex7[0].NewPrice();
        for (int i = 0; i < n; i++) {
            if (ex7[i].NewPrice() < smallest) {
                smallest = ex7[i].NewPrice();
            }
        }
        System.out.println("Car with smallest price: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Country" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount" + "\t" + "New Price");
        for (int i = 0; i < n; i++) {
            if (ex7[i].NewPrice() == smallest) {
                System.out.println(ex7[i].getID() + "\t" + ex7[i].getName() + "\t" + ex7[i].getCountry() + "\t" + ex7[i].getColor() + "\t" + ex7[i].getPrice() + "\t" + ex7[i].Discount() + "\t" + "\t" + ex7[i].NewPrice());
            }
        }
    }

    //Display car with color input from user
    public static void CarColor(String color) {
        color = sc.nextLine();
        System.out.println("Car with color " + color + ": ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Country" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount" + "\t" + "New Price");
        for (int i = 0; i < n; i++) {
            if (ex7[i].getColor().equals(color)) {
                System.out.println(ex7[i].getID() + "\t" + ex7[i].getName() + "\t" + ex7[i].getCountry() + "\t" + ex7[i].getColor() + "\t" + ex7[i].getPrice() + "\t" + ex7[i].Discount() + "\t" + "\t" + ex7[i].NewPrice());
            }
        }
    }

    //Sort price ascending
    public static void SortPriceAsc() {
        Excercise7 temp = ex7[0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (ex7[i].NewPrice() > ex7[j].NewPrice()) {
                    temp = ex7[j];
                    ex7[j] = ex7[i];
                    ex7[i] = temp;
                }
            }
        }
        System.out.println("Sort car with price ascending: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Country" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount" + "\t" + "New Price");
        for (int i = 0; i < n; i++) {
            System.out.println(ex7[i].getID() + "\t" + ex7[i].getName() + "\t" + ex7[i].getCountry() + "\t" + ex7[i].getColor() + "\t" + ex7[i].getPrice() + "\t" + ex7[i].Discount() + "\t" + "\t" + ex7[i].NewPrice());
        }

    }
    
    //Count car with higher price input from user

    public static void main(String[] args) {
        Input();
        Output();
        SmallestPrice();
        System.out.print("Input color: ");
        String Color = sc.nextLine();
        CarColor(Color);
        SortPriceAsc();
    }
}
