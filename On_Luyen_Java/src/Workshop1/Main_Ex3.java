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
public class Main_Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        Excercise3 ex3[] = new Excercise3[n];
        
        //Input
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input Company: ");
            String Company = sc.nextLine();
            System.out.print("Input Color: ");
            String Color = sc.nextLine();
            System.out.print("Input Price: ");
            double Price = sc.nextDouble();
            
            Excercise3 ex = new Excercise3(ID, Name, Company, Color, Price);
            ex3[i] = ex;
        }
        
        //Output
        System.out.println("List of product: ");
        System.out.println("ID" + "\t" +"Name" + "\t" +"Company" + "\t" +"Color" + "\t" +"Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(ex3[i].getID() + "\t" + ex3[i].getName()+ "\t" + ex3[i].getCompany()+ "\t" + ex3[i].getColor()+ "\t" + ex3[i].getPrice()+ "\t" + ex3[i].Discount());
        }
        
        
        System.out.println("The list of product with color RED or BLUE:");
        System.out.println("ID" + "\t" +"Name" + "\t" +"Company" + "\t" +"Color" + "\t" +"Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            if("RED".equals(ex3[i].getColor()) || "BLUE".equals(ex3[i].getColor())){
                System.out.println(ex3[i].getID() + "\t" + ex3[i].getName()+ "\t" + ex3[i].getCompany()+ "\t" + ex3[i].getColor()+ "\t" + ex3[i].getPrice()+ "\t" + ex3[i].Discount());
            }
        }
 
    }
}
