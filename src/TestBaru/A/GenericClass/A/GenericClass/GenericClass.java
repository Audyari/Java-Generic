package TestBaru.A.GenericClass.A.GenericClass;

public class GenericClass<T> {

    private T dataGenerik;

    public GenericClass(T dataGenerik) {
        this.dataGenerik = dataGenerik;
    }

    public T getDataGenerik() {
        return dataGenerik;
    }

    public void setDataGenerik(T dataGenerik) {
        this.dataGenerik = dataGenerik;
    }
}
