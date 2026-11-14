class MinStack {
    private Stack<Integer> prefixMins;

    private Stack<Integer> minStack;

    public MinStack() {
        minStack = new Stack<Integer>();
        prefixMins = new Stack<Integer>();
    }
    
    public void push(int val) {
        minStack.push(val);
        if (prefixMins.size() > 0) {
            prefixMins.push(Math.min(val, prefixMins.peek()));
        } else {
            prefixMins.push(val);
        }
        
    }
    
    public void pop() {
        minStack.pop();
        prefixMins.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return prefixMins.peek();
    }
}
