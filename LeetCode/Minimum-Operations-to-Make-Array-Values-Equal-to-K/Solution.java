class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length ;
        for(int i=0; i< n ; i++) {
            if(nums[i] < k) {
                return -1; 
            }
        }
        Set<Integer> set = new HashSet<>();
        set.add(k);
        for(int i=0; i< n; i++) {
            set.add(nums[i]);
        }
        return set.size() - 1; 

    }
}