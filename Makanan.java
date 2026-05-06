public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    public int getExpired() {
        return expired;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Jenis : Makanan");
        System.out.println("Expired : " + expired + " hari");
    }

    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10) {
            return hitungTotalHarga(jumlahBeli) * 0.1; // 10%
        }
        return 0;
    }

    public double hitungTotalHargaDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTotalHarga(jumlahBeli) - hitungTotalHargaDiskon(jumlahBeli, persenDiskon);
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.1;
    }
}
