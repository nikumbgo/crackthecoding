package leetcode;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeTwoArrays {
    public static void main(String []args)
    {
        int []n1 = new int[]{1,6,8,9};
        int n2[] = new int []{2,7,10};
        merge(n1,4,n2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i=0,j=0,k=0;

        while(k < (m+n))
        {
            if(i< m && j<n)
            {
                if(nums1[i]<=nums2[j])
                {
                    result[k++]= nums1[i++];
                }else {
                    result[k++] = nums2[j++];
                }

            }else if(i<m)
            {
                result[k++]= nums1[i++];
            }else if(j<n)
            {
                result[k++] = nums2[j++];
            }
        }

        nums1 =Arrays.copyOf(result,m+n);
        Arrays.stream(nums1).forEach(a->
                System.out.println(a));
    }
}
