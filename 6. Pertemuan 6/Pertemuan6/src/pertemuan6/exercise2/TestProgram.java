/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6.exercise2;

import pertemuan6.exercise2.Shape;

/**
 *
 * @author mahesya
 */
public class TestProgram {
    public static void main(String[] args) {
        Shape aShape = new Shape();
        System.out.println(aShape);
        System.out.println(aShape.getColor());
        System.out.println(aShape.isFilled());
        aShape.setColor("orange");
        aShape.setFilled(false);
        System.out.println(aShape);
        Shape bShape = new Shape("red", false);
        System.out.println(bShape);
    }
}
