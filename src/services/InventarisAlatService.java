package services;

import entity.Alat;  // Mengimpor kelas Alat dari package entity untuk digunakan dalam kelas ini

public class InventarisAlatService {
    // Deklarasi atribut inventaris yang menyimpan referensi ke objek InventarisAlatKantor
    private final InventarisAlatKantor inventaris;

    // Konstruktor yang menerima objek InventarisAlatKantor dan menyimpannya ke atribut inventaris
    public InventarisAlatService(InventarisAlatKantor inventaris) {
        this.inventaris = inventaris;  // Menyimpan referensi objek InventarisAlatKantor ke atribut inventaris
    }

    // Method enqueue untuk menambahkan alat ke dalam antrean
    public void enqueue(Alat alat) {
        inventaris.enqueue(alat);  // Memanggil metode enqueue() dari InventarisAlatKantor untuk menambahkan alat ke antrean
    }

    // Method dequeue untuk mengambil dan memproses alat pertama dalam antrean
    public void dequeue() {
        inventaris.dequeue();  // Memanggil metode dequeue() dari InventarisAlatKantor untuk mengambil dan memproses alat pertama
    }

    // Method displayAlat untuk menampilkan semua alat yang ada dalam antrean
    public void displayAlat() {
        inventaris.displayAlat();  // Memanggil metode displayAlat() dari InventarisAlatKantor untuk menampilkan alat dalam antrean
    }
}
