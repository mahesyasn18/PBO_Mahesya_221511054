/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus2;

/**
 *
 * @author mahesya
 */
public class Sphere extends Shape{
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius "+ radius;
    }
}
