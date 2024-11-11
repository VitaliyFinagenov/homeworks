package org.example.homeworks.homework1;

public class Equals {
    public static void main(String[] args) {
        String[] array1 = {"dog", "cat", "kvass", "code", "password", "juice kvass"};
        String[] array2 = {"dog", "cat", "kvass", "code", "juice kvass"};
        String searchWord = "password";
        boolean trueFolse1 = false;
        boolean trueFolse2 = false;
        for (String id : array1) {
            if (searchWord.equals(id)) {
                trueFolse1 = true;
                break;
            }
        }
        for (String id : array2) {
            if (searchWord.equals(id)) {
                trueFolse2 = true;
                break;
            }
        }
        System.out.println(trueFolse1);
        System.out.println(trueFolse2);
    }
}
