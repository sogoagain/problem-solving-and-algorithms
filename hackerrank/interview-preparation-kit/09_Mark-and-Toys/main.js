// Complete the maximumToys function below.
function maximumToys(prices, k) {
  let totalPrice = 0;

  prices.sort(function (a, b) {
      return a - b;
  });

  for (let i = 0; i < prices.length; i++) {
      totalPrice += prices[i];
      if (totalPrice > k) {
          return i;
      }
  }
}
