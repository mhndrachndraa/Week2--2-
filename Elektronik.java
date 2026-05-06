class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public Elektronik(String nama, String merek, double harga,
        int stok, int garansiTahun) {
        super(nama, harga, stok, "Elektronik");
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }

   
}