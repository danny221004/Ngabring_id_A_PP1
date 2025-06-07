package ui;

import service.Antrean;
import service.Penyimpanan;
import entity.Alat;
import java.util.Scanner;

/**
 * Kelas MenuUtama yang berfungsi sebagai antarmuka pengguna untuk menjalankan program.
 */
public class MenuUtama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek-objek yang dibutuhkan
        Antrean antrean = new Antrean();
        Penyimpanan penyimpanan = new Penyimpanan();

        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah Alat ke Inventaris");
            System.out.println("2. Tampilkan Daftar Alat");
            System.out.println("3. Proses Penyimpanan Alat ke Gudang");
            System.out.println("4. Lihat Antrean Alat yang Belum Diproses");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Tambah alat ke inventaris
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan nama alat: ");
                    String namaAlat = scanner.nextLine();
                    System.out.print("Masukkan jumlah alat: ");
                    int jumlahAlat = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan lokasi gudang: ");
                    String lokasiGudang = scanner.nextLine();
                    Alat alatBaru = new Alat(namaAlat, jumlahAlat, lokasiGudang);
                    antrean.enqueue(alatBaru); // Menambahkan alat ke antrean
                    System.out.println("Alat berhasil ditambahkan.");
                    break;

                case 2:
                    // Menampilkan daftar alat
                    antrean.tampilkanAntrean();
                    break;

                case 3:
                    // Proses penyimpanan alat ke gudang
                    System.out.println("\nProses Penyimpanan Alat ke Gudang (FIFO):");
                    Alat alatUntukDisimpan = antrean.dequeue(); // Mengambil alat pertama dalam antrean
                    if (alatUntukDisimpan != null) {
                        penyimpanan.simpanKeGudang(alatUntukDisimpan); // Proses penyimpanan alat
                    }
                    break;

                case 4:
                    // Lihat antrean alat yang belum diproses
                    antrean.lihatAntreanBelumDiproses();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
