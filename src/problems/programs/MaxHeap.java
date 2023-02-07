package problems.programs;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
//Create a min heap of size k by adding first k elements from the array
//then from the k+1 th element compare it with min heap peek if it is greater replace peek and do heapify
public class MaxHeap {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
            priorityQueue.add(arr[i]);

        for (int i = k; i < arr.length; i++){
            if(priorityQueue.peek()<arr[i]){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        System.out.println(priorityQueue.poll());

    }
}
