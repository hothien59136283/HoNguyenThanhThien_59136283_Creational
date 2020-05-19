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
public class HoaDonHeader {
    String IDOder, Date, NameCustomer;

    public HoaDonHeader(String IDOder, String Date, String NameCustomer) {
        this.IDOder = IDOder;
        this.Date = Date;
        this.NameCustomer = NameCustomer;
    }

    public HoaDonHeader() {
    }

    public String getIDOder() {
        return IDOder;
    }

    public void setIDOder(String IDOder) {
        this.IDOder = IDOder;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String NameCustomer) {
        this.NameCustomer = NameCustomer;
    }

    @Override
    public String toString() {
        return "\n HoaDonHeader{" + "Mã Hóa Đơn:=" + IDOder + ",Ngày Bán Hàng:=" + Date + ", Họ và Tên khách=" + NameCustomer + '}';
    }
    
    
}

