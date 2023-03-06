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
    String nama_kapal;
    String warna_kapal;
    int harga;
    String asal_kapal;

    Kapal(int no,String nama,String warna,int price,String negara){
        this.no = no;
        this.nama_kapal = nama;
        this.warna_kapal = warna;
        this.harga = price;
        this.asal_kapal = negara;
    }

    public int getno(){
        return no;
    }
    public String getnama(){
        return nama_kapal;
    }

    public String getwarna(){
        return warna_kapal;
    }

    public int getprice(){
        return harga;
    }
    public String getasal(){
        return asal_kapal;
    }
}
