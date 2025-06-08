package services;

import entity.Alat;  // Mengimpor kelas Alat dari package entity untuk digunakan dalam kelas ini
import java.util.LinkedList;
import java.util.Queue;

public class InventarisAlatKantor {
    // Atribut antreanAlat untuk menyimpan alat yang masih dalam antrean menggunakan Queue
    private Queue<Alat> antreanAlat = new LinkedList<>();

    // Method enqueue untuk menambahkan alat ke dalam antrean
    public void enqueue(Alat alat) {
        antreanAlat.add(alat);  // Menambahkan alat ke antrean menggunakan metode add() dari Queue
    }

    // Method dequeue untuk mengambil alat pertama dari antrean dan memprosesnya
    public void dequeue() {
        if (!antreanAlat.isEmpty()) {
            Alat alat = antreanAlat.poll(); // Mengambil alat pertama dan menghapusnya dari antrean
            alat.setStatus("Telah diproses"); // Mengubah status alat menjadi "Telah diproses"
            System.out.println("Alat diproses: " + alat);  // Menampilkan alat yang telah diproses
        } else {
            System.out.println("Tidak ada alat yang perlu diproses.");  // Menangani kasus antrean kosong
        }
    }

    // Method displayAlat untuk menampilkan semua alat yang masih dalam antrean dan belum diproses
    public void displayAlat() {
        if (!antreanAlat.isEmpty()) {
            System.out.println("Alat yang belum diproses:");  // Memberikan informasi bahwa alat belum diproses
            for (Alat alat : antreanAlat) {
                System.out.println(alat);  // Menampilkan semua alat dalam antrean
            }
        } else {
            System.out.println("Tidak ada alat yang belum diproses.");  // Menangani kasus antrean kosong
        }
    }
}
