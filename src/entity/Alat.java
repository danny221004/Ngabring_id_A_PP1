package entity;

public class Alat {
<<<<<<< HEAD
    // Atribut nama untuk menyimpan nama alat 123456789
=======
>>>>>>> fd609fd (membuat node dan queue)
    private String nama;
    private int jumlah;
    private String status;

    // Konstruktor untuk membuat objek Alat dengan menginisialisasi nama, jumlah, dan status
    public Alat(String nama, int jumlah, String status) {
        this.nama = nama;      // Menetapkan nilai nama alat
        this.jumlah = jumlah;  // Menetapkan nilai jumlah alat
        this.status = status;  // Menetapkan nilai status alat
    }

    // Getter untuk mengambil nama alat
    public String getNama() {
        return nama;
    }
    // Getter untuk mengambil jumlah alat
    public int getJumlah() {
        return jumlah;
    // Getter untuk mengambil status alat
    public String getStatus() {
        return status;
    }
    // Setter untuk mengubah status alat
    public void setStatus(String status) {
        this.status = status;

    // Override metode toString() untuk menampilkan informasi alat dengan format yang jelas
    @Override
    public String toString() {
        return "Nama Alat: " + nama + ", Jumlah: " + jumlah + ", Status: " + status;
        // Mengembalikan string yang menampilkan nama, jumlah, dan status alat
    }
}
