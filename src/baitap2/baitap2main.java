/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Thanh Thien
 */
public class baitap2main {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder.Builder().addString("ABC").
                addFloat((float) 16.7).addBool(true).build();
        System.out.println(str.toString());
    }
}
