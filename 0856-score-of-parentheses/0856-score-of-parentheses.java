class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(score);
                score = 0;
            } 
            else {
                int inside = score;
                score = stack.pop();
                if (inside == 0) {
                    score += 1;
                } else {
                    score += 2 * inside;
                }
            }
        }

        return score;
    }
}