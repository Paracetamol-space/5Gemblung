import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membaca input dari pengguna

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble(); // Input angka pertama

        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next(); // Input operator

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble(); // Input angka kedua

        double hasil; // Variabel untuk menyimpan hasil perhitungan

        // Memproses operator dan menghitung hasil
        switch (operator) {
            case "+":
                hasil = angka1 + angka2; // Penjumlahan
                System.out.println("Hasil: " + hasil);
                break;
            case "-":
                hasil = angka1 - angka2; // Pengurangan
                System.out.println("Hasil: " + hasil);
                break;
            case "*":
                hasil = angka1 * angka2; // Perkalian
                System.out.println("Hasil: " + hasil);
                break;
            case "/":
                if (angka2 != 0) {
                    hasil = angka1 / angka2; // Pembagian
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!"); // Validasi pembagian nol
                }
                break;
            default:
                System.out.println("Operator tidak valid!"); // Operator tidak dikenali
                break;
        }

        input.close(); // Menutup scanner
    }
} 

//cr : nopa
