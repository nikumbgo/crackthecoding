package leetcode;

import java.util.*;

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
        System.out.println(firstUniqChar("abcdeaghijk"));
    }

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
}
