package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1
 * 11
 * 121
 * 1331
 * 14641
 */
public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> i = generate(6);
        i.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(a ->
                System.out.println(a));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        ll.add(l);

        for (int i = 1; i < numRows ; i++) {
            l = new ArrayList<>();
            l.add(1);
            for (int k = 1; k < i ; k++) {
                List<Integer> temp = ll.get(i - 1);
                l.add(temp.get(k - 1) + temp.get(k));
            }
            l.add(1);
            ll.add(l);
        }
        return ll;
    }
}
