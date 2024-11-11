package org.example.homeworks.homework1;

public class Equals {
    public static void main(String[] args) {
        String[] array1 = {"dog", "cat", "kvass", "code", "password", "juice kvass"};
        String[] array2 = {"dog", "cat", "kvass", "code", "juice kvass"};
        String searchWord = "password";
        boolean trueFalse1 = false;
        boolean trueFalse2 = false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(searchWord)) {
                trueFalse1 = true;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (array2[i].equals(searchWord)) {
                trueFalse2 = true;
            }
        }

//        for (String id : array1) {
//            if (searchWord.equals(id)) {
//                trueFolse1 = true;
//                break;
//            }
//        }
        //todo: Изучить улучшенный for
//        for (String id : array2) {
//            if (searchWord.equals(id)) {
//                trueFolse2 = true;
//                break;
//            }
//        }

        System.out.println(trueFalse1);
        System.out.println(trueFalse2);
    }
}
