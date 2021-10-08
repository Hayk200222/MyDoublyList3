package com.company;

public class MyDoublyLinkedList<T extends  Comparable> implements MyList<T>{
    Node first;
    Node last;
    int size;


    @Override
    public T get(int index) {
        Node current = first;
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("INDEX OUT OF BAUNDS");
        }
        for (int i = 0; i != index; i++) {
            current = current.next;
        }
        return (T) current.value;
    }

    public void add(T obj) {
        Node newNode = new Node(obj);
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        newNode.prevous = last;
        last.next = newNode;
        last = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        Node current = first;
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("INDEX OUT OF BAUNDS");
        }
        if (index == 0) {
            first = first.next;
            size--;
            return;
        }

        for (int i = 1; i != index - 1; i++) {
            if (i == size() - 2) {
                current.next.next = null;
                last = current.next;
                last.prevous = current;
                size--;
                return;
            }
            current = current.next;
        }
        current.next = current.next.next;
        current.next.next.prevous = current;
        size--;
    }

    @Override
    public boolean remove(T obj) {
        return false;
    }

//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder("[");
//        Node current = first;
//        for (int i = 0; i < size; i++) {
//            result.append(current.value);
//            if (i < size - 1) {
//                result.append(", ");
//            }
//            current = current.next;
//        }
//        result.append("]");
//        return result.toString();
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        return false;
    }
}

class Node<T> {
    T value;
    Node next;
    Node prevous;

    public Node(T value) {
        this.value = value;
    }

}