import java.util.Scanner;

public class logikaakses {
    public static void main(String[] args) {
        int pinRahasia = 1234; // PIN yang digunakan untuk autentikasi
        boolean isAkunTerblokir = false; // Status akun, true jika terblokir

        System.out.println("Masukkan PIN untuk akses fitur: ");
        Scanner input = new Scanner(System.in);
        int pinInput = input.nextInt(); // Input PIN dari user

        // Mengecek apakah akun tidak terblokir dan PIN benar
        if (!isAkunTerblokir && pinInput == pinRahasia) {
            System.out.println("Akses Diberikan, Selamat Datang!");

            int pilihanMenu = 1; // Misal user memilih menu 1

            // Menjalankan aksi sesuai menu yang dipilih
            switch (pilihanMenu) 
            {
                case 1:
                    System.out.println("Aksi yang dijalankan: Menampilkan data rahasia");
                    break;
                case 2:
                    System.out.println("Aksi yang dijalankan: Menghapus data");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        } else {
            System.out.println("Akses Ditolak, PIN Salah atau Akun Terblokir."); // Jika PIN salah atau akun terblokir
        }
        input.close(); // Menutup scanner
    }
} //cr : nopa
