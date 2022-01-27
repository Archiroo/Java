/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop1;

/**
 *
 * @author Admin
 */
public class Excercise5 {
    String ID, Name, Gender, Address;
    double Grading;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getGrading() {
        return Grading;
    }

    public void setGrading(double Grading) {
        this.Grading = Grading;
    }

    public Excercise5() {
    }

    public Excercise5(String ID, String Name, String Gender, String Address, double Grading) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Grading = Grading;
    }
    
    public double Salary(){
        return 1.5*Grading;
    }
    
}
