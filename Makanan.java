public class Makanan extends Produk {
    private int expired;
    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }
    public int getExpired() {
        return expired;
    }
    public String getKategori() {
        return kategori;
    }
    

    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        System.out.println("Expired : " + expired + " hari");
    }
    public double hitungDiskon(double harga) {
        if (jumlahBeli >= 10) {
            return hitungTotalHarga(jumlahBeli) * 0.05; // Diskon 10% untuk pembelian 10 atau lebih
        }
        return 0;
    }
    public double hitungTotalHargaDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }
    


    @Override
    public double hitungPajak(double harga) {
        return harga * 0.1; // Pajak 10% untuk makanan
    }

    
}
