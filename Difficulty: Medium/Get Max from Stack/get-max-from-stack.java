class SpecialStack {
    Stack<Integer> st;
    Stack<Integer> max;
    public SpecialStack() {
        // Define Stack
        st=new Stack<>();
        max=new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        if(st.isEmpty()){
            st.push(x);
            max.push(x);
            }
            else{
                max.push(Math.max(max.peek(),x));
                st.push(x);
            }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(!st.isEmpty()){
        st.pop();
        max.pop();
    }
    
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty()) return -1;
        return st.peek();
     }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMax() {
        // Finds maximum element of Stack
        if(max.isEmpty()) return -1;
        return max.peek();
    }
}