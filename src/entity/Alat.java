package entity;

public class Alat {
    private String nama;
    private int jumlah;
    private String status;

    public Alat(String nama, int jumlah, String status) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Nama Alat: " + nama + ", Jumlah: " + jumlah + ", Status: " + status;
    }
}
