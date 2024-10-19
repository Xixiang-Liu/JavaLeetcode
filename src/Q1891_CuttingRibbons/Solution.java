package Q1891_CuttingRibbons;

import java.util.Arrays;

class Solution {
    public int maxLength(int[] ribbons, int k) {
        int l = 1, r = Arrays.stream(ribbons).max().getAsInt() + 1;
        while (l < r) {
            int p = (l + r) / 2;
            if (canCut(ribbons, k, p))
                l = p + 1;
            else
                r = p;
        }
        return l - 1;
    }

    private boolean canCut(int[] ribbons, int k, int p) {
        int count = 0;
        for (int ribbon : ribbons)
            count += ribbon / p;
        return count >= k;
    }
}
