package Stack;

import java.util.Stack;

public class stock_span_problem {
    // Stack stores pairs: [price, span]
    Stack<int[]> st;

    public void StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Pop all prices less than or equal to current price
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        // Push current price with its span
        st.push(new int[]{price, span});

        return span;
    }
}
