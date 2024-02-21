package com.example.demo;

public class Singleton {
    // Private constructor to prevent instantiation
    private Singleton() {
    }

    // Static inner class to hold the single instance of Singleton
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Method to get the instance of Singleton
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {

    }
}