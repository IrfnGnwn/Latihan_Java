import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Menampilkan menu utama
            System.out.println("\n=== Aplikasi Pilihan ===");
            System.out.println("1. Hitung Gaji Karyawan");
            System.out.println("2. Tentukan Nilai Siswa");
            System.out.println("3. Hitung Luas Bangun Datar");
            System.out.println("4. Keluar");
            System.out.print("Pilih kasus (1-4): ");
            int pilihan = scanner.nextInt();

            // Percabangan menggunakan switch-case
            switch (pilihan) {
                case 1:
                    hitungGajiKaryawan(scanner);
                    break;
                case 2:
                    tentukanNilaiSiswa(scanner);
                    break;
                case 3:
                    hitungLuasBangunDatar(scanner);
                    break;
                case 4:
                    continueProgram = false;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
            }

            // Perulangan do-while untuk menanyakan apakah ingin melanjutkan
            if (continueProgram) {
                System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
                char lanjut = scanner.next().charAt(0);
                if (lanjut == 'n' || lanjut == 'N') {
                    continueProgram = false;
                }
            }
        }
        scanner.close();
    }

    // Kasus 1: Menghitung Gaji Karyawan
    public static void hitungGajiKaryawan(Scanner scanner) {
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        double gajiTotal;
        if (jamLembur > 0) {
            double upahLembur = jamLembur * 15000;
            gajiTotal = gajiPokok + upahLembur;
        } else {
            gajiTotal = gajiPokok;
        }

        System.out.println("Total gaji karyawan: Rp " + gajiTotal);
    }

    // Kasus 2: Menentukan Nilai Siswa
    public static void tentukanNilaiSiswa(Scanner scanner) {
        System.out.print("Masukkan nilai siswa: ");
        int nilai = scanner.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai: A");
        } else if (nilai >= 80) {
            System.out.println("Nilai: B");
        } else if (nilai >= 70) {
            System.out.println("Nilai: C");
        } else if (nilai >= 60) {
            System.out.println("Nilai: D");
        } else {
            System.out.println("Nilai: E");
        }
    }

    // Kasus 3: Menghitung Luas Bangun Datar
    public static void hitungLuasBangunDatar(Scanner scanner) {
        System.out.println("\n=== Pilih Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Pilih bangun datar (1-3): ");
        int pilihanBangun = scanner.nextInt();

        // Percabangan menggunakan switch-case
        switch (pilihanBangun) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas Persegi: " + (sisi * sisi));
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                System.out.println("Luas Persegi Panjang: " + (panjang * lebar));
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * jariJari * jariJari));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}