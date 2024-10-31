//remove-duplicates-from-sorted-array/description/
//1
class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0; 
        // int[] expectedNums = new int[nums.length];
       Set<Integer> ss = new HashSet<Integer>();
       for(int i=0;i<nums.length;i++){
        if(!ss.contains(nums[i])){
             ss.add(nums[i]);
             nums[count]=nums[i];
             count += 1;
        }
        else{

        }
        
       }
       return count;
        
    }
}