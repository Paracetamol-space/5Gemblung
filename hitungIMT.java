import java.util.Scanner;

public class hitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membaca input dari pengguna

        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tinggicm = input.nextDouble(); // Input tinggi badan dalam cm
        double tinggi = tinggicm / 100; // Konversi tinggi ke meter

        System.out.print("Masukkan berat badan Anda (kg): ");
        double berat = input.nextDouble(); // Input berat badan dalam kg

        double imt = berat / (tinggi * tinggi); // Menghitung IMT
        System.out.printf("Indeks Massa Tubuh (IMT) Anda adalah: %.2f\n", imt);

        // Menentukan kategori IMT
        if (imt < 18.5) {
            System.out.println("Kategori: Kekurangan Berat Badan");
        } else if (imt >= 18.5 && imt < 25) {
            System.out.println("Kategori: Normal (Ideal)");
        } else if (imt >= 25 && imt < 30) {
            System.out.println("Kategori: Kelebihan Berat Badan");
        } else {
            System.out.println("Kategori: Obesitas");
        }

        input.close(); // Menutup scanner 
    }
    
} 

//cr : nopa
