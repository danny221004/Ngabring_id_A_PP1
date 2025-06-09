// Alat.java (Entity class)
package entity;

public class Alat {
    private String nama;   // Nama alat
    private int jumlah;    // Jumlah alat
    private String status; // Status alat (misalnya: Belum diproses)

    public Alat(String nama, int jumlah, String status) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.status = status;
    }

    // Getter untuk nama alat
    public String getNama() {
        return nama;
    }

    // Getter untuk jumlah alat
    public int getJumlah() {
        return jumlah;
    }

    // Getter untuk status alat
    public String getStatus() {
        return status;
    }

    // Setter untuk status alat
    public void setStatus(String status) {
        this.status = status;
    }

    // Override metode toString() untuk menampilkan informasi alat
    @Override
    public String toString() {
        return "Nama Alat: " + nama + ", Jumlah: " + jumlah + ", Status: " + status;
    }
}
