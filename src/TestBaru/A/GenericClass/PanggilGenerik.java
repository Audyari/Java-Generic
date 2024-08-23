package TestBaru.A.GenericClass;

public class PanggilGenerik {

    public static void main(String[] args) {
        GenericClass<String> objekGenerik = new GenericClass<String>("AUDY");
        System.out.println(objekGenerik.getDataGenerik());

        GenericClass<Integer> objekInteger = new GenericClass<>(12345);
        System.out.println(objekInteger.getDataGenerik());

        GenericClass<Boolean> objekBoolean = new GenericClass<Boolean>(true);
        System.out.println(objekBoolean.getDataGenerik());



    }



}
