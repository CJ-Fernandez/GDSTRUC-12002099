package com.cjfernandez;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1,"Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addNode(asuna);
        doublyLinkedList.addNode(lethalBacon);
        doublyLinkedList.addNode(hpDeskjet);

        doublyLinkedList.printNodes();

    }
}
