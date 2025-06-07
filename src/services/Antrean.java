package service;

import entity.Alat;

/**
 * Kelas ini mengelola antrean alat menggunakan struktur data queue (FIFO).
 */
public class Antrean {
    private Alat front, rear; // front dan rear untuk antrean

    // Konstruktor
    public Antrean() {
        front = rear = null;
    }

    // Mengecek apakah antrean kosong
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Menambahkan alat ke dalam antrean (queue)
     * @param alat Alat yang akan ditambahkan ke antrean
     */
    public void enqueue(Alat alat) {
        if (isEmpty()) {
            front = rear = alat;
        } else {
            rear.setNext(alat); // tambahkan alat ke belakang antrean
            rear = alat; // update rear
        }
    }

    /**
     * Mengambil alat dari antrean (FIFO) untuk diproses
     * @return Alat yang diproses
     */
    public Alat dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean kosong, tidak ada alat yang tersedia.");
            return null;
        }

        Alat alatDiproses = front;
        front = front.getNext(); // pindahkan front ke node berikutnya
        return alatDiproses; // Kembalikan alat yang diproses
    }

    /**
     * Menampilkan semua alat dalam antrean
     */
    public void tampilkanAntrean() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }

        Alat current = front;
        int id = 1;
        while (current != null) {
            current.tampilkanInfo(); // Menampilkan info setiap alat dalam antrean
            current = current.getNext(); // berpindah ke alat berikutnya
            id++;
        }
    }

    /**
     * Menampilkan antrean alat yang belum diproses (masih dalam antrean)
     */
    public void lihatAntreanBelumDiproses() {
        if (isEmpty()) {
            System.out.println("Antrean kosong, tidak ada alat yang menunggu untuk diproses.");
            return;
        }

        Alat current = front;
        System.out.println("\nAntrean Belum Diproses:");
        while (current != null) {
            // Hanya tampilkan alat yang belum diproses (belum dipindahkan ke gudang)
            if (!current.isDiproses()) {
                current.tampilkanInfo(); // Menampilkan alat yang belum diproses
            }
            current = current.getNext(); // berpindah ke alat berikutnya
        }
    }

    /**
     * Mengambil alat berdasarkan ID dan memprosesnya
     * @param id ID alat yang ingin dipilih
     * @return Alat yang dipilih
     */
    public Alat pilihAlatById(int id) {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return null;
        }

        Alat current = front;
        int counter = 1;

        while (current != null) {
            if (counter == id) {
                return current; // Alat ditemukan berdasarkan ID
            }
            current = current.getNext();
            counter++;
        }
        System.out.println("Alat dengan ID " + id + " tidak ditemukan.");
        return null;
    }
}
