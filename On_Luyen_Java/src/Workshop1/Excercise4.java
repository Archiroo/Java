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
public class Excercise4 {
    String ID, Name, ClassID;
    double Literature, Math;

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

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public double getLiterature() {
        return Literature;
    }

    public void setLiterature(double Literature) {
        this.Literature = Literature;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double Math) {
        this.Math = Math;
    }

    public Excercise4() {
    }

    public Excercise4(String ID, String Name, String ClassID, double Literature, double Math) {
        this.ID = ID;
        this.Name = Name;
        this.ClassID = ClassID;
        this.Literature = Literature;
        this.Math = Math;
    }
    public double Result(){
        return (Literature + Math)/2;
    }
}
