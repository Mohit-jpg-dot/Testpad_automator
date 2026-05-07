static void doubleQueue(Queue<Integer> q){
    int size = q.size();
    for(int i = 0; i < size; i++)
    {
        int val = q.remove();
        q.add(val);
        q.add(val);
    }
}