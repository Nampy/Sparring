package com.company;

public class Main {

    public static void main(String[] args) {
        // setting up an example
        Fighter Lew = new Fighter("Lew",10, 2);
        Fighter Harry = new Fighter("Harry", 5,4);
        Kata.declareWinner(Lew,Harry,"Lew");

        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.size());

    }
}
