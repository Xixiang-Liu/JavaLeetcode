package Q2352_EqualRowAndColumnPairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int eqCnt = 0;
        Map<String, Integer> rowFreq = new HashMap<>();
        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            rowFreq.put(rowString, rowFreq.getOrDefault(rowString, 0) + 1);
        }
        for (int c = 0; c < n; c++) {
            int[] colArr = new int[n];
            for (int r = 0; r < n; r++) {
                colArr[r] = grid[r][c];
            }
            eqCnt += rowFreq.getOrDefault(Arrays.toString(colArr), 0);
        }
        return eqCnt;
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(solution.equalPairs(grid));
    }
}
