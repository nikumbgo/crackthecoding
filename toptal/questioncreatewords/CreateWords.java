package toptalquestions;

import java.util.HashMap;
import java.util.Map;

public class CreateWords {

    public static void main(String args[]) {
       // String a[] = {"I>N", "A>I", "P>A","S>P",};
        String a[]= {"U>N","G>A","R>Y","H>U","N>G","A>R"};
        System.out.println(findWord(a));
    }

    public static String findWord(String[] words) {
        Map<String, String> m1 = new HashMap<>();
        Map<String, String> m2 = new HashMap<>();

        String right = words[0].split(">")[0];
        String left = words[0].split(">")[1];
        String result = "";
        for (String ss : words) {
            String temp[] = ss.split(">");
            m1.put(temp[0], temp[1]);
            m2.put(temp[1], temp[0]);
        }
        while (m1.containsKey(right)) {
            result = result + m1.get(right);
            right = m1.get(right);
        }
        while (m2.containsKey(left)) {
            result = m2.get(left) + result;
            left = m2.get(left);
        }
        return result;
    }
}
