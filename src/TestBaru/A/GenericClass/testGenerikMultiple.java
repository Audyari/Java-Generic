package TestBaru.A.GenericClass;

public class testGenerikMultiple {

    public static void main(String[] args) {
        GenerikMultiple<String, Integer> testData = new GenerikMultiple<String, Integer>("DATA SATU",12345);

        System.out.println(testData.getDataSatu());
        System.out.println(testData.getDataDua());
    }
}
