package TestBaru.A.GenericClass.A.GenericClass;

public class GenerikMultiple<T, U> {

    private T dataSatu;
    private U dataDua;

    public GenerikMultiple() {
    }

    public GenerikMultiple(T dataSatu) {
        this.dataSatu = dataSatu;
    }

    public GenerikMultiple(T dataSatu, U dataDua) {
        this.dataSatu = dataSatu;
        this.dataDua = dataDua;
    }

    public T getDataSatu() {
        return dataSatu;
    }

    public void setDataSatu(T dataSatu) {
        this.dataSatu = dataSatu;
    }

    public U getDataDua() {
        return dataDua;
    }

    public void setDataDua(U dataDua) {
        this.dataDua = dataDua;
    }
}
