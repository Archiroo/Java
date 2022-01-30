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
public class Main_Ex4 {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static Child_Ex4 ex4[] = new Child_Ex4[100];

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
            System.out.print("Input Gender: ");
            String Gender = sc.nextLine();
            System.out.print("Input ClassID: ");
            String ClassID = sc.nextLine();
            System.out.print("Input Mark: ");
            double Mark = sc.nextDouble();

            Child_Ex4 ex = new Child_Ex4(ClassID, Mark, ID, Name, Gender);
            ex4[i] = ex;
        }
    }

    //Ouput
    public static void Output() {
        System.out.println("List of person: ");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "ClassID" + "\t" + "Mark" + "\t" + "Result");
        for (int i = 0; i < n; i++) {
            System.out.println(ex4[i].getID() + "\t" + ex4[i].getName() + "\t" + ex4[i].getGender() + "\t" + ex4[i].getClassID() + "\t" + ex4[i].getMark() + "\t" + ex4[i].Result());
        }
    }

    //Search
    public static void Search(String Class) {
        Class = sc.nextLine();
        System.out.println("List of person: "); 
        System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "ClassID" + "\t" + "Mark" + "\t" + "Result");
        for (int i = 0; i < n; i++) {
            if(ex4[i].getClassID().equals(Class)){
                System.out.println(ex4[i].getID() + "\t" + ex4[i].getName() + "\t" + ex4[i].getGender() + "\t" + ex4[i].getClassID() + "\t" + ex4[i].getMark() + "\t" + ex4[i].Result());
            }
        }
    }

    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input ClassID: ");
        String class_id = sc.nextLine();
        Search(class_id);
    }
}
