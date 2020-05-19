/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Thanh Thien
 */
public class BuildMain {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.HoaDonBulder()
                            .addHoaDonHearder(new HoaDonHeader("001", "14/5/1999", "Ho Nguyen Thanh Thien"))
                            .addCTHD(new CTHD("Áo dài thuê", 1, 25000, 20))
                            .addCTHD(new CTHD("Váy mới về hàng", 1, 100000, 15))
                            .Build();
       
        System.out.println(hoaDon.toString());
    }
}
