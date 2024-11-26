package org.example.homeworks.homework3;

import java.util.*;

public class Hard {
    public static void main(String[] args) {
        try {
            poker();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void poker() throws InterruptedException {
        String[] name = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6"};
        String[] suit = {"heart", "diamond", "club", "spade"};
        int cardsInDeck = name.length * suit.length;
        String[] deckCards = new String[cardsInDeck];
        String[] mixDeckCards = new String[cardsInDeck];
        int cardsPerPlayer = 5;

        try (Scanner sc = new Scanner(System.in)) {
            int players = sc.nextInt();
            if (players > 6) {
                System.out.println("Не больше 6 игроков, " + (players - 6) + " пошли на хер из за стола!");
                return;
            }
            if (players < 2) {
                System.out.println("Чё сидишь, сам с собой играть будешь?");
                return;
            }

            for (int i = 0; i < name.length; i++) {
                for (int j = 0; j < suit.length; j++) {
                    deckCards[suit.length * i + j] = name[i] + " " + suit[j];
                }
            }

            System.out.println(Arrays.toString(deckCards));

            shuffleDeck(deckCards, mixDeckCards);

            System.out.println(Arrays.toString(mixDeckCards));

            int playersCards = players * cardsPerPlayer;

            for (int i = 0; i < playersCards; i++) {
                System.out.println(mixDeckCards[i]);
                if (i % cardsPerPlayer == cardsPerPlayer - 1) {
                    System.out.println();
                }
            }

            System.out.println("Карты на столе:");
            for (int i = playersCards + 1; i < playersCards + 6; i++) {
                if (i == playersCards + 5 || i == playersCards+4){
                    Thread.sleep(2000);
                }
                System.out.println(mixDeckCards[i]);
            }
        }
    }


    private static void shuffleDeck(String[] deckCards, String[] mixDeckCards) {
        Random random = new Random();
        Set<Integer> usedIndexes = new HashSet<>();

        for (int i = 0; i < deckCards.length; i++) {
            int number;
            do {
                number = random.nextInt(deckCards.length);
            } while (usedIndexes.contains(number));

            usedIndexes.add(number);
            mixDeckCards[number] = deckCards[i];
        }
    }
}
/*
Poker

Напишите метод deal, которая должна имитировать раздачу карт для игры в покер.
Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n
игроков (по 5 карт каждому) из рассортированной колоды.
Разделяйте пять карт, выданных каждому игроку, пустой строкой.
 */
