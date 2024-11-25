import java.util.Scanner;

public class uts_alpro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Menu Utama =====");
            System.out.println("1. Sistem Pembelian Tiket Bioskop");
            System.out.println("2. Menghitung Nilai Rata-rata");
            System.out.println("3. Sistem Pemesanan Makanan");
            System.out.println("4. Sistem Perhitungan Rata-rata Kecepatan Lari Atlet");
            System.out.println("5. Sistem Perhitungan Skor Permainan");
            System.out.println("6. Keluar");
            System.out.print("Pilih Program yang Akan Dijalankan (1-6): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    pembelianTiketBioskop(input);
                    break;
                case 2:
                    menghitungNilaiRataRata(input);
                    break;
                case 3:
                    pemesananMakanan(input);
                    break;
                case 4:
                    rataRataKecepatanLari(input);
                    break;
                case 5:
                    perhitunganSkorPermainan(input);
                    break;
                case 6:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            // Perulangan do-while untuk menanyakan apakah ingin melanjutkan
            if (running) {
                System.out.print("Apakah Anda Ingin Melanjutkan? (y/n): ");
                char lanjut = input.next().charAt(0);
                    if (lanjut == 'n' || lanjut == 'N') {
                        running = false;
                }
            }
        }

        input.close();
    }

    // Sistem Pembelian Tiket Bioskop
    public static void pembelianTiketBioskop(Scanner input) {
        System.out.println("\n=== Sistem Pembelian Tiket Bioskop ===");
        System.out.println("1. Film A - Rp 50,000");
        System.out.println("2. Film B - Rp 60,000");
        System.out.println("3. Film C - Rp 70,000");
        System.out.print("Pilih film (1/2/3): ");
        int pilihan = input.nextInt();
        int harga = 0;

        switch (pilihan) {
            case 1: harga = 50000; break;
            case 2: harga = 60000; break;
            case 3: harga = 70000; break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = input.nextInt();
        int totalHarga = harga * jumlahTiket;

        if (jumlahTiket > 3) {
            totalHarga *= 0.9;
        }

        System.out.println("Total harga setelah diskon: Rp " + totalHarga);
    }

    // Menghitung Nilai Rata-rata
    public static void menghitungNilaiRataRata(Scanner input) {
        System.out.println("\n=== Menghitung Nilai Rata-rata ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            totalNilai += input.nextInt();
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai: " + rataRata);

        if (rataRata > 85) {
            System.out.println("Kelas Berprestasi");
        }
    }

    // Sistem Pemesanan Makanan
    public static void pemesananMakanan(Scanner input) {
        System.out.println("\n=== Sistem Pemesanan Makanan ===");
        System.out.println("1. Nasi Goreng - Rp 25,000");
        System.out.println("2. Ayam Goreng - Rp 30,000");
        System.out.println("3. Mie Goreng - Rp 20,000");
        System.out.print("Pilih makanan (1/2/3): ");
        int pilihan = input.nextInt();
        int harga = 0;

        switch (pilihan) {
            case 1: harga = 25000; break;
            case 2: harga = 30000; break;
            case 3: harga = 20000; break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.print("Masukkan jumlah porsi: ");
        int jumlahPorsi = input.nextInt();
        int totalHarga = harga * jumlahPorsi;

        if (totalHarga > 100000) {
            totalHarga *= 0.85;
        }

        System.out.println("Total biaya yang harus dibayar: Rp " + totalHarga);
    }

    // Sistem Perhitungan Rata-rata Kecepatan Lari Atlet
    public static void rataRataKecepatanLari(Scanner input) {
        System.out.println("\n=== Sistem Perhitungan Rata-rata Kecepatan Lari Atlet ===");
        System.out.print("Masukkan jumlah atlet: ");
        int jumlahAtlet = input.nextInt();
        double totalKecepatan = 0;

        for (int i = 1; i <= jumlahAtlet; i++) {
            System.out.print("Masukkan kecepatan atlet ke-" + i + " (km/jam): ");
            totalKecepatan += input.nextDouble();
        }

        double rataRata = totalKecepatan / jumlahAtlet;
        System.out.println("Rata-rata kecepatan: " + rataRata + " km/jam");

        if (rataRata > 20) {
            System.out.println("Tim Atlet Sangat Cepat");
        }
    }

    // Sistem Perhitungan Skor Permainan
    public static void perhitunganSkorPermainan(Scanner input) {
        System.out.println("\n=== Sistem Perhitungan Skor Permainan ===");
        System.out.print("Masukkan jumlah ronde yang akan dimainkan: ");
        int jumlahRonde = input.nextInt();
        int totalSkor = 0;

        for (int i = 1; i <= jumlahRonde; i++) {
            System.out.print("Masukkan skor ronde ke-" + i + ": ");
            totalSkor += input.nextInt();
        }

        if (totalSkor > 500) {
            totalSkor *= 1.1;
        }

        System.out.println("Total skor setelah bonus: " + totalSkor);
    }
}
