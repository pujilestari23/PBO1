public class Kreasi {
    // Attributes
    private String nama;
    private int tahun;
    private String deskripsi;
    private boolean isPublished;
    private int penjualan;
    private double harga;

    // Constructor
    public Kreasi(String nama, int tahun, String deskripsi, double harga) {
        this.nama = nama;
        this.tahun = tahun;
        this.deskripsi = deskripsi;
        this.isPublished = false;
        this.penjualan = 0;
        this.harga = harga;
    }

    // Setter and Getter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Class methods
    public void publish() {
        this.isPublished = true;
    }

    public void unpublish() {
        this.isPublished = false;
    }

    // Overloaded methods
    public void addPenjualan(int quantity) {
        this.penjualan += quantity;
    }

    public void addPenjualan() {
        this.penjualan += 1;
    }

    public double calculateRevenue() {
        return this.penjualan * this.harga;
    }

    public double calculateRevenue(int quantity) {
        return quantity * this.harga;
    }

    @Override
    public String toString() {
        return "Kreasi{" +
                "nama='" + nama + '\'' +
                ", tahun=" + tahun +
                ", deskripsi='" + deskripsi + '\'' +
                ", isPublished=" + isPublished +
                ", penjualan=" + penjualan +
                ", harga=" + harga +
                '}';
    }
}