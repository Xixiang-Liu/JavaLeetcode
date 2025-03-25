package Q735_AsteroidCollision;

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int asteroid : asteroids) {
            boolean asteroidStay = true;
            while (!st.isEmpty() && (st.peek() > 0 && asteroid < 0)) {
                if (Math.abs(st.peek()) < Math.abs(asteroid)) {
                    st.pop();
                    continue;
                } else if (Math.abs(st.peek()) == Math.abs(asteroid)) {
                    st.pop();
                }
                asteroidStay = false;
                break;
            }
            if (asteroidStay) {
                st.push(asteroid);
            }
        }
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}