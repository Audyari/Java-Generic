package TestBaru.C.Invariant;

public class InvariantTesting<T> {

    T data;

     public InvariantTesting(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean setData(T data) {
        this.data = data;
        return false;
    }
}
