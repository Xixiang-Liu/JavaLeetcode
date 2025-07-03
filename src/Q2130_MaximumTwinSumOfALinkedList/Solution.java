package Q2130_MaximumTwinSumOfALinkedList;


import java.util.Map;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int pairSum(ListNode head) {
        ListNode curr = head;
        Stack<Integer> st = new Stack<>();
        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        int size = st.size(), cnt = 1;
        int maxSum = 0;
        while (cnt <= size / 2) {
            maxSum = Math.max(maxSum, curr.val + st.pop());
            curr = curr.next;
            cnt++;
        }
        return maxSum;
    }
}
