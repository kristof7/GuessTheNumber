

import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() *100) +1;  //1. losowanie liczby od 1-100
        boolean hasWon = false;   //6. Zmienna boolean dla wygranej

        System.out.println("I have randomly choosen a number between 1 and 100.");
        System.out.println("Try to guess it."); //2.formuki dla uzytkownika

        Scanner scanner = new Scanner(System.in);  //3. Odczytujemy rzeczywiste dane wejsciowe uzytkownika.
        for (int i = 10; i>0; i--) {
            System.out.println("You have "+ i + " guess(es) left. Choose again: ");  //2. loop z iloscia prob, zmiejsza sie o 1
            int guess = scanner.nextInt();// 4. zapiszemy 3. w zmiennej o nazwie zgadnij, bierze to co wpisujesz i konwertuje w liczbe calkowite

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + " guess."); //5. Informujemy jesli wylosowana liczba byla mniejsza niz wybor uzytkownika "guess"
            }

            else if (randomNumber > guess) {
                System.out.println("It's grater than "+guess+" guess");
            }
            else if (randomNumber == guess) {
                hasWon = true;                //7. Warunek dla wygranej
                break;
            }

        }

        if hasWon {
            System.out.println("CORRECT... YOU WIN!!!");
        } else {
            System.out.println("GAME OVER... YOU LOSE!!!");
            System.out.println("The number was : " + randomNumber);  //8. Komunikat w przypadku wygranej/przegranej
        }
    }
}
