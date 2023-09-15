/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.kasus2;

/**
 *
 * @author mahesya
 */
public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }
    
    public Item(String name) { 
        this();
        System.out.println(this.name); //chaining constructor
    }
 }