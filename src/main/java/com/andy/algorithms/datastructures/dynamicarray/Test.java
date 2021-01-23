package com.andy.algorithms.datastructures.dynamicarray;

import java.util.Iterator;

/**
 * @Author: Andy
 * @Date: 2021/1/22 - 16:42
 * @Description: com.andy.algorithms.datastructures.dynamicarray
 */
public class Test {
    //This is the entrance to the program:
    public static void main(String[] args) {
        DynamicArray<Integer> collection = new DynamicArray<>(); //  默认构造一个capacity=16的数组
        for (int i = 0; i < 13; i++) {
            collection.add(i*2);
        }
        //迭代打印数组
        Iterator<Integer> i = collection.iterator();
        while (i.hasNext()) {
            Integer element = i.next();
            System.out.print(element+" ");
        }
    }
}
