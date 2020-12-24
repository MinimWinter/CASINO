package cz.osu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();

	    CardShaker cardshaker = new CardShaker();   //Vytvoření objektu od třídy CardShaker

        Scanner scanner = new Scanner(System.in);      //Scanner využiji pro načítání hodnot
        String requiredColor;
        String requiredRank;
        String requiredShape;

        cardshaker.generateAllCards();  //Vygenerování karet
        System.out.println("All cards: ");
        cardshaker.printAllCards();     //Výpis všech karet
        cardshaker.shakeAllCards();     //Zamíchání všech karet
        System.out.println("Shaked cards: ");
        cardshaker.printAllCards();

        System.out.println("Enter color (red/black): ");
        requiredColor = scanner.nextLine();     //Uživatel zadá barvu karet
        cardshaker.printCards(cardshaker.getCardsWithColor(requiredColor));     //Výpis karet s danou barvou

        System.out.println("Enter rank (7-A): ");
        requiredRank = scanner.nextLine();      //Uživatel zadá hodnotu karet
        cardshaker.printCards(cardshaker.getCardsWithRank(requiredRank));       //Výpis karet s danou hodnotou

        System.out.println("Enter shape (Hearts/Diamonds/Pikes/Clovers): ");
        requiredShape = scanner.nextLine();     //Uživatel zadá znak karet
        cardshaker.printCards(cardshaker.getCardsWithShape(requiredShape));     //Výpis karet s daným znakem

        cardshaker.printCards(cardshaker.getRandomCards(5));              //Výpis 5 náhodných karet
    }
}
