/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Thanh Thien
 */
public class Rectangle extends Shape{
    //Flelds
    private static Rectangle hinhchunhat;
    //constructor
    protected Rectangle() {
    }
    //Methods
    public static Rectangle Singletonhinhchunhat()
    {
        if(hinhchunhat == null)
        {
            hinhchunhat = new Rectangle();
        }
        return hinhchunhat;
    }
    
    @Override
    public String Draw() {
        return "Ve Hinh Chu Nhat";
    }
    
    
}
