

import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have choosen number from 1 to 100, try to guess witch is it");
        System.out.println("Type your guess: ");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have: " + i + " guess left");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("It's not this number, choosen number is grater than: " + guess);
            } else if (guess > randomNumber) {
                System.out.println("It's not this number, choosen number is lower than: " + guess);
            } else if (guess == randomNumber) {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("CORRECT... YOU WIN!!!");
        } else {
            System.out.println("GAME OVER... YOU LOSE!!!");
            System.out.println("The number was : " + randomNumber);
        }
    }
}
