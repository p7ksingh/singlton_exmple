package com.example.demo;

public class Singlton1 {
    private static Singlton1 instance;

    private Singlton1() {

    }

    public static Singlton1 getInstance() {
        if (instance == null) {
            instance = new Singlton1();
        }
        return instance;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singlton1.getInstance();
        }
    }
}