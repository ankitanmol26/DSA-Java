class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(0 , candidates, target, current, result);
        return result;
    }
    public void solve(int index, int[] candidates, int remainingTarget,List<Integer> current, List<List<Integer>> result){
        //base case : vaild combination found
        if(remainingTarget == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        //base case : invalid path
        if(remainingTarget < 0 || index == candidates.length){
            return;
        }
        //choice 1 : pick the current candidate
        current.add(candidates[index]);
        //same index because we can reuse the number
        solve(index, candidates, remainingTarget - candidates[index], current, result);
        //backtracking : remove the picked number
        current.remove(current.size() - 1);
        //choice 2: skip the current candidate
        solve(index + 1, candidates, remainingTarget, current, result);
    }
}