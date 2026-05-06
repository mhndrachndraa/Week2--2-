abstract class Produk {
    private String nama; //hanya bisa diakses di dalam class Produk
    private String kategori; // hanya bisa diakses dalam package toko
    private double harga; //bisa diakses subclass meskipun beda package
    private int stok; //bisa diakses dari mana saja

    public Produk(String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public double hitungTotalHarga(int jumlahBeli){
        return harga * jumlahBeli;
    }
    public void beli(int jumlahBeli){
        if (jumlahBeli <= 0) {
            System.out.println("Jumlah pembelian tidak valid harus lebih dari 0.");
            return;
        } 
        if (jumlahBeli > stok) {
            System.out.println("Stok" + nama + " tidak cukup. Stok tersedia: " + stok);
            return;
        } else {
            stok -= jumlahBeli;
            System.out.println("Pembelian berhasil. Total harga: Rp." + hitungTotalHarga(jumlahBeli) + ". Sisa stok: " + stok);
        }
        
    }

    public abstract void tampilInfo();


    public abstract double hitungPajak(double harga);{
        
    }

}