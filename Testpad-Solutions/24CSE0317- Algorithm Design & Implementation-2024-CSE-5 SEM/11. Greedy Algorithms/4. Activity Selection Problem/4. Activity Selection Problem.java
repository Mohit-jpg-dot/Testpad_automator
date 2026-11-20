class Result {
    // Print the starting time of selected activities in sorted order separated by space
    static void activitySelection(int[] start, int[] finish) {
        int n = start.length;
        if (n == 0) {
            return;
        }
        // Create an array of activities to keep start and finish times paired
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], finish[i]);
        }
        // Sort activities in ascending order of their finish times
        java.util.Arrays.sort(activities, (a, b) -> Integer.compare(a.finish, b.finish));
        StringBuilder sb = new StringBuilder();
        // Always pick the first activity
        sb.append(activities[0].start);
        int lastFinishTime = activities[0].finish;
        // Iterate through remaining activities
        for (int i = 1; i < n; i++) {
            // If the start time of this activity is greater than or equal to the finish time of the last picked activity
            if (activities[i].start >= lastFinishTime) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(activities[i].start);
                lastFinishTime = activities[i].finish;
            }
        }
        System.out.print(sb.toString());
    }
    // Helper class to store activity start and finish times
    static class Activity {
        int start, finish;
        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
}