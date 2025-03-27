package Q933_NumberOfRecentCalls;

import java.util.LinkedList;

class RecentCounter {
    LinkedList<Integer> recentCalls;

    public RecentCounter() {
        this.recentCalls = new LinkedList<>();
    }

    public int ping(int t) {
        this.recentCalls.addLast(t);
        while (this.recentCalls.getFirst() < t - 3000)
            this.recentCalls.removeFirst();
        return this.recentCalls.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
