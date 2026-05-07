static void flipHalfQueue(Queue<Integer> q) {
    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();
    int size = q.size();
    // element store in arraylist and stack
    for (int i = 0; i < size; i++) {
        int val = q.remove();
        if (i % 2 == 0) {
            list.add(val);
        }else{
            st.push(val);
        }
    }
    // rebuild queue
    int e = 0;
    for (int i = 0; i < size; i++) {
        if (i % 2 == 0) {
            q.add(list.get(e++));
        } else {
            q.add(st.pop());
        }
    }
}