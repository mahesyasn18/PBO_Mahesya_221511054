/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.StudiKasus2;

import java.text.DecimalFormat;


/**
 *
 * @author mahesya
 */
public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Amount of paint needed for " + deck + ": " + fmt.format(deckAmt)  + " gallons");
        System.out.println("Amount of paint needed for " + bigBall + ": " + fmt.format(ballAmt) + " gallons");
        System.out.println("Amount of paint needed for " + tank + ": " + fmt.format(tankAmt) + " gallons");
        
    }
}
