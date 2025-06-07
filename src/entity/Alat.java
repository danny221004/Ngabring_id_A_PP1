package entity;

/**
 * Kelas ini digunakan untuk menyimpan data alat kantor dalam antrean.
 * Setiap alat memiliki nama, jumlah, lokasi gudang tempat alat disimpan, dan status proses.
 */
public class Alat {
    private String nama;
    private int jumlah;
    private String lokasiGudang;
    private boolean diproses;  // Menandakan apakah alat sudah diproses dan dipindahkan ke gudang
    private Alat next; // referensi ke alat berikutnya dalam antrean

    // Konstruktor untuk membuat objek alat baru
    public Alat(String nama, int jumlah, String lokasiGudang) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.lokasiGudang = lokasiGudang;
        this.diproses = false; // Alat belum diproses saat ditambahkan
        this.next = null;
    }

    // Getter dan Setter untuk setiap properti alat
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getLokasiGudang() {
        return lokasiGudang;
    }

    public void setLokasiGudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
    }

    public boolean isDiproses() {
        return diproses;
    }

    public void setDiproses(boolean diproses) {
        this.diproses = diproses;
    }

    public Alat getNext() {
        return next;
    }

    public void setNext(Alat next) {
        this.next = next;
    }

    // Menampilkan informasi alat
    public void tampilkanInfo() {
        String status = diproses ? "Diproses" : "Belum Diproses";
        System.out.println("Nama Alat: " + nama + " | Jumlah: " + jumlah +
                " | Lokasi Gudang: " + lokasiGudang + " | Status: " + status);
    }
}
