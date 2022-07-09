package toptalquestions;

import java.util.*;

public class ReducePollutionByHalf {

    public static void main(String args[]) {
//5, 19, 8, 1
        //3,0,5
        System.out.println(numberoffilters(Arrays.asList(5, 19, 8, 1)));

    }

    public static int numberoffilters(List<Integer> list) {
        int count = 0;
        double sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        double csum = 0.0;

        PriorityQueue<Double> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(double d: list) {
            pQueue.add((double) d);
        }

        while (csum < (sum/2)) {
            count++;
            double t = pQueue.peek();
            csum += ((double)pQueue.poll() / 2.0);
            pQueue.add(t/2.0);
        }

        return count;
    }

}
