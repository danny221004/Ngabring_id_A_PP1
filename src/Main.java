import services.QueueService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueService service = new QueueService();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Inventaris Alat Kantor ===");
            System.out.println("1. Tambah Alat");
            System.out.println("2. Hapus Alat");
            System.out.println("3. Lihat Daftar Alat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama alat: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = input.nextInt();
                    service.tambahAlat(nama, jumlah);
                    break;
                case 2:
                    service.hapusAlat();
                    break;
                case 3:
                    service.tampilkanAlat();
                    break;
                case 0:
                    System.out.println("👋 Terima kasih!");
                    break;
                default:
                    System.out.println("⚠ Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
