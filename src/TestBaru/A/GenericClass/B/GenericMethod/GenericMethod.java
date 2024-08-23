package TestBaru.A.GenericClass.B.GenericMethod;

public class GenericMethod {
    public static void main(String[] args) {

        Object[] data1 = {1, 2, 3, 4, 56, 7, 8, 9};
        Object[] data2 = {"Satu", "dua", "tiga"};

//      System.out.println(  Hitung(data1));
//      GenericMethod.Hitung(data1);

        GenericMethod testObjek = new GenericMethod();

        var hasil = testObjek.Hitung(data2);
        System.out.println(hasil);


    }

    public <T> int Hitung(T[] data) {
        return data.length;
    }
}