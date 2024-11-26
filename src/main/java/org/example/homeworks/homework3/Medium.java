package org.example.homeworks.homework3;

public class Medium {
    public static void main(String[] args) {
        System.out.println(population());
    }

    public static int population(){
        int countPeople = 10_000_000;
        int born = 14; // человек в год на 1000
        int death = 8; // человек в год на 1000
        for (int i = 0; i < 10; i++) {
            if (born >7){
                born--;
            }
            if (death>6){
                death--;
            }
            countPeople += countPeople * (born-death) / 1000;
        }
        return countPeople;
    }
}

/*
В стране XYZ население равно 10 миллионов человек.
Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
Рассчитайте, какая численность населения будет через 10 лет, учитывая,
что рождаемость не может быть меньше 7 человек на 1000 человек,
а смертностность не может быть меньше 6 человек на 1000 человек.
 */
