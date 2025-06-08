package util;

import java.util.Scanner;  // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class InputUtil {
    // Membuat instance Scanner yang bersifat static, agar hanya ada satu objek Scanner yang digunakan di seluruh kelas
    private static final Scanner scanner = new Scanner(System.in);

    // Method untuk membaca input string dari pengguna dengan memberikan prompt
    public static String inputString(String prompt) {
        System.out.print(prompt);  // Menampilkan prompt yang diberikan sebagai parameter
        return scanner.nextLine();  // Membaca dan mengembalikan input pengguna berupa string
    }

    // Method untuk membaca input integer dari pengguna dengan memberikan prompt
    public static int inputInt(String prompt) {
        System.out.print(prompt);  // Menampilkan prompt yang diberikan sebagai parameter
        return scanner.nextInt();  // Membaca dan mengembalikan input pengguna berupa integer
    }

    // Method untuk membersihkan buffer setelah membaca input berupa angka
    public static void clearBuffer() {
        scanner.nextLine();  // Membaca baris kosong yang ada di buffer setelah membaca input integer
    }
}
