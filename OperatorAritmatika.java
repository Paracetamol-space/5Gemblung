public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;

       
        // Operasi Penjumlahan
        System.out.println("Operasi Penjumlahan ");
        int hasilPenjumlahan = a + b;
        System.out.println("a + b = " + a + " + " + b + " = " + hasilPenjumlahan + 
                           "                                                  \n");

        // Operasi Pengurangan
        System.out.println("Operasi Pengurangan ");
        int hasilPengurangan = a - b;
        System.out.println("a - b = " + a + " - " + b + " = " + hasilPengurangan + 
                           "                                                  \n");
         // Operasi Perkalian
        System.out.println(" Operasi Perkalian ");
        int hasilPerkalian = a * b;
        System.out.println("a * b = " + a + " * " + b + " = " + hasilPerkalian + 
                           "                                                  \n");
        // Operasi Pembagian ( Integer )
        System.out.println("Operasi Pembagian");
        int hasilPembagian = a / b;
        System.out.println("a / b = " + a + " / " + b + " = " + hasilPembagian + 
                           "                                                  \n");
        // Operasi Modulus ( Sisa Bagi )
        System.out.println("Operasi Modulus (sisa bagi)");
        int hasilModulus = a % b;
        System.out.println("a % b = " + a + " % " + b + " = " + hasilModulus + 
                           "                                                  \n");
    }
    
}