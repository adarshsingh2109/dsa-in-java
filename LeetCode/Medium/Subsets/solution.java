class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // element le lo
        curr.add(nums[index]);
        solve(index + 1, nums, curr, ans);

        // element hata do
        curr.remove(curr.size() - 1);

        // element mat lo
        solve(index + 1, nums, curr, ans);
    }
}