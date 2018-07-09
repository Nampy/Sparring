package com.company;

public class Main {

    public static void main(String[] args) {
        // setting up an example
        Fighter Lew = new Fighter("Lew",10, 2);
        Fighter Harry = new Fighter("Harry", 5,4);
        System.out.println(Kata.declareWinner(Lew,Harry,"Lew"));
    }
}
