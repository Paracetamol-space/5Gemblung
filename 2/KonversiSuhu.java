import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("    PROGRAM KONVERSI SUHU");
        System.out.println("-------------------------------------");


        System.out.print("\nMasukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double reamur = celsius * 4.0 / 5.0;
        double kelvin = celsius + 273.15;

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.printf("Suhu dalam Celsius   : %.2f °C%n", celsius);
        System.out.printf("Suhu dalam Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Suhu dalam Reamur    : %.2f °R%n", reamur);
        System.out.printf("Suhu dalam Kelvin    : %.2f K%n", kelvin);

        input.close();
    }
}
