class Result {
    static int jobScheduling(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        if (n == 0) {
            return 0;
        }
        // Create an array of jobs with their deadline and profit
        Job[] jobs = new Job[n];
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadlines[i], profits[i]);
            if (deadlines[i] > maxDeadline) {
                maxDeadline = deadlines[i];
            }
        }
        // Sort jobs in descending order of their profits
        java.util.Arrays.sort(jobs, (a, b) -> Integer.compare(b.profit, a.profit));
        // Slot array to keep track of free time slots (1-indexed based on deadlines)
        int[] slot = new int[maxDeadline + 1];
        java.util.Arrays.fill(slot, -1);
        int totalProfit = 0;
        // Iterate through all jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job, starting from its deadline down to 1
            for (int j = java.lang.Math.min(maxDeadline, jobs[i].deadline); j >= 1; j--) {
                if (slot[j] == -1) {
                    slot[j] = i; // Mark slot as occupied
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }
        return totalProfit;
    }
    // Helper class to store job deadline and profit
    static class Job {
        int deadline, profit;
        Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }
}