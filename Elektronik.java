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

    public String getMerek() {
        return merek;
    }

    public int getGaransiTahun() {
        return garansiTahun;
    }

    // OVERRIDING tampilInfo() — versi Elektronik
    @Override
    public void tampilInfo() {
        System.out.println("[ELEKTRONIK]");
        System.out.println("Nama   : " + getNama());
        // super.tampilInfo();
        System.out.println("Merek  : " + merek);
        System.out.println("Garansi: " + garansiTahun + " tahun");
        System.out.println("=========");
    }

   
}