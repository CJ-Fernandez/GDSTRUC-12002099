package com.cjfernandez;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    private PlayerNode head, tail;

    public void addNode(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);

        if(head == null){
            head = tail = playerNode;
            head.setPrevPlayer(null);
            tail.setNextPlayer(null);
        }
        else
        {
            tail.setNextPlayer(playerNode);
            playerNode.setPrevPlayer(tail);
            tail = playerNode;
            tail.setNextPlayer(null);
        }

    }

    public void printNodes() {
        PlayerNode current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.
            System.out.print(current.getPlayer() + " ");
            current = current.getNextPlayer();
        }
    }
}
