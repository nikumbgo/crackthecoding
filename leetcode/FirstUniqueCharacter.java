package leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * Output: 0
 */
public class FirstUniqueCharacter {

    public static void main(String args[]) {
        System.out.println(firstUniqChar("aabbcdef"));
    }

    public static int firstUniqChar(String s) {
        int[] a = new int[26];
        Arrays.fill(a, 0);
        Set<Character> order = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            a[index] += 1;

            order.add(s.charAt(i));
        }

        Iterator<Character> i = order.iterator();
        while (i.hasNext()) {
            char t = i.next();
            if (a[(t - 'a')] == 1)
                return s.indexOf(t);

        }


        return -1;
    }


  /*sOLUTION 2
    public static int firstUniqChar(String s) {

        Map<Character,Integer> ss = new HashMap();

        for(int i=0;i<s.length();i++)
        {
            ss.put(s.charAt(i), (ss.getOrDefault(s.charAt(i),0)+1));
        }
        for(int i=0;i<s.length();i++) {
            if(ss.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
	
	Solution 3
	public static int firstUniqChar(String s) {
	   Map<Character, Integer> ss = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            ss.put(s.charAt(i), (ss.getOrDefault(s.charAt(i), 0) + 1));
        }

        Iterator<Character> ii = ss.keySet().iterator();
        while (ii.hasNext()) {
            char t = ii.next();
            if (ss.get(t) == 1) {
                return s.indexOf(t);
            }
        }

        return -1;
	}
		*/
}
