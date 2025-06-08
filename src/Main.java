import entity.Alat;  // Mengimpor kelas Alat dari package entity untuk digunakan dalam program
import services.InventarisAlatService;  // Mengimpor kelas InventarisAlatService yang mengelola logika pemrosesan alat
import services.InventarisAlatKantor;  // Mengimpor kelas InventarisAlatKantor yang mengelola antrean alat
import util.InputUtil;  // Mengimpor kelas InputUtil untuk menangani input dari pengguna
import util.OutputUtil;  // Mengimpor kelas OutputUtil untuk menampilkan pesan ke konsol

public class Main {
    public static void main(String[] args) {
        // Membuat objek InventarisAlatKantor untuk mengelola antrean alat
        InventarisAlatKantor inventaris = new InventarisAlatKantor();

        // Membuat objek InventarisAlatService yang bertugas untuk berinteraksi dengan InventarisAlatKantor
        InventarisAlatService service = new InventarisAlatService(inventaris);

        boolean isRunning = true;  // Variabel untuk mengontrol jalannya loop utama program

        // Program berjalan selama isRunning bernilai true
        while (isRunning) {
            // Menampilkan menu kepada pengguna
            OutputUtil.printMessage("\n--- Menu Inventaris Alat Kantor ---");
            OutputUtil.printMessage("1. Tambah Alat Baru");
            OutputUtil.printMessage("2. Proses Alat Bru");
            OutputUtil.printMessage("3. Tampilkan Alat Perlu Diproses");
            OutputUtil.printMessage("4. Keluar");

            // Membaca pilihan menu dari pengguna
            int pilihan = InputUtil.inputInt("Pilih opsi: ");
            InputUtil.clearBuffer();  // Membersihkan buffer setelah input integer

            // Memproses pilihan menu
            switch (pilihan) {
                case 1:
                    // Jika pengguna memilih untuk menambah alat baru
                    String nama = InputUtil.inputString("Masukkan nama alat: ");
                    int jumlah = InputUtil.inputInt("Masukkan jumlah alat: ");
                    // Membuat objek Alat baru dengan status "Belum diproses"
                    Alat alat = new Alat(nama, jumlah, "Belum diproses");
                    // Menambahkan alat ke antrean menggunakan service
                    service.enqueue(alat);
                    break;
                case 2:
                    // Jika pengguna memilih untuk memproses alat pertama di antrean
                    service.dequeue();  // Memproses alat dengan dequeue
                    break;
                case 3:
                    // Jika pengguna memilih untuk menampilkan alat yang belum diproses
                    service.displayAlat();  // Menampilkan alat dalam antrean
                    break;
                case 4:
                    // Jika pengguna memilih untuk keluar
                    isRunning = false;  // Mengubah nilai isRunning menjadi false untuk keluar dari loop
                    OutputUtil.printMessage("Terima kasih! Program selesai.");
                    break;
                default:
                    // Jika pengguna memasukkan pilihan yang tidak valid
                    OutputUtil.printMessage("Pilihan tidak valid! Silakan coba lagi.");
                    break;
            }
        }
    }
}
