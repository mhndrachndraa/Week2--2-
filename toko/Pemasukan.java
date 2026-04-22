package toko;

import base.Produk; //import class Produk dari package elektronik

//package elektronik (berbeda) - subckas dari Produk
class Pemasukan extends Produk {
    //Produk 
    private double totalPemasukan;

    public Pemasukan(String nama,double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan = 0;
    }

    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga; //protected  boleh, karena Pemasukan adalah subclass

            stok -= jumlah; //public boleh
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }



}
