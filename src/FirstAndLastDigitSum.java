import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit());
    }

    public static int sumFirstAndLastDigit(){

        Scanner sc = new Scanner(System.in); // Instantiating the Scanner class
        System.out.println("Enter a number");
        int number = sc.nextInt(); // taking in the number from the user.
        String num = String.valueOf(number); // Casting the number into String
        int sum = 0;
        if(number < 0){ //checking if the number length entered is less than 0, that is negative
            return -1; //returns -1 if the number is negative
        }
        else if(num.length() <2){ // if the prior if statement turns out to be false then this if statement comes to effect
            // the String form of the number's length is checked, if it is less than 2 i.e. 1, the code block executes.
            sum = (Integer.parseInt(num))*2; // the string is converted to Int and multiplied by 2.
            return sum;
        }
        else{
            sum = Integer.parseInt(String.valueOf(num.charAt(0)))+Integer.parseInt(String.valueOf(num.charAt((num.length())-1)));
            return sum; // This code block runs if the length is greater than equals to 2. The strings first character and the last character are extracted
        }               // The extracted characters are then re=casted to Integer and then added up.

    }
}