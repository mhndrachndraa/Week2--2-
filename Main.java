//package berbeda, bukan subclass class main

public class Main {

    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng", 3500, 100, "Makanan");
        System.err.println(p.getNama());
        System.err.println(p.getHarga());


        p.setHarga(4000);
        System.err.println(p.getHarga());
    }
    
}
