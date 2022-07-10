package leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 */
public class intersectionOfArrays {

    public static  void main  (String []args)
    {
        Arrays.stream(intersect(new int[]{1,2,2,3,4,5},new int[]{2,2,7,8,9})).forEach(
                a->
                {
                    System.out.println(a);
                }
        );
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList();
        Map<String,Integer> n1= new HashMap<>();
        //Map<String,In> n2= new HashMap<>();
         for(int i=0;i<nums1.length;i++)
         {
             if(n1.containsKey(nums1[i]+""))
             {
                 n1.put(nums1[i]+"",(n1.get(nums1[i]+"")+1));
             }
             else
                 n1.put(nums1[i]+"",1);
         }

         for(int j=0;j<nums2.length;j++)
         {
             if(n1.containsKey(nums2[j]+""))
             {
                 result.add(nums2[j]);
                 int count = n1.get(nums2[j]+"");
                 if(count == 1)
                     n1.remove(nums2[j]+"");
                 else
                     n1.put(nums2[j]+"",(count-1));
             }
         }

      return  result.stream().mapToInt(Integer::intValue).toArray();
    }


}
