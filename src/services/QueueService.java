package services;

import entity.Alat;
import java.util.LinkedList;
import java.util.Queue;

public class 2QueueService {
    private Queue<Alat> antrian = new LinkedList<>();

    public void tambahAlat(String nama, int jumlah) {
        Alat alat = new Alat(nama, jumlah);
        antrian.add(alat);
        System.out.println("✔ Alat berhasil ditambahkan: " + alat);
    }

    public void hapusAlat() {
        if (antrian.isEmpty()) {
            System.out.println("⚠ Tidak ada alat untuk dihapus.");
        } else {
            Alat alat = antrian.poll();
            System.out.println("✔ Alat dihapus: " + alat);
        }
    }

    public void tampilkanAlat() {
        if (antrian.isEmpty()) {
            System.out.println("⚠ Tidak ada alat dalam inventaris.");
        } else {
            System.out.println("📦 Daftar Alat Kantor:");
            int no = 1;
            for (Alat alat : antrian) {
                System.out.println(no++ + ". " + alat);
            }
        }
    }
}
