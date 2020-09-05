// Complete the maxSubsetSum function below.
function maxSubsetSum(arr) {
  if (arr.length == 0) {
      return 0;
  }
  arr[0] = Math.max(0, arr[0]);
  arr[1] = Math.max(arr[0], arr[1]);
  for (let i = 2; i < arr.length; i += 1) {
      arr[i] = Math.max(arr[i - 1], arr[i - 2] + arr[i]);
  }
  return arr[arr.length - 1];
}
