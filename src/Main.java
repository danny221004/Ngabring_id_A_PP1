// Main.java
import entity.Alat;
import services.InventarisAlatKantorService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek InventarisAlatKantorService untuk mengelola antrean
        InventarisAlatKantorService service = new InventarisAlatKantorService();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            // Menampilkan menu kepada pengguna
            System.out.println("\n--- Menu Pengelolaan Inventaris Alat Kantor ---");
            System.out.println("1. Tambah Alat Baru");
            System.out.println("2. Proses Alat yang Ada");
            System.out.println("3. Tampilkan Daftar Alat yang Belum Diproses");
            System.out.println("4. Keluar");

            // Membaca pilihan menu dari pengguna
            int pilihan = inputInt(scanner, "Pilih opsi (1-4): ");

            switch (pilihan) {
                case 1:
                    // Menambahkan alat baru
                    String nama = inputString(scanner, "Masukkan nama alat: ");
                    int jumlah = inputInt(scanner, "Masukkan jumlah alat: ");
                    Alat alat = new Alat(nama, jumlah, "Belum diproses");
                    service.enqueue(alat);
                    System.out.println("Alat baru berhasil ditambahkan ke antrean.");
                    break;
                case 2:
                    // Memproses alat yang ada
                    service.dequeue();
                    break;
                case 3:
                    // Menampilkan alat yang belum diproses
                    service.displayAlat();
                    break;
                case 4:
                    // Keluar dari aplikasi
                    System.out.println("Terima kasih! Program selesai.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }

        // Menutup scanner setelah program selesai
        scanner.close();
    }

    // Metode untuk menerima input string dari pengguna
    public static String inputString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine(); // Menerima input string
    }

    // Metode untuk menerima input integer dari pengguna
    public static int inputInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Input tidak valid. Masukkan angka: ");
            scanner.next();  // Membuang input yang tidak valid
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character left by nextInt
        return value;
    }
}
