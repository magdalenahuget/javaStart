package com.company.generics;

public class PairTest {

    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(7, "dwarfs");
        Pair<String, Double> pair2 = new Pair<>("Chees", 1.5);
        Pair<String, Integer> pair3 = new Pair<>("Dalmatians", 101);

        printPairInfo(pair1);
        printPairInfo(pair2);
        printPairInfo(pair3);
    }

    static <T, V> void printPairInfo(Pair<T, V> pair) {
        System.out.println(pair.getT() + " " + pair.getV());
    }
}
