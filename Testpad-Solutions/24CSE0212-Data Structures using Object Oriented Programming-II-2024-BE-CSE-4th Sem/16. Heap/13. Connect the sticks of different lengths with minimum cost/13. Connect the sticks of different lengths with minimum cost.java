class Result {
    static int connectCost(int lengths[], int n){
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(lengths[i]);
        }
        int totalCost = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            totalCost += sum;
            pq.add(sum);
        }
        return totalCost;
    }
}