import java.util.Scanner;
public class Tugas2_16 {

    // Linear search: mengembalikan indeks menu, atau -1 jika tidak ditemukan
    static int cariMenu(String[] menu, String yangDicari) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(yangDicari)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        // Menampilkan daftar menu
        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp%,d%n", (i + 1), menu[i], harga[i]);
        }

        // Fitur pencarian menu
        System.out.println();
        System.out.println("=== CARI MENU ===");
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = input.nextLine();
        int hasil = cariMenu(menu, cari);
        if (hasil != -1) {
            System.out.printf("Menu %s tersedia dengan harga Rp%,d%n", menu[hasil], harga[hasil]);
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
        }

        // Fitur pemesanan
        System.out.println();
        System.out.println("=== PEMESANAN ===");
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine(); // membuang sisa enter

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int idx;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                String nama = input.nextLine();
                idx = cariMenu(menu, nama);
                if (idx == -1) {
                    System.out.println("Menu tidak tersedia, silakan masukkan nama menu yang ada di daftar.");
                }
            } while (idx == -1);

            pesanan[i] = menu[idx];
            hargaPesanan[i] = harga[idx];
            total += harga[idx];
        }

        // Menampilkan daftar pesanan dan total biaya
        System.out.println();
        System.out.println("========== DAFTAR PESANAN ==========");
        System.out.printf("%-4s %-18s %12s%n", "No", "Menu", "Harga");
        System.out.println("------------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d %-18s %12s%n", (i + 1), pesanan[i], "Rp" + String.format("%,d", hargaPesanan[i]));
        }
        System.out.println("------------------------------------");
        System.out.printf("%-23s %12s%n", "TOTAL BIAYA", "Rp" + String.format("%,d", total));
        System.out.println("====================================");
    }
}