package com.andy.algorithms.datastructures.stack;

import com.andy.algorithms.datastructures.dynamicarray.DynamicArray;

import javax.lang.model.element.TypeElement;
import java.util.Iterator;

/**
 * @Author: Andy
 * @Date: 2021/1/22 - 16:42
 * @Description: com.andy.algorithms.datastructures.dynamicarray
 */
public class Test {
    //This is the entrance to the program:
    public static void main(String[] args) {
        ListStack<Integer> test_stack = new ListStack<>();
        for (int i = 0; i < 13; i++) {
            test_stack.push(i*2);
        }
        //迭代打印栈（最右为栈顶）
        Iterator<Integer> i = test_stack.iterator();
        System.out.print("栈内元素: ");
        while (i.hasNext()) {
            Integer element = i.next();
            System.out.print(element+" ");
        }
        //调用peek查看栈顶
        System.out.println("\npeek查看到栈顶元素为: " + test_stack.peek());
        //调用pop后再次peek检查
        test_stack.pop();
        System.out.print("pop一次后栈内元素: ");

        //使用新的迭代器再次打印栈（最右为栈顶）
        Iterator<Integer> j = test_stack.iterator();
        while (j.hasNext()) {
            Integer element = j.next();
            System.out.print(element+" ");
        }
        //再次调用peek查看栈顶
        System.out.println("\npeek查看到栈顶元素为: " + test_stack.peek());


    }
}
