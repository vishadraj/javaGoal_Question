import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true) {
            System.out.println("Enter a number: ");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
                int number = sc.nextInt();
                if(number > max) {
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            } else {
                break;
            }
            sc.nextLine(); // handle input
        }
        System.out.println("min = "+ min + ", max = " + max);
        sc.close();
    }
}
