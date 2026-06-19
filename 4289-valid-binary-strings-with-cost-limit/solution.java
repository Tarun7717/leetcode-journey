class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();
        backtrack(0, n, k, 0, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(int pos, int n, int k, int cost,
                           StringBuilder sb, List<String> ans) {

        if (cost > k) return;

        if (pos == n) {
            ans.add(sb.toString());
            return;
        }

        
        sb.append('0');
        backtrack(pos + 1, n, k, cost, sb, ans);
        sb.deleteCharAt(sb.length() - 1);

        
        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '1') {
            sb.append('1');
            backtrack(pos + 1, n, k, cost + pos, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
