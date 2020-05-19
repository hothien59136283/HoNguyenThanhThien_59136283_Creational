/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.ArrayList;

/**
 *
 * @author Thanh Thien
 */
public class HoaDon {
    HoaDonHeader Hearder;
    ArrayList<CTHD> dsCTHD = new ArrayList<>(); 
    
   protected HoaDon (HoaDonBulder Builder)
   {
       this.dsCTHD = Builder.dsCTHD;
       this.Hearder = Builder.Hearder; 
   }

    @Override
    public String toString() {
        String  X = Hearder.toString();
        for ( int i = 0;i<dsCTHD.size(); i++  )
        {
            X += dsCTHD.get(i).toString();
        }
        return  X;
    }
   
   public static class HoaDonBulder
   {
    HoaDonHeader Hearder;
    ArrayList<CTHD> dsCTHD = new ArrayList<>();
    
    public HoaDonBulder addHoaDonHearder(HoaDonHeader Hearder)
   {
        this.Hearder = Hearder;
        return this;
   }
    public HoaDonBulder addCTHD(CTHD CTHd)
   {
       this.dsCTHD.add(CTHd) ;
       return this;
   }
    public HoaDon Build()
   {
       return new HoaDon(this);
   }
   }

}
