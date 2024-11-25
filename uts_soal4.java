import java.util.Scanner;

public class uts_soal4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int jumlahatlet;
        double kecepatan,rataratakecepatan,totalkecepatan = 0;
        
        // Meminta jumlah atlet
        System.out.print("Masukkan Jumlah Atlet: ");
        jumlahatlet = a.nextInt();
        
        // Validasi jumlah atlet
        if (jumlahatlet <= 0) {
            System.out.println("Jumlah Atlet Harus Lebih Dari 0!");
            return;
        }

        // Menggunakan perulangan untuk meminta input kecepatan
        for (int i = 1; i <= jumlahatlet; i++) {
            System.out.print("Masukkan Kecepatan Atlet " + i + " (km/jam): ");
            kecepatan = a.nextDouble();
            
            // Validasi kecepatan harus positif
            if (kecepatan < 0) {
                System.out.println("Kecepatan harus Bernilai Positif! Masukkan Ulang!!");
                i--; // Kembali ke iterasi sebelumnya
                continue;
            }
            
            totalkecepatan += kecepatan;
        }

        // Menghitung rata-rata kecepatan
        rataratakecepatan = totalkecepatan / jumlahatlet;

        // Menampilkan rata-rata kecepatan
        // Ingpo :
        // 1. Kenapa menggunakan printf? Memungkinkan menampilkan angka dengan presisi tertentu (contoh: 2 angka di belakang koma).
        // 2. %.2f berarti angka desimal akan ditampilkan dengan 2 angka di belakang koma
        System.out.printf("Rata-Rata Kecepatan Tim Atlet: %.2f km/jam\n", rataratakecepatan);

        // Menampilkan pesan jika rata-rata kecepatan lebih dari 20 km/jam
        if (rataratakecepatan > 20) {
            System.out.println("Tim Atlet Sangat Cepat");
        }
    }
}

