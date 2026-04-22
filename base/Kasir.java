package base;

public class Kasir {
    void cekProduk(Produk p){
        System.out.println(p.stok);     // public - boleh
        System.out.println(p.harga);    // protected - boleh, satu package
        System.out.println(p.kategori); // default - boleh, satu package
        System.out.println(p.nama);     // ERROR - privete
        
    }
}
