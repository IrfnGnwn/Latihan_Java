import java.util.Scanner;
public class uts_soal2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int jumlahmahasiswa;
        double totalnilai = 0.0, nilai, ratarata;

        System.out.println("=+=+=+= Program Menghitung Rata-Rata Nilai =+=+=+=");
        
        do {

            System.out.print("Masukkan Jumlah Mahasiswa : ");
            jumlahmahasiswa = a.nextInt();
            if (jumlahmahasiswa <= 0) {
                System.out.println("Silahkan masukkan angka lebih dari 0.");
            }
        }   while (jumlahmahasiswa <= 0);
        
        for (int i = 1; i <= jumlahmahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = a.nextDouble();
            totalnilai += nilai;
        }
        
        ratarata = totalnilai / jumlahmahasiswa;

        System.out.println("================================");
        System.out.println("Rata-Rata Nilai Kelas: " + ratarata);
        
        if (ratarata > 85) {
            System.out.println("Kelas Berprestasi");
        } else {
            System.out.println("Maaf, Kelas Tidak Berprestasi");
        }
    }
}
