package as;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class kthLargest
{
    // Function to find the K'th largest element in the
    // array using max-heap
    public static int FindKthLargest(List<Integer> ints, int k)
    {
        // create a max-heap using PriorityQueue class from all
        // elements in the list
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // or pass Comparator.reverseOrder()
        pq.addAll(ints);

        // pop from max-heap exactly (k-1) times
        while (--k > 0) {
            pq.poll();
        }

        // return the root of max-heap
        return pq.peek();
    }


    public static void main(String[] args)
    {
        List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 2;

        System.out.println("K'th largest element in the array is " +
                FindKthLargest(ints, k));
    }
}
