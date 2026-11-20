class Result {
    static int intervalScheduling(int[] start, int[] end) {
        int n = start.length;
        if (n == 0) {
            return 0;
        }
        // Create an array of intervals to keep start and end times paired
        Interval[] intervals = new Interval[n];
        for (int i = 0; i < n; i++) {
            intervals[i] = new Interval(start[i], end[i]);
        }
        // Sort intervals in ascending order of their finish times
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a.end, b.end));
        int count = 1;
        int lastEndTime = intervals[0].end;
        // Greedily pick intervals that start after or when the last picked interval ends
        for (int i = 1; i < n; i++) {
            if (intervals[i].start >= lastEndTime) {
                count++;
                lastEndTime = intervals[i].end;
            }
        }
        return count;
    }
    // Helper class to store interval start and end times
    static class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}