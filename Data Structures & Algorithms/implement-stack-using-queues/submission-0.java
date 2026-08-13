class MyStack {
    Queue<Integer> q;
    int count = 0;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        count++;     
    }
    
    public int pop() {
        for(int i = 0; i < count - 1; i++){
            q.add(q.poll());
        }

        count--;
        return q.poll();       
    }
    
    public int top() {
        for(int i = 0; i < count - 1; i++){
            q.add(q.poll());
        }

        int top = q.poll();
        q.add(top);

        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */