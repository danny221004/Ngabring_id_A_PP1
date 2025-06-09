// InventarisAlatKantorService.java
package services;

import entity.Alat;

public class InventarisAlatKantorService {

    private StrukturQueue antreanAlat = new StrukturQueue();

    public void enqueue(Alat alat) {
        antreanAlat.enqueue(alat);
        System.out.println("Alat berhasil ditambahkan: " + alat);
    }

    public void dequeue() {
        if (!antreanAlat.isEmpty()) {
            Alat alat = antreanAlat.dequeue();  // Mengambil alat pertama dalam antrean
            alat.setStatus("Telah diproses");   // Mengubah status alat menjadi "Telah diproses"
            System.out.println("Alat diproses: " + alat);  // Menampilkan alat yang telah diproses
        } else {
            System.out.println("Tidak ada alat yang perlu diproses.");
        }
    }

    // Menampilkan alat yang perlu diproses
    public void displayAlat() {
        if (!antreanAlat.isEmpty()) {
            System.out.println("Alat yang belum diproses:");
            antreanAlat.displayElements();  // Menampilkan alat yang belum diproses
        } else {
            System.out.println("Tidak ada alat yang belum diproses.");
        }
    }
}
