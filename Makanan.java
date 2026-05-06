public class Makanan extends Produk {
    private int expired;
    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        System.out.println("Expired : " + expired + " hari");
    }
    public void setExpired(int expired) {
        if (expired < 0) {
            System.out.println("Masa berlaku harus lebih dari 0 hari.");
        } else {
            this.expired = expired;
        }
    }
    public void setExpired(int expired, String type) {
        if (expired > 4) {
            System.out.println("Masa berlaku harus lebih dari 0 hari.");
        } else {
        } if (expired < 2) {
            System.out.println("Masa berlaku harus lebih dari 0 hari.");
        } else {
            this.expired = expired;
        }
    }
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.1; // Pajak 10% untuk makanan
    }

    
}
