import java.util.Scanner;

public class hitungdiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja Anda: ");
        double totalBelanja = input.nextDouble();
        double diskon = 0;

        if (totalBelanja > 500000) {
            diskon = 0.2 * totalBelanja; // Diskon 20%
        } else if (totalBelanja >= 100000) {
            diskon = 0.1 * totalBelanja; // Diskon 10%
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        input.close();
    }
}