package problems.programs;

import java.util.Deque;
import java.util.LinkedList;

public class JavaDequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        //deque.pop(); // delete from the stack end normal pop
        //deque.pollLast();//delete from the stack start;
        deque.stream().forEach(x-> System.out.println(x));

    }
}
