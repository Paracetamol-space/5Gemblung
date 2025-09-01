import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("      PROGRAM MENGHITUNG WAKTU");
        System.out.println("-------------------------------------");


        System.out.print("\nMasukkan total detik: ");
        int totalDetik = input.nextInt();

        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.printf("%d Jam, %d Menit, %d Detik%n", jam, menit, detik);

        input.close();
    }
}
