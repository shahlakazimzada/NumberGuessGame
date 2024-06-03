import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Let the game begin!");;

        int[] numbers = new int[100];
        int guessCount = 0;

        int guessedNumber = 0;

        while (true) {
            System.out.print("Enter a number: ");
            guessedNumber = sc.nextInt();
            numbers[guessCount] = guessedNumber;
            guessCount++;

            if (guessedNumber == randomNumber) {
                System.out.println("Congratulations, " + name + "!");
                selectionSort(numbers, guessCount);
                System.out.print("Your numbers: ");
                for (int i = 0; i < guessCount; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println("\nRandom number is: " + randomNumber);
                break;
            } else if (guessedNumber > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextInt();
            }

        }

    }

    public static void selectionSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }


}
