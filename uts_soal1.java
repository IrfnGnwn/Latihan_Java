import java.util.Scanner;

public class uts_soal1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        // Menampilkan daftar film yang sedang tayang
        System.out.println("Daftar Film yang Sedang Tayang:");
        System.out.println("1. Film Upin & Ipin - Rp 50000");
        System.out.println("2. Film Boboiboy - Rp 60000");
        System.out.println("3. Film Adit & Sopo Jarwo - Rp 55000");
        System.out.println("4. Film Spongebob - Rp 30000");
        System.out.println("5. Film Sinetron Azab - Rp 40000");
        
        // Meminta user untuk menginput film yang akan ditonton
        System.out.print("\nPilih film yang ingin ditonton (1-5): ");
        int film = a.nextInt();
        
        int hargatiket = 0;
        
        // Menentukan harga tiket berdasarkan pilihan film
        switch (film) {
            case 1:
                hargatiket = 50000;
                break;
            case 2:
                hargatiket = 60000;
                break;
            case 3:
                hargatiket = 55000;
                break;
            case 4:
                hargatiket = 30000;
                break;
            case 5:
                hargatiket = 40000;
                break;
            default:
                System.out.println("Maaf pilihan film tidak ada.");
                return;
        }
        
        // Meminta user untuk memasukkan jumlah tiket
        System.out.print("Masukkan jumlah tiket yang akan dibeli: ");
        int jumlahtiket = a.nextInt();
        
        // Menghitung total harga
        int totalharga = hargatiket * jumlahtiket;

        System.out.println("Total Harga : "+ totalharga);

        // Memberikan diskon jika pembelian tiket lebih dari 3
        if (jumlahtiket > 3) {
            totalharga -= totalharga * 0.1; // Diskon 10%
        }

        // Menampilkan total harga setelah diskon
        System.out.println("\nTotal Harga Setelah Diskon (diskon 10%): Rp " + totalharga);
    }
}

