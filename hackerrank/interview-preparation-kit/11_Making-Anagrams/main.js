// Complete the makeAnagram function below.
function makeAnagram(a, b) {
  const counter = new Map();

  for (const ch of [...a]) {
      const count = counter.get(ch) || 0;
      counter.set(ch, count + 1);
  }

  for (const ch of [...b]) {
      const count = counter.get(ch) || 0;
      counter.set(ch, count - 1);
  }

  let total = 0;
  for (const count of counter.values()) {
      total += Math.abs(count);
  }
  return total;
}
