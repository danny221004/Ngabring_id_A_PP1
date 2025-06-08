package entity;

public class Alat {
    // Atribut nama untuk menyimpan nama alat
    private String nama;

    // Atribut jumlah untuk menyimpan jumlah alat
    private int jumlah;

    // Atribut status untuk menyimpan status dari alat (misalnya: "Belum diproses", "Telah diproses")
    private String status;

    // Konstruktor untuk membuat objek Alat dengan menginisialisasi nama, jumlah, dan status
    public Alat(String nama, int jumlah, String status) {
        this.nama = nama;      // Menetapkan nilai nama alat
        this.jumlah = jumlah;  // Menetapkan nilai jumlah alat
        this.status = status;  // Menetapkan nilai status alat
    }

    // Getter untuk mengambil nama alat
    public String getNama() {
        return nama;  // Mengembalikan nilai nama alat
    }

    // Getter untuk mengambil jumlah alat
    public int getJumlah() {
        return jumlah;  // Mengembalikan nilai jumlah alat
    }

    // Getter untuk mengambil status alat
    public String getStatus() {
        return status;  // Mengembalikan nilai status alat
    }

    // Setter untuk mengubah status alat
    public void setStatus(String status) {
        this.status = status;  // Mengubah nilai status alat
    }

    // Override metode toString() untuk menampilkan informasi alat dengan format yang jelas
    @Override
    public String toString() {
        return "Nama Alat: " + nama + ", Jumlah: " + jumlah + ", Status: " + status;
        // Mengembalikan string yang menampilkan nama, jumlah, dan status alat
    }
}