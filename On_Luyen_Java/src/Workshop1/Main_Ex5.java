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
public class Main_Ex5 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static Excercise5 ex5[] = new Excercise5[100];
    
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
            System.out.print("Input Address: ");
            String Address = sc.nextLine();
            System.out.print("Input Grading: ");
            double Grading = sc.nextDouble();
            
            Excercise5 ex = new Excercise5(ID, Name, Gender, Address, Grading);
            ex5[i] = ex;
        }
    }
    
    //Output
    public static void Output(){
        System.out.println("List of teacher:");
        System.out.println("ID" + "\t" +"Name" + "\t" +"Gender" + "\t" +"Address" + "\t" +"Grading" +"\t" +"Salary");
        for (int i = 0; i < n; i++) {
            System.out.println(ex5[i].getID()+"\t"+ex5[i].getName()+"\t"+ex5[i].getGender()+"\t"+ex5[i].getAddress() +"\t"+ex5[i].getGrading()+"\t"+ex5[i].Salary());
        }
    }
    
    //Display the list of teacher which has smallest salary
    public static void SmallestSalary(){
        double smallest = ex5[0].Salary();
        for (int i = 0; i < n; i++) {
            if(ex5[i].Salary() < smallest){
                smallest = ex5[i].Salary();
            }
        }
        System.out.println("List of teacher which has smallest salary:");
        System.out.println("ID" + "\t" +"Name" + "\t" +"Gender" + "\t" +"Address" + "\t" + "\t" +"Grading" +"\t" +"Salary");
        for (int i = 0; i < n; i++) {
            if(ex5[i].Salary() == smallest){
                System.out.println(ex5[i].getID()+"\t"+ex5[i].getName()+"\t"+ex5[i].getGender()+"\t"+ex5[i].getAddress()+"\t" +ex5[i].getGrading()+"\t"+ex5[i].Salary());
            }
        }
    }
    public static void main(String[] args) {
        Input();
        Output();
        SmallestSalary();
    }
}
