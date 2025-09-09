import java.util.Scanner;

public class menuminuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membaca input dari pengguna

        // Menampilkan daftar menu minuman
        System.out.println("PILIHAN MENU MINIUMAN");
        System.out.println("1. Teh Manis");
        System.out.println("2. Kopi Susu");
        System.out.println("3. Air Mineral");
        System.out.print("Maukan pilihan anda (1-3): ");
        int pilihan = input.nextInt(); // Input pilihan menu

        // Memproses pilihan dan menampilkan harga
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Teh Manis. Harganya Rp5.000.");
                break;
            case 2:
                System.out.println("Anda memilih Kopi Susu. Harganya Rp7.000.");
                break;
            case 3:
                System.out.println("Anda memilih Air Mineral. Harganya Rp3.000.");
                break;
            default:
                System.out.println("Maaf, pilihan tidak valid."); // Pilihan di luar menu
        }

        System.out.println("Terima kasih!"); // Pesan penutup
        input.close();
    }
}

//cr : nopa