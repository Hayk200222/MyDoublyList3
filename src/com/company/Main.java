
package com.company;

import java.util.LinkedList;

        public class Main {

            public static void main(String[] args) {
                MyDoublyLinkedList list = new MyDoublyLinkedList();
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
                list.remove(0);
                list.remove(4);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));

                }
            }
        }







