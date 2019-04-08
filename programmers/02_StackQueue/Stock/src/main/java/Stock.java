public class Stock {
    public int[] getPriceFallsTime(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int declineIndex = 0;
            for (int j = i; j < prices.length; j++) {
                declineIndex = j;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = declineIndex - i;
        }
        return answer;
    }
}
