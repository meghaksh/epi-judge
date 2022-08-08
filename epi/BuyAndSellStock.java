package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.List;
public class BuyAndSellStock {
  @EpiTest(testDataFile = "buy_and_sell_stock.tsv")
  public static double computeMaxProfit(List<Double> prices) {
    // TODO - you fill in here.
	double minBuy = prices.get(0);
	double maxProfit = 0;
	for(int i=1;i<prices.size();i++) {
		maxProfit = Math.max(maxProfit, prices.get(i)-minBuy);
		if(prices.get(i)<minBuy) {
			minBuy = prices.get(i);
		}
	}
	
	return maxProfit;
	  
	  
	  
//	double globalMax = 0;
//	double maxForI = 0;
//	for(int i=0;i<prices.size();i++) {
//		maxForI = 0;
//		for(int j=i+1;j<prices.size();j++) {
//			if(prices.get(j)-prices.get(i)>maxForI) {
//				maxForI=prices.get(j)-prices.get(i);
//			}
//		}
//		if(maxForI>globalMax) {
//			globalMax = maxForI;
//		}
//	}
//    return globalMax;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "BuyAndSellStock.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
