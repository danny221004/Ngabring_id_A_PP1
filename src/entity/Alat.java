package entity;

public class Alat {
    private String nama;
    private int jumlah;

    public Alat(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public String toString() {
        return nama + " - " + jumlah + " buah";
    }
}
