/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 * Nama     : Moch Rizki Maulana N
 * Kelas    : IF-1 2018
 * Nim      : 10118012
 * Deskripsi Program : kambing global
 *
 * @author LENOVO
 */
public class KambingGlobal {
    // variabel jumlahKambing diubah menjadi variabel instance
    int jumlahKambing =88;
    
    //method untuk menampilkan jumlahKambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing : "+jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing=jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambahkan : "+jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlh Kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
