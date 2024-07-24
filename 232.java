class MyQueue {
  private Stack<Integer> f1 = new Stack<Integer>();
  private Stack<Integer> f2 = new Stack<Integer>();
     public MyQueue() {
        
    }
    
    public void push(int x) {
        f1.push(x);
            }
    
    public int pop() {
        while(!f1.isEmpty()){
            f2.push(f1.pop());
        }
        int removed = f2.pop();
        while(!f2.isEmpty()){
            f1.push(f2.pop());
        }
        return removed;
        
    }
    
    public int peek() {
         while(!f1.isEmpty()){
            f2.push(f1.pop());
        }
        int removed = f2.peek();
        while(!f2.isEmpty()){
            f1.push(f2.pop());
        }
        return removed;
    }
    
    public boolean empty() {
        return f1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
