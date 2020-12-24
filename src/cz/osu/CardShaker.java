package cz.osu;

import java.util.*;

public class CardShaker {
    private Card[] cards;

    public void generateAllCards()  //Metoda pro generování všech karet
    {
        cards = new Card[32];   //Vytvoření nového pole pro 32 karet

        cards[0] = new Card("red", "7", "Hearts");
        cards[1] = new Card("red", "8", "Hearts");
        cards[2] = new Card("red", "9", "Hearts");
        cards[3] = new Card("red", "10", "Hearts");
        cards[4] = new Card("red", "J", "Hearts");
        cards[5] = new Card("red", "Q", "Hearts");
        cards[6] = new Card("red", "K", "Hearts");
        cards[7] = new Card("red", "A", "Hearts");

        cards[8] = new Card("red", "7", "Diamonds");
        cards[9] = new Card("red", "8", "Diamonds");
        cards[10] = new Card("red", "9", "Diamonds");
        cards[11] = new Card("red", "10", "Diamonds");
        cards[12] = new Card("red", "J", "Diamonds");
        cards[13] = new Card("red", "Q", "Diamonds");
        cards[14] = new Card("red", "K", "Diamonds");
        cards[15] = new Card("red", "A", "Diamonds");

        cards[16] = new Card("black", "7", "Pikes");
        cards[17] = new Card("black", "8", "Pikes");
        cards[18] = new Card("black", "9", "Pikes");
        cards[19] = new Card("black", "10", "Pikes");
        cards[20] = new Card("black", "J", "Pikes");
        cards[21] = new Card("black", "Q", "Pikes");
        cards[22] = new Card("black", "K", "Pikes");
        cards[23] = new Card("black", "A", "Pikes");

        cards[24] = new Card("black", "7", "Clovers");
        cards[25] = new Card("black", "8", "Clovers");
        cards[26] = new Card("black", "9", "Clovers");
        cards[27] = new Card("black", "10", "Clovers");
        cards[28] = new Card("black", "J", "Clovers");
        cards[29] = new Card("black", "Q", "Clovers");
        cards[30] = new Card("black", "K", "Clovers");
        cards[31] = new Card("black", "A", "Clovers");
    }

    public void shakeAllCards()     //Metoda pro zamíchání všech karet
    {
        List<Card> c = Arrays.asList(cards);       //Wrapper na pole karet
        Collections.shuffle(c);     //Funkce pro zamíchání v listu a tím zároveň v poli karet
    }

    public void printAllCards()     //Metoda pro výpis všech karet
    {
        System.out.println();

        for (Card card : cards) {       //Cyklus pro průchod celým polem karet
            System.out.println(card.getInfo() + "\n");      //výpis aktuální karty
        }
        System.out.println();
    }

    public Card[] getCardsWithColor(String requiredColor)   //Metoda pro získání karet na základě parametru Color
    {
        List<Card> cardsToPrint = new ArrayList<>();    //Vytvoření nového listu pro zápis karet
        for (Card card : cards) {
            if (card.getColor().equals(requiredColor)) //Hledání shodné barvy karty s barvou zadanou uživatelem
            {
                cardsToPrint.add(card); //pokud je podmínka splněná, přidá kartu do listu
            }
        }
        System.out.println("Cards with " + requiredColor +" color: ");
        return cardsToPrint.toArray(Card[]::new);   //List převedu zpět na Pole
    }

    public Card[] getCardsWithRank(String requiredRank)
    {
        List<Card> cardsToPrint = new ArrayList<>();
        for (Card card : cards) {
            if (card.getRank().equals(requiredRank)) {
                cardsToPrint.add(card);
            }
        }
        System.out.println("Cards with rank " + requiredRank +": ");
        return cardsToPrint.toArray(Card[]::new);
    }

    public Card[] getCardsWithShape(String requiredShape)
    {
        List<Card> cardsToPrint = new ArrayList<>();
        for (Card card : cards) {
            if (card.getShape().equals(requiredShape)) {
                cardsToPrint.add(card);
            }
        }
        System.out.println("Cards with " + requiredShape +": ");
        return cardsToPrint.toArray(Card[]::new);
    }

    public Card[] getRandomCards(int count) //Metoda pro získání určitého počtu náhodných karet
    {
        List<Card> c = Arrays.asList(cards);    //Wrapper na pole karet
        Collections.shuffle(c);     //Funkce pro zamíchání v listu a tím zároveň v poli karet
        System.out.println(count + " Random cards: ");
        return c.subList(0, count).toArray(Card[]::new);    //Z listu vyberu hodnoty hodnoty od 0 do "count", který zdá uživatel. Následně list převedu na pole
    }

    public void printCards(Card[] cardsToPrint) //Metoda pro výpis karet s daným parametrem
    {
        System.out.println();

        for (Card card : cardsToPrint) {
            System.out.println(card.getInfo() + "\n");
        }
        System.out.println();
    }

}
