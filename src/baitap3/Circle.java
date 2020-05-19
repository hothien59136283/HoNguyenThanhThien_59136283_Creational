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
public class Circle extends Shape{
    
    private static Shape hinhtron;

    protected Circle() 
    {
    
    }
    
     public static Shape SingletonCircle() 
     {
        if (hinhtron == null) 
        {
            hinhtron = new Circle();
        }
        return hinhtron;
    }
            
            
            
    @Override
    public String Draw() {
       return "Ve Hinh Tron";
    }
    
    
}
