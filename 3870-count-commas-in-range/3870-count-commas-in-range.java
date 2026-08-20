class Solution {
    public int countCommas(int n) {

        long count = 0;

        long limit = 1000;

        while (limit <= n) {
            count += n - limit + 1;
            limit *= 1000;
        }

        return (int) count;
    }
}