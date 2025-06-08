import entity.Alat;
import services.InventarisAlatKantor;
import services.InventarisAlatService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat objek InventarisAlatKantor untuk mengelola antrean alat
        InventarisAlatKantor inventaris = new InventarisAlatKantor();
        // Membuat objek InventarisAlatService yang bertugas untuk berinteraksi dengan InventarisAlatKantor
        InventarisAlatService service = new InventarisAlatService(inventaris);

        // Membuat Map yang menghubungkan pilihan dengan aksi yang sesuai
        java.util.Map<Integer, Runnable> menuActions = new java.util.HashMap<>();

        // Menambahkan aksi ke dalam Map
        menuActions.put(1, () -> {
            String nama = inputString("Masukkan nama alat: ");
            int jumlah = inputInt("Masukkan jumlah alat: ");
            Alat alat = new Alat(nama, jumlah, "Belum diproses");
            service.enqueue(alat);
            System.out.println("Alat baru berhasil ditambahkan ke antrean.");
        });

        menuActions.put(2, () -> {
            System.out.println("Anda memilih untuk memproses alat yang ada.");
            service.dequeue();
        });

        menuActions.put(3, () -> {
            System.out.println("Menampilkan alat yang belum diproses.");
            service.displayAlat();
        });

        menuActions.put(4, () -> {
            System.out.println("Terima kasih! Program selesai.");
            System.exit(0);  // Keluar dari aplikasi
        });

        boolean isRunning = true;

        // Program berjalan selama isRunning bernilai true
        while (isRunning) {
            // Menampilkan menu kepada pengguna
            System.out.println("\n--- Menu Pengelolaan Inventaris Alat Kantor ---");
            System.out.println("1. Tambah Alat Baru");
            System.out.println("2. Proses Alat yang Ada");
            System.out.println("3. Tampilkan Daftar Alat yang Belum Diproses");
            System.out.println("4. Keluar");

            // Membaca pilihan menu dari pengguna
            int pilihan = inputInt("Pilih opsi (1-4): ");
            clearBuffer();  // Membersihkan buffer setelah input integer

            // Menjalankan aksi berdasarkan pilihan yang diberikan
            if (menuActions.containsKey(pilihan)) {
                menuActions.get(pilihan).run();  // Menjalankan aksi yang terkait dengan pilihan
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    // Metode untuk menerima input string dari pengguna
    public static String inputString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Metode untuk menerima input integer dari pengguna
    public static int inputInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Input tidak valid. Masukkan angka: ");
            scanner.next(); // Membuang input yang tidak valid
        }
        return scanner.nextInt();
    }

    // Metode untuk membersihkan buffer setelah input
    public static void clearBuffer() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Membersihkan buffer setelah input integer
    }
}