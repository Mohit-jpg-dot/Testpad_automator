static void mirrorQueue(Queue<String> q){
    Stack<String> st= new Stack<>();
    for(int i=0;i<q.size();i++){
        String val = q.remove();
        q.add(val);
        st.push(val);
    }
    while(!st.isEmpty()){
        q.add(st.pop());
    }
}