package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("010", "011"));
        System.out.println(bins.mult("00101", "01011"));
    }
}