package stackandqueue.stockspanproblem;

public class StockSpanMain {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = StockSpan.calculateSpan(prices);

        System.out.print("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }

}
