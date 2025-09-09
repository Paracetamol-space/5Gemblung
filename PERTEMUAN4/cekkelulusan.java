import java.util.Scanner;
public class cekkelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir Anda (0-100): ");
        int nilaiAkhir = input.nextInt();
        String status = "";

        if (nilaiAkhir >= 70 && nilaiAkhir <= 100) {
            status = "Lulus";
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 70) {
            status = "Tidak Lulus";
        } else {
            status = "Nilai tidak valid";
        }

        System.out.println("Status kelulusan Anda: " + status);
        input.close();
    }
}