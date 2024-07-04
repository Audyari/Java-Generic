package ComparatorInterface;

import java.util.Comparator;

public class MahasiswaComparator implements Comparator<Mahasiswa> {

    @Override
    public int compare(Mahasiswa m1, Mahasiswa m2) {
        return Integer.compare(m1.getUmur(), m2.getUmur());
    }

    public int comparenama(Mahasiswa m1, Mahasiswa m2) {
        return m1.getNama().compareTo(m2.getNama());
    }
}