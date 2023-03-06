/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author User
 */
public class Kapal {
    int no;
    String nama_barang;
    String warna_barang;
    int harga;
    String asal_kapal;

    Kapal(int no,String nama,String warna,int price,String negara){
        this.no = no;
        this.nama_barang = nama;
        this.warna_barang = warna;
        this.harga = price;
        this.asal_kapal = negara;
    }

//    Kapal(int no, String nama) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public int getno(){
        return no;
    }
    public String getnama(){
        return nama_barang;
    }

    public String getwarna(){
        return warna_barang;
    }

    public int getprice(){
        return harga;
    }
    public String getasal(){
        return asal_kapal;
    }
}
