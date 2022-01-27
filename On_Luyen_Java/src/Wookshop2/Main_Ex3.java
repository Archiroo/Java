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
public class Main_Ex3 {
    static int n;
    static Scanner sc = new Scanner(System.in);
    static Child_Ex3 ex3[] = new Child_Ex3[100];
    
    //Input
    public static void Input(){
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
            
            Child_Ex3 ex = new Child_Ex3(ClassID, Mark, ID, Name, Gender);
            ex3[i] = ex;
        }
    }
    
    //Output
    public static void Output(){
        System.out.println("List of person");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"ClassID"+"\t"+"Mark"+"\t"+"Result");
        for (int i = 0; i < n; i++) {
            System.out.println(ex3[i].getID()+"\t"+ex3[i].getName()+"\t"+ex3[i].getGender()+"\t"+ex3[i].getClassID()+"\t"+ex3[i].getMark()+"\t"+ex3[i].Result());
        }
    }
    
    //Search
    public static void Search(String nam){
        nam = sc.nextLine();
        System.out.println("Person with name");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"ClassID"+"\t"+"Mark"+"\t"+"Result");
        for (int i = 0; i < n; i++) {
            if(ex3[i].getName().equals(nam)){
                System.out.println(ex3[i].getID()+"\t"+ex3[i].getName()+"\t"+ex3[i].getGender()+"\t"+ex3[i].getClassID()+"\t"+ex3[i].getMark()+"\t"+ex3[i].Result());
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
