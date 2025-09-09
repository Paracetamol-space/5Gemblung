import java.util.Scanner;

public class pendaftaransim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membaca input dari pengguna

        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt(); // Input umur

        // Mengecek apakah umur sudah memenuhi syarat
        if (umur >= 17) {
            System.out.println("Apakah anda sudah lulus ujian teori? (Y/T)");
            char lulusUjian = input.next().charAt(0); // Input status kelulusan ujian teori

            // Mengecek kelulusan ujian teori
            if (lulusUjian == 'Y' || lulusUjian == 'y') {
                System.out.println("Selamat, anda berhak membuat SIM."); // Syarat terpenuhi
            } else{
                System.out.println("Maaf, Anda harus lulus ujian teori terlebih dahulu."); // Belum lulus ujian teori
            }
        } else {
            System.out.println("Maaf, umur anda belum cukup untuk membuat SIM."); // Umur belum cukup
        }
        input.close(); // Menutup scanner
    }
}

