public class ExampleOfMethodOverloading {
    public void show(String name){
        System.out.println("Name of person = " +name);
    }
    public boolean show1(String name){
        System.out.println("Perrson name is = "+name);
        return true;
    }

    public static void main(String[] args) {
        ExampleOfMethodOverloading example = new ExampleOfMethodOverloading();
        example.show("Ram");
        example.show1("Raj");
    }

}
