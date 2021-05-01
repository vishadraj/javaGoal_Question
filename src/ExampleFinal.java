/*
*  Blank final variable :- final variable can be initialized only one time. You can't initialize a final variable more
*  than one time. Java provides three ways to initialize it. But some time programmer doesn't want to initialize a final
*  variable declaration time . So the blank final variable is a final variable that is not initialized during
*  declaration . It initialized by the constructor.
 */


/*  Rules to initialize the blank final variable:--
    1. if you are not initializing a final variable during the declaration (blank final variable) then it must be
       initialized in constructor otherwise at compile time.

    2. if you have more than one constructor then every constructor must be initialized the blank final variable.

    3. A static final blank variable can't be initialized in constructor. t must be initialized in static block.

    #* :- A blank final variable can be initialized only int he constructor Java doesn't provide any other way to
          initialize a blank final variable.
* */

/*   Ques.  Why we use the blank final variable ?
     Ans .  Sometimes we don't know the value of the final variable during the creation of the class. the value could be
            decided during the construction time of the object. IF we want to create a constant value that will be
            common for all the objects. then we should initialize the final variable during the declaration.

* */


//                                ||||| CODE |||||

public class ExampleFinal {
   final int a ;
    public static void main(String[] args) {
        ExampleFinal obje = new ExampleFinal();
        System.out.println("Value of a is : "+ obje.a);
    }

   ExampleFinal(){
       a = 33;
   }
}
