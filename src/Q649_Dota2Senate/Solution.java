package Q649_Dota2Senate;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        int rCnt = 0, dCnt = 0;
        int banRVote = 0, banDVote = 0;
        Queue<Character> availSenators = new LinkedList<>();
        for (char senator : senate.toCharArray()) {
            availSenators.add(senator);
            if (senator == 'R') rCnt++;
            else dCnt++;
        }
        while (rCnt > 0 && dCnt > 0) {
            char senator = availSenators.poll();
            if (senator == 'D') {
                if (banDVote > 0) {
                    banDVote--;
                    dCnt--;
                } else {
                    banRVote++;
                    availSenators.add('D');
                }
            } else {
                if (banRVote > 0) {
                    banRVote--;
                    rCnt--;
                } else {
                    banDVote++;
                    availSenators.add('R');
                }
            }
        }
        return rCnt > 0 ? "Radiant" : "Dire";
    }
}
