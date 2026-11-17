import java.util.Scanner;
public class Tugas1_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan banyaknya nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Banyaknya nilai harus minimal 1.");
            return;
        }

        int[] nilai = new int[n];
        int total = 0;

        // Memasukkan setiap nilai satu per satu
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        // Menghitung rata-rata
        double rata2 = (double) total / nilai.length;

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        // Menampilkan semua nilai beserta status kelulusan
        System.out.println();
        System.out.println("=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        // Menampilkan ringkasan
        System.out.println();
        System.out.println("=== RINGKASAN ===");
        System.out.println("Rata-rata      : " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}

    

