import entity.Alat;
import services.InventarisAlatKantor;
import services.InventarisAlatService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InventarisAlatKantor inventaris = new InventarisAlatKantor();
        InventarisAlatService service = new InventarisAlatService(inventaris);

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            // Menampilkan menu manual
            System.out.println("\n--- Menu Pengelolaan Inventaris Alat Kantor ---");
            System.out.println("1. Tambah Alat Baru");
            System.out.println("2. Proses Alat yang Ada");
            System.out.println("3. Tampilkan Daftar Alat yang Belum Diproses");
            System.out.println("4. Keluar");

            int pilihan = inputInt("Pilih opsi (1-4): ");
            clearBuffer();

            // Tanpa Map, gunakan if-else biasa
            if (pilihan == 1) {
                String nama = inputString("Masukkan nama alat: ");
                int jumlah = inputInt("Masukkan jumlah alat: ");
                Alat alat = new Alat(nama, jumlah, "Belum diproses");
                service.enqueue(alat);
                System.out.println("Alat baru berhasil ditambahkan.");
            } else if (pilihan == 2) {
                System.out.println("Memproses alat...");
                service.dequeue();
            } else if (pilihan == 3) {
                System.out.println("Daftar alat yang belum diproses:");
                service.displayAlat();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
                isRunning = false;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static String inputString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int inputInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Input tidak valid. Masukkan angka: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void clearBuffer() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}