package ComparatorInterface;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Buat beberapa objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Budi", 20);
        Mahasiswa m2 = new Mahasiswa("Andi", 22);
        Mahasiswa m3 = new Mahasiswa("Siti", 18);

        // Urutkan Mahasiswa berdasarkan umur menggunakan Comparator
        Comparator<Mahasiswa> comparatorUmur = new MahasiswaComparator();
        List<Mahasiswa> daftarMahasiswa = Arrays.asList(m1, m2, m3);
        daftarMahasiswa.sort(comparatorUmur);

        // Tampilkan daftar Mahasiswa yang sudah terurut berdasarkan umur
        System.out.println("Urutan berdasarkan umur:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama() + ", Umur: " + mahasiswa.getUmur());
        }

        // Urutkan Mahasiswa berdasarkan nama menggunakan Comparator
        Comparator<Mahasiswa> comparatorNama = (Mahasiswa m11, Mahasiswa m22) -> new MahasiswaComparator().comparenama(m11, m22);
        daftarMahasiswa.sort(comparatorNama);

        // Tampilkan daftar Mahasiswa yang sudah terurut berdasarkan nama
        System.out.println("\nUrutan berdasarkan nama:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama() + ", Umur: " + mahasiswa.getUmur());
        }
    }
}