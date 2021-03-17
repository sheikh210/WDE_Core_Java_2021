package dataStructures.collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    /*
    1 - Queue is used to insert elements at the end(tail) of the queue and remove from the beginning(head) of the queue.
        *FIFO concept
    2 - Queue supports all methods of Collection interface including insertion, deletion etc
    3 - LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations of Queue interface
    4 - If any null operation is performed on BlockingQueues, NullPointerException is thrown
    5 - All Queues except Dequeues support insertion and removal at the tail and head of the queue, respectively.
        Dequeues support element insertion and removal at both ends.
     */

    /*
     FIFO - First In, First Out
     */

    public static void main(String[] args)
    {
        Queue<Integer> linkedList = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++)
            linkedList.add(i);


        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.poll());
        }

//
//        // Display contents of the queue
//        System.out.println("Queue: " + q);
//
//        // To remove the head of queue
//        int removedElement = q.remove();
//        System.out.println("Removed element: " + removedElement);
//
//        System.out.println("Updated queue: " + q);
//
//        // To view/work with the head of queue
//        int head = q.peek();
//        System.out.println("Head of Queue: " + head);
//
//        int poll = q.poll();
//        System.out.println(poll);
//        System.out.println(q);
//
//        System.out.println("\n**************");
//        q.offer(5);
//        System.out.println(q);
//
//        // Rest all methods of collection interface like size and contains can be used with this implementation.
//        int size = q.size();
//        System.out.println("Size of queue: " + size);
//
//        System.out.println("\n***ITERATOR***");
//
//        // Using an iterator to iterate over a data structure
//        Iterator iterator = q.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
    }

}
