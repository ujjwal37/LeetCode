class MinStack {
      Stack<Integer> st = new Stack<>();
      int min = Integer.MAX_VALUE;
    
    public void push(int x) {
        if( x <= min){
            st.push(min);
            min =x;
        }
        st.push(x);
    }
    
    public void pop() {
        if(st.pop() == min){
            min = st.pop();
        }
    }
    
    public int top() {
      return  st.peek();
    }
    
    public int getMin() {
        return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */