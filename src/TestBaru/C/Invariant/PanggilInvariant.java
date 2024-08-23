package TestBaru.C.Invariant;

public class PanggilInvariant {

    public static void main(String[] args) {
        InvariantTesting<String> testObjek = new InvariantTesting<String>("test");
        InvariantTesting<String> testObjek2 = testObjek;

        System.out.println(testObjek2.getData());
        System.out.println(testObjek2.setData("ASEP"));
        System.out.println(testObjek2.getData());

        InvariantTesting<Object> testObjek3 = new InvariantTesting<>("SATU");

        PanggilInvariant test = new PanggilInvariant();
        test.doIt(testObjek3);

        doItStatis(testObjek3);

    }

    public void doIt(InvariantTesting<Object> datanya){
        System.out.println("PANGGIL OBJEK tanpa Static");
    }

    public static void doItStatis(InvariantTesting<Object> datanya){
        System.out.println("PANGGIL OBJEK Static");
    }



}
