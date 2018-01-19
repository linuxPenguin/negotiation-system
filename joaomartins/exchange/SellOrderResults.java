package exchange;

import exchange.SellOrder;
import exchange.Trade;

import java.util.List;

// TODO: Consider replacing SellOrder with protobuff Order and Trade with protobuff Trade.
//       This allows merging of SellOrderResults and BuyOrderResults into OrderResults and reduces allocations.
public class SellOrderResults {
    public final List<Trade> trades;
    public final SellOrder remainingSellOrder;

    /** 
     * Creates SellOrderResults for a sell order that was completely fulfilled, 
     * therefore producing a list of trades and no remaining sell order (remainingSellOrder = null).
     */
    public SellOrderResults(List<Trade> trades) { this(trades, null); }

    /** Creates SellOrderResults with the specified parameters. */
    public SellOrderResults(List<Trade> trades, SellOrder remainingSellOrder) {
        this.trades = trades;
        this.remainingSellOrder = remainingSellOrder;
    }
}