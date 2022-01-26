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
public class Main_Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        Excercise4 ex4[] = new Excercise4[n];
        
        //Input
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input ClassID: ");
            String ClassID = sc.nextLine();
            System.out.print("Input Literature: ");
            double Literature = sc.nextDouble();
            System.out.print("Input Math: ");
            double Math = sc.nextDouble();
            
            Excercise4 ex = new Excercise4(ID, Name, ClassID, Literature, Math);
            ex4[i] = ex;
        }
        
        //Output
        System.out.println("List of pupil: ");
        System.out.println("ID" + "\t" +"Name" + "\t" +"ClassID" + "\t" +"Literature" + "\t" +"Math" + "\t" +"Result" );
        for (int i = 0; i < n; i++) {
            System.out.println(ex4[i].getID()+"\t"+ex4[i].getName()+"\t"+ex4[i].getClassID()+"\t"+ex4[i].getLiterature()+"\t"+"\t"+ex4[i].getMath()+"\t"+ex4[i].Result());
        }
        
        //Display with highest result
        double highestResult = ex4[0].Result();
        for (int i = 0; i < n; i++) {
            if(ex4[i].Result() > highestResult){
                highestResult = ex4[i].Result();
            }
        }
        System.out.println("Pupil with highest result: ");
        System.out.println("ID" + "\t" +"Name" + "\t" +"ClassID" + "\t" +"Literature" + "\t" +"Math" + "\t" +"Result" );
        for (int i = 0; i < n; i++) {
            if(ex4[i].Result() == highestResult){
                System.out.println(ex4[i].getID()+"\t"+ex4[i].getName()+"\t"+ex4[i].getClassID()+"\t"+ex4[i].getLiterature()+"\t"+"\t"+ex4[i].getMath()+"\t"+ex4[i].Result());
            }
        }
    }
}
