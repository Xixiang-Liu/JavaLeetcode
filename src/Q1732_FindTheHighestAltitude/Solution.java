package Q1732_FindTheHighestAltitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0, altitude = highestAltitude;
        for (int altitudeGain: gain) {
            altitude += altitudeGain;
            highestAltitude = Math.max(altitude, highestAltitude);
        }
        return highestAltitude;
    }
}
