import java.util.Scanner;
public class EvenDigitSum {

    public static void main(String[] args) {
        //getEvenDigitSum();
        System.out.println(getEvenDigitSum());
    }

    public static int getEvenDigitSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum = 0;
        if(number < 0) return -1;
        while(number != 0){
            sum += (number % 2 == 0)? (number % 10) : 0;
            number /= 10;

        }
        return sum;
    }
}
