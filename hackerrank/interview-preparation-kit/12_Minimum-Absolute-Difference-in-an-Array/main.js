// Complete the minimumAbsoluteDifference function below.
function minimumAbsoluteDifference(arr) {
  const sortedNumbers = arr.sort(function(a, b) {
      return a - b;
  });

  let min = 0;
  for (let i = 0; i < sortedNumbers.length - 1; i++) {
      const difference = sortedNumbers[i + 1] - sortedNumbers[i];
      if (i === 0 || difference < min) {
          min = difference;
      }
  }
  return min;
}
