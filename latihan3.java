import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Menampilkan menu
            System.out.println("=== Menu Operasi Matematika ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            int pilihan = scanner.nextInt();

            // Percabangan menggunakan switch-case
            switch (pilihan) {
                case 1:  // Penjumlahan
                case 2:  // Pengurangan
                case 3:  // Perkalian
                case 4:  // Pembagian
                    // Meminta input angka dari pengguna
                    System.out.print("Masukkan angka pertama: ");
                    double angka1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka2 = scanner.nextDouble();
                    double hasil = 0;

                    // Percabangan if-else bersarang untuk setiap operasi
                    if (pilihan == 1) {
                        hasil = angka1 + angka2;
                        System.out.println("Hasil Penjumlahan: " + hasil);
                    } else if (pilihan == 2) {
                        hasil = angka1 - angka2;
                        System.out.println("Hasil Pengurangan: " + hasil);
                    } else if (pilihan == 3) {
                        hasil = angka1 * angka2;
                        System.out.println("Hasil Perkalian: " + hasil);
                    } else if (pilihan == 4) {
                        if (angka2 != 0) {  // Cek pembagian dengan nol
                            hasil = angka1 / angka2;
                            System.out.println("Hasil Pembagian: " + hasil);
                        } else {
                            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                        }
                    }
                    break;

                case 5:  // Keluar
                    continueProgram = false;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-5.");
            }

            // Perulangan do-while untuk menanyakan apakah ingin melanjutkan
            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
            char lanjut = scanner.next().charAt(0);

            if (lanjut == 'n' || lanjut == 'N') {
                continueProgram = false;
            } else if (lanjut != 'y' && lanjut != 'Y') {
                System.out.println("Input tidak valid. Program akan dilanjutkan.");
            }
        }

        // Perulangan for untuk menghitung mundur sebelum program selesai
        System.out.println("\nProgram akan berakhir dalam:");
        for (int i = 3; i > 0; i--) {
            System.out.println(i + " detik");
            try {
                Thread.sleep(1000); // Menunggu 1 detik
            } catch (InterruptedException e) {
                System.out.println("Terjadi kesalahan saat menghitung mundur.");
            }
        }
        System.out.println("Program selesai.");
        scanner.close();
    }
}

