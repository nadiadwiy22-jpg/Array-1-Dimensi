import java.util.Scanner;
public class ArrayNilai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        //Langkah 4  tetap for biasa, karena harus mengisi elemen lewat indeks
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        // Langkah 5 bisa foreach, nomor mahasiswa memakai penghitung manual
        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }
    }
}

    
        

