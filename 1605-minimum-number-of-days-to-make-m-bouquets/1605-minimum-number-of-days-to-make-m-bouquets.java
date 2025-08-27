class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers = (long) m * k; // avoid overflow
        if (bloomDay.length < totalFlowers) return -1; // impossible

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;
        for (int d : bloomDay) {
            if (d <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // reset if not bloomed
            }
        }
        return bouquets >= m;
    }
}