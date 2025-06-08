package services;

import entity.Alat;  // Mengimpor kelas Alat
import java.util.LinkedList;
import java.util.Queue;

public class InventarisAlatKantor {
    private Queue<Alat> antreanAlat = new LinkedList<>();  // Queue untuk menyimpan alat

    // Menambahkan alat ke antrean
    public void enqueue(Alat alat) {
        antreanAlat.add(alat);
        System.out.println("Alat berhasil ditambahkan: " + alat);
    }

    // Mengambil alat pertama dari antrean dan memprosesnya
    public void dequeue() {
        if (!antreanAlat.isEmpty()) {
            Alat alat = antreanAlat.poll();  // Mengambil alat pertama dalam antrean
            alat.setStatus("Telah diproses");  // Mengubah status alat menjadi "Telah diproses"
            System.out.println("Alat diproses: " + alat);  // Menampilkan alat yang telah diproses
        } else {
            System.out.println("Tidak ada alat yang perlu diproses.");
        }
    }

    // Menampilkan alat yang perlu diproses
    public void displayAlat() {
        if (!antreanAlat.isEmpty()) {
            System.out.println("Alat yang belum diproses:");
            for (Alat alat : antreanAlat) {
                System.out.println(alat);  // Menampilkan alat yang belum diproses
            }
        } else {
            System.out.println("Tidak ada alat yang belum diproses.");
        }
    }
}
