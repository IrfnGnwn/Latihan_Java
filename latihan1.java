import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // Daftar menu makanan dan harga
        String[][] menuMakanan = {
            {"Nasi Goreng", "15000"},
            {"Mie Goreng", "12000"},
            {"Ayam Bakar", "20000"},
            {"Sate Ayam", "18000"},
            {"Bakso", "13000"}
        };

        // Menampilkan menu makanan
        System.out.println("=== Menu Makanan ===");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i][0] + " - Rp" + menuMakanan[i][1]);
        }

        // Meminta jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();

        // Inisialisasi array untuk menyimpan pesanan pengguna
        int[] pesanan = new int[jumlahPesanan];
        int totalHarga = 0;

        // Memasukkan pesanan dengan perulangan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Pilih nomor menu untuk pesanan ke-" + (i + 1) + ": ");
            int pilihan = scanner.nextInt();

            // Percabangan untuk memvalidasi pilihan menu
            if (pilihan >= 1 && pilihan <= menuMakanan.length) {
                pesanan[i] = pilihan - 1;  // Mengurangi 1 untuk indeks array
                totalHarga += Integer.parseInt(menuMakanan[pesanan[i]][1]);
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih nomor menu yang tersedia.");
                i--;  // Ulangi input jika pilihan tidak valid
            }
        }

        // Menampilkan ringkasan pesanan dengan perulangan bersarang
        System.out.println("\n=== Ringkasan Pesanan ===");
        for (int i = 0; i < pesanan.length; i++) {
            int indeksPesanan = pesanan[i];
            System.out.println("Pesanan ke-" + (i + 1) + ": " + menuMakanan[indeksPesanan][0] + " - Rp" + menuMakanan[indeksPesanan][1]);
        }

        // Percabangan bersarang untuk menentukan diskon
        double diskon = 0;
        if (totalHarga > 50000) {
            if (totalHarga > 100000) {
                diskon = 0.20;  // Diskon 20% jika total di atas 100,000
            } else {
                diskon = 0.10;  // Diskon 10% jika total di atas 50,000
            }
        }

        double hargasetelahDiskon = totalHarga - (totalHarga * diskon);
        System.out.println("\nTotal Harga: Rp" + totalHarga);
        System.out.println("Diskon: " + (int)(diskon * 100) + "%");
        System.out.println("Harga Akhir setelah Diskon: Rp" + hargasetelahDiskon);
    }
}
