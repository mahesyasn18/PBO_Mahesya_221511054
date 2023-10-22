/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus2;

/**
 *
 * @author mahesya
 */
public class Cylinder extends Shape{
    
    protected double radius;
    protected double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }   
}
