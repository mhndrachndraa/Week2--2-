package base; // di dalam folder base

public class Produk {
    private String nama; //hanya bisa diakses di dalam class Produk
    String kategori; // hanya bisa diakses dalam package toko
    protected double harga; //bisa diakses subclass meskipun beda package
    public int stok; //bisa diakses dari mana saja

    public Produk(String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public void tampilInfo(){
//semua atribut bisa diakses di sini - kita masih didalam class Produk
        System.out.println("Produk  : " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga   : Rp." + harga);
        System.out.println("Stok    : " + stok);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        
    }

}