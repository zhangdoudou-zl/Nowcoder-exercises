import java.util.Stack;
//解题思路：
// 在栈内部保存min变量，每次更新的时候，都对min变量进行更新。
// 如果想拿出第二小，第三小的值用上面的办法就不行
// 为了满足通用，我们使用一个辅助栈，内部保存元素的个数和数据栈完全一样
// 辅助栈内部永远保存本次入栈的数为 所有数据的最小值（辅助栈内部元素可能会出现“必要性”重复）
public class Solution17 {
    private Stack<Integer> data_stack = new Stack<>();
    private Stack<Integer> min_stack = new Stack<>();
    public void push(int node) {
        data_stack.push(node);
        if(min_stack.empty() || node < min_stack.peek()){
            min_stack.push(node);
        } else{
        //!min_stack.empty() & node >=min_stack.peek()
        min_stack.push(min_stack.peek());
        }
    }
    public void pop() {
        data_stack.pop();
        min_stack.pop();
    }
    public int top() {
        return data_stack.peek();
    }public int min() {
        return min_stack.peek();
    }
}
