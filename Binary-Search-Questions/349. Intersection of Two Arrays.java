//Using While Loop Two Pointer Approach
import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)]; // Temp array to store intersection
        int index = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Check if the current element is not already in the temp array
                if (index == 0 || temp[index - 1] != nums1[i]) {
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        // Copy the relevant portion of the temp array to the final result
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}

//Usinh HashSet Method
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use two hash sets to track elements from each array
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add all elements from nums1 to set1
        for(int num : nums1){
            set1.add(num);
        }
        // Check each element in nums2 to see if it was in nums1
        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num); // Add to result if it's an intersection
            }
        }
        // Convert the result set to an array
        int[] output = new int[result.size()];
        int i = 0;
        for(int x : result){
            output[i] = x;
            i++;
        }
        return output;
    }
}