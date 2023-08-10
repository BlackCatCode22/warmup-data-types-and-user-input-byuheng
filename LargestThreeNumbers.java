import java.util.Scanner;


public class LargestThreeNumbers {
    public static void main(String[] args) {
        System.out.println("\n\n Tell me my program is working!\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n you entered the first number:");
        int num1 = scanner.nextInt();
        System.out.println("\n you entered: " + num1);

        System.out.println("\n you entered the seconds number:");
        int num2 = scanner.nextInt();
        System.out.println("\n you entered:" + num2);

        System.out.println("\n you entered the Largest number:");
        int num3 = scanner.nextInt();
        System.out.println("\n you entered:" + num3);

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("the largest number is: " + largest);

        scanner.close();
    }
}
