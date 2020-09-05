// Complete the whatFlavors function below.
function whatFlavors(cost, money) {
  const costToIndexes = new Map();

  for (let i = 0; i < cost.length; i++) {
      const indexes = costToIndexes.get(cost[i]) || [];
      costToIndexes.set(cost[i], [...indexes, i + 1]);
  }

  const icecreams = new Map();
  for (let i = 0; i < cost.length; i++) {
      const balance = money - cost[i];
      const indexes = costToIndexes.get(balance) || [];

      for (const index of indexes) {
          if (i + 1 === index) {
              continue;
          }

          if (!icecreams.get(index) && !icecreams.get(i + 1)) {
              icecreams.set(i + 1, index);
          }
      }
  }
  return icecreams;
}
