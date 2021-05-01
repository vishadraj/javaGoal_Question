public class ExampleOfIndexOf {
    public static void main(String[] args) {
        String name = "JAVA GOAL";
        int index = name.indexOf('A');
        System.out.println("Index of characters : " +index);

        int index1 = name.indexOf('A',5);
        System.out.println("Index of characters : " +index1);
    }
}
