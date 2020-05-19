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
public class ShapeFactory {
     public Shape createShape(ShapeType shapeType) {
        if (null != shapeType) switch (shapeType) {
            case hinhchunhat:
                return Rectangle.Singletonhinhchunhat();
            case hinhtron:
                return Circle.SingletonCircle();
            case hinhtamgiac:
                return Traingle.Singletonhinhtamgiac();
            default:
                break;
        }
        return null;
    }
}
