class MyQueue {
    Stack<Integer> f_Stack;
    Stack<Integer> b_Stack;

    public MyQueue() {
        f_Stack = new Stack<>();
        b_Stack= new Stack<>(); 
        
    }
    
    public void push(int x) {
        f_Stack.push(x);
    }
    
    public int pop() {
        if(b_Stack.isEmpty()){
            while(!f_Stack.isEmpty()){
                b_Stack.push(f_Stack.pop());
            }
        }
        return b_Stack.pop();
    }
    
    public int peek() {
        if (b_Stack.isEmpty()) {
            while (!f_Stack.isEmpty()) {
                b_Stack.push(f_Stack.pop());
            }
        }

        return b_Stack.peek();
    }
    
    public boolean empty() {
        return f_Stack.isEmpty() && b_Stack.isEmpty();
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