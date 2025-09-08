import java.util.Scanner;

public class hitungdiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja Anda: ");
        double totalBelanja = input.nextDouble();
        double diskon = 0;
        double persentaseDiskon = 0;

        if (totalBelanja > 500000) {
            persentaseDiskon = 20;
            diskon = 0.2 * totalBelanja; // Diskon 20%
        } else if (totalBelanja >= 100000) {
            persentaseDiskon = 10;
            diskon = 0.1 * totalBelanja; // Diskon 10%
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("---- Detail Pembayaran ----");
        System.out.println("Total belanja: Rp " + String.format("%.0f", totalBelanja));
        
        if (persentaseDiskon > 0) {
            System.out.println("Diskon (" + (int)persentaseDiskon + "%): Rp " + String.format("%.0f", diskon));
        } else {
            System.out.println("Diskon: Rp 0 (Tidak ada diskon)");
        }
        
        System.out.println("Total yang harus dibayar: Rp " + String.format("%.0f", totalBayar));
        
        input.close();
    }
}