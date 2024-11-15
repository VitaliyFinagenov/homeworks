package org.example.homeworks.homework2;

public class Mkad {
    public static void main(String[] args) {
        int v = -1;
        int t = 1;
        int s = 109;
        int x;
        if (v >= 0) {
            x = (v * t) % s;
        } else {
            x = s + ((v * t) % s);
        }
        System.out.println(x);
    }
}
