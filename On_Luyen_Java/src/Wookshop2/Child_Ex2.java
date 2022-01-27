/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wookshop2;

/**
 *
 * @author Admin
 */
public class Child_Ex2 extends Excercise2{
    int series;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Child_Ex2() {
    }

    public Child_Ex2(int series) {
        this.series = series;
    }

    public Child_Ex2(int series, String name, double price) {
        super(name, price);
        this.series = series;
    }
    
    public double getSalePrice(){
        double gia;
        if(series<300)
        {
            gia = price + price*0.1;
        }
        else
        {
            gia = 0;
        }
        return gia;
    }

    @Override
    public String toString() {
        return name + "\t" + price + "\t" + series + "\t" + getSalePrice();
    }
    
    
    
}
