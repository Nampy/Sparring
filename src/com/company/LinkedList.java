package com.company;

public class LinkedList {
    Node firstNode; //beginning node
    int nodeCount = 0;
    public LinkedList(){
        firstNode = null;
    }
    // add function, adding integers to the end of the list
    public void add(int value){
        // start at the first node and keep on calling to the next node, where last node is null
        // only access to the first node
        // when we find the node that has the next node that is null, create the new node with the value
        if(firstNode == null){
            firstNode = new Node(value);
            nodeCount++;
        }
        else{
            Node currentNode = firstNode;
            while(currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            Node node = new Node(value);
            nodeCount++;
            currentNode.nextNode = node;
        }
    }
    // delete integer at first index
    public void deleteFirst(){
        if(firstNode == null){
            throw new NullPointerException();
        }
        firstNode = firstNode.nextNode;
    }
    // delete integer at last index
    public void deleteLast(){
        if(firstNode == null){
            throw new NullPointerException();
        }

    }
    // return the count(size) of the list
    public int size(){
        return nodeCount;
    }
    class Node{
        int value;
        Node nextNode;
        public Node(int value){
            this.value = value;
            nextNode = null;
        }
    }
}