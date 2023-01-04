class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                currentWealth += accounts[i][j];
            }
            if (maxWealth < currentWealth)
                maxWealth = currentWealth;
        }
        return maxWealth;
    }
}