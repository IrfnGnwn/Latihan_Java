import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu makanan dan minuman beserta harga
        String[][] menuMakanan = {
            {"Nasi Goreng", "15000"},
            {"Mie Goreng", "12000"},
            {"Ayam Bakar", "20000"},
            {"Sate Ayam", "18000"},
            {"Bakso", "13000"}
        };

        String[][] menuMinuman = {
            {"Es Teh", "5000"},
            {"Jus Jeruk", "8000"},
            {"Kopi", "7000"},
            {"Susu", "6000"},
            {"Es Kelapa", "9000"}
        };

        // Menampilkan menu makanan dan minuman
        System.out.println("=== Menu Makanan ===");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i][0] + " - Rp" + menuMakanan[i][1]);
        }

        System.out.println("\n=== Menu Minuman ===");
        for (int i = 0; i < menuMinuman.length; i++) {
            System.out.println((i + 1) + ". " + menuMinuman[i][0] + " - Rp" + menuMinuman[i][1]);
        }

        // Meminta jumlah pesanan untuk makanan dan minuman
        System.out.print("\nMasukkan jumlah pesanan makanan: ");
        int jumlahPesananMakanan = scanner.nextInt();
        System.out.print("Masukkan jumlah pesanan minuman: ");
        int jumlahPesananMinuman = scanner.nextInt();

        // Inisialisasi array untuk menyimpan pesanan dan total harga
        int[] pesananMakanan = new int[jumlahPesananMakanan];
        int[] pesananMinuman = new int[jumlahPesananMinuman];
        int totalHarga = 0;

        // Memasukkan pesanan makanan
        System.out.println("\n=== Masukkan Pesanan Makanan ===");
        for (int i = 0; i < jumlahPesananMakanan; i++) {
            System.out.print("Pilih nomor menu makanan untuk pesanan ke-" + (i + 1) + ": ");
            int pilihanMakanan = scanner.nextInt();

            // Percabangan untuk validasi pilihan menu makanan
            if (pilihanMakanan >= 1 && pilihanMakanan <= menuMakanan.length) {
                pesananMakanan[i] = pilihanMakanan - 1;  // Indeks array
                totalHarga += Integer.parseInt(menuMakanan[pesananMakanan[i]][1]);
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih nomor menu yang tersedia.");
                i--;  // Ulangi input jika pilihan tidak valid
            }
        }

        // Memasukkan pesanan minuman
        System.out.println("\n=== Masukkan Pesanan Minuman ===");
        for (int i = 0; i < jumlahPesananMinuman; i++) {
            System.out.print("Pilih nomor menu minuman untuk pesanan ke-" + (i + 1) + ": ");
            int pilihanMinuman = scanner.nextInt();

            // Percabangan untuk validasi pilihan menu minuman
            if (pilihanMinuman >= 1 && pilihanMinuman <= menuMinuman.length) {
                pesananMinuman[i] = pilihanMinuman - 1;  // Indeks array
                totalHarga += Integer.parseInt(menuMinuman[pesananMinuman[i]][1]);
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih nomor menu yang tersedia.");
                i--;  // Ulangi input jika pilihan tidak valid
            }
        }

        // Menampilkan ringkasan pesanan
        System.out.println("\n=== Ringkasan Pesanan Makanan ===");
        for (int i = 0; i < pesananMakanan.length; i++) {
            int indeksPesananMakanan = pesananMakanan[i];
            System.out.println("Pesanan Makanan ke-" + (i + 1) + ": " + menuMakanan[indeksPesananMakanan][0] + " - Rp" + menuMakanan[indeksPesananMakanan][1]);
        }

        System.out.println("\n=== Ringkasan Pesanan Minuman ===");
        for (int i = 0; i < pesananMinuman.length; i++) {
            int indeksPesananMinuman = pesananMinuman[i];
            System.out.println("Pesanan Minuman ke-" + (i + 1) + ": " + menuMinuman[indeksPesananMinuman][0] + " - Rp" + menuMinuman[indeksPesananMinuman][1]);
        }

        // Menentukan diskon berdasarkan total harga
        double diskon = 0;
        if (totalHarga > 50000) {
            if (totalHarga > 100000) {
                diskon = 0.20;  // Diskon 20% untuk total lebih dari 100,000
            } else {
                diskon = 0.10;  // Diskon 10% untuk total lebih dari 50,000
            }
        }

        double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Menampilkan total harga dan harga setelah diskon
        System.out.println("\nTotal Harga: Rp" + totalHarga);
        System.out.println("Diskon: " + (int) (diskon * 100) + "%");
        System.out.println("Harga Setelah Diskon: Rp" + hargaSetelahDiskon);

        // Meminta jumlah uang yang dibayarkan
        System.out.print("\nMasukkan jumlah uang yang dibayarkan: Rp ");
        int jumlahBayar = scanner.nextInt();

        // Menghitung kembalian atau kekurangan
        if (jumlahBayar >= hargaSetelahDiskon) {
            int kembalian = (int) (jumlahBayar - hargaSetelahDiskon);
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            int kekurangan = (int) (hargaSetelahDiskon - jumlahBayar);
            System.out.println("Uang tidak cukup. Anda masih kekurangan: Rp" + kekurangan);
        }

        scanner.close();
    }
}
