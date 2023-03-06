/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

/**
 *
 * @author User
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    ArrayList <Kapal> data;
        Main(){
            data = new ArrayList<>();
        }
        
        void tambahData(int no,String nama,String warna,int price,String negara){
            data.add(new Kapal(no,nama,warna,price,negara));
        }
        
        void hapusData(int no_h){
            data.removeIf(item -> item.no == (no_h));
        }
        
        void ubahData(int no_h,int no,String nama,String warna,int price,String negara){
            int loop = -1;
            for(int i=0; i<data.size(); i++){
                if (data.get(i).no == no_h){
                    loop = i;
                    System.out.println(loop);   
                    data.set(loop,new Kapal(no,nama,warna,price,negara));
                }
            }
        }
        
        void showData(){
            for(Kapal kapal:data){
                System.out.println("|==================================|");
                System.out.println("No.Kapal    = "+kapal.getno());
                System.out.println("Nama Kapal  = "+kapal.getnama());
                System.out.println("Warna Kapal = "+kapal.getwarna());
                System.out.println("Harga Kapal = "+kapal.getprice());
                System.out.println("Asal Kapal  = "+kapal.getasal());
                System.out.println("|==================================|");
            }
        }

        public static void main(String[] args) {
            Scanner Masukkan = new Scanner (System.in);
            int Ngulang = 1;
            Main ship = new Main();
            while(Ngulang==1){
                System.out.println("\n/==========================\\");
                System.out.println("| No| Menu Pendataan Kapal |");
                System.out.println("|==========================|");
                System.out.println("| 1.| Tambah Data          |");
                System.out.println("| 2.| Lihat Data           |");
                System.out.println("| 3.| Ubah Data            |");
                System.out.println("| 4.| Hapus Data           |");
                System.out.println("| 5.| Keluar               |");
                System.out.println("\\==========================/");
                System.out.print("Masukkan Pilihanmu [1-5] : ");
                int pilih;
                pilih = Masukkan.nextInt();
                if (pilih == 1){
                    int no_kapal;
                    String nama_kapal;
                    String warna_kapal;
                    int harga_kapal;
                    String asal_kapal;
                    System.out.print("No.Kapal    : ");
                    no_kapal = Masukkan.nextInt();
                    System.out.print("Nama Kapal  : ");
                    nama_kapal = Masukkan.next();
                    System.out.print("Warna Kapal : ");
                    warna_kapal = Masukkan.next();
                    System.out.print("Harga Kapal : ");
                    harga_kapal = Masukkan.nextInt();
                    System.out.print("Asal Kapal  : ");
                    asal_kapal = Masukkan.next();
                    ship.tambahData(no_kapal,nama_kapal,warna_kapal,harga_kapal,asal_kapal);
                }else if(pilih == 2){
                    ship.showData();
                }else if(pilih == 3){
                    int no_kapal;
                    String nama_kapal;
                    String warna_kapal;
                    int harga_kapal;
                    String asal_kapal;
                    int pilihan;
                    System.out.print("Pilih No Kapal yang ingin diubah : ");
                    pilihan = Masukkan.nextInt();
                    System.out.print("No.Kapal    : ");
                    no_kapal = Masukkan.nextInt();
                    System.out.print("Nama Kapal  : ");
                    nama_kapal = Masukkan.next();
                    System.out.print("Warna Kapal : ");
                    warna_kapal = Masukkan.next();
                    System.out.print("Harga Kapal : ");
                    harga_kapal = Masukkan.nextInt();
                    System.out.print("Asal Kapal  : ");
                    asal_kapal = Masukkan.next();
                    ship.ubahData(pilihan,no_kapal,nama_kapal,warna_kapal,harga_kapal,asal_kapal);
                }else if(pilih == 4){
                    int hapus;
                    System.out.print("Masukkan No Kapal yang ingin dihapus : ");
                    hapus = Masukkan.nextInt();
                    ship.hapusData(hapus);
                }else if(pilih == 5){
                    System.exit(0);
                } else {
                    System.out.println("Kamu salah memasukkan pilihan menu!");
                }
            }
        }   
}