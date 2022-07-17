package leetcode.stackqueue;

import java.util.Stack;

public class QueueUsingStack {

    public static void main(String args[]) {

        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        int param1 = obj.pop();
        int param2 = obj.pop();
        boolean param_4 = obj.empty();
        System.out.println(param_2);//1
        System.out.println(param_3);//2
        System.out.println(param1);//2
        System.out.println(param2);//3
        System.out.println(param_4);

    }


    static class MyQueue {

        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();

        public MyQueue() {

        }

        public void push(int x) {
            s2.add(x);
        }

        public int pop() {
            while(!s2.empty())
            {
                s1.add(s2.pop());

            }
        return s1.pop();
        }

        public int peek() {
        return s1.peek();
        }

        public boolean empty() {
        return (s1.empty() && s2.empty());
        }
    }


}
