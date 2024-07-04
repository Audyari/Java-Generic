package TypeErasure;

import GenericClass.MyData;

public class TypeErasureApp {

    public static void main(String[] args) {

        MyData myData = new MyData("Eko");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }
}
