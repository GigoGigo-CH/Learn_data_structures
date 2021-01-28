package com.andy.algorithms.datastructures.doublylinkedlist;

import com.andy.algorithms.datastructures.dynamicarray.DynamicArray;

import java.util.Iterator;

/**
 * @Author: Andy
 * @Date: 2021/1/28 - 16:47
 * @Description: com.andy.algorithms.datastructures.doublylinkedlist
 */
public class Test {
    //This is the entrance to the program:
    public static void main(String[] args) {
        DoublyLinkedList<Integer> collection = new DoublyLinkedList<>();
        for (int i = 0; i < 13; i++) {
            collection.add(i*2);
        }
        //迭代打印链表
        Iterator<Integer> i = collection.iterator();
        while (i.hasNext()) {
            Integer element = i.next();
            System.out.print(element+" ");
        }
    }
}
