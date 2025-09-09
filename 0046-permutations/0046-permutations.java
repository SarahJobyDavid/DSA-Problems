import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;        
    }
    private void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int n : nums){
            if(! curr.contains(n)){
                curr.add(n);
                backtrack(nums, curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }
}