package org.example.homeworks;

public class SumHonest {
    public static void main(String[] args) {
        int[] number = { -5,-23,-6,0,3,-5,32,660,-300,213,4};
        int countHonest =0;
        int differenceOdd = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0){
                countHonest++;
            } else {
                differenceOdd -= number[i];
            }
        }
        System.out.println(countHonest);
        System.out.println(differenceOdd);
    }
}
