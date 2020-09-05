// Complete the roadsAndLibraries function below.
function roadsAndLibraries(n, c_lib, c_road, cities) {
  if (c_road > c_lib) {
      return n * c_lib;
  }

  const nodes = [];
  for (let i = 1; i <= n; i++) {
      nodes[i] = [];
  }

  for (const [city1, city2] of cities) {
      nodes[city1].push(city2);
      nodes[city2].push(city1);
  }

  const path = [];
  let cost = 0;

  for (let i = 1; i <= n; i++) {
      if(path[i]) {
          continue;
      }
      path[i] = true;
      cost += c_lib;

      const stack = [i]

      while (stack.length > 0) {
          const city = stack.pop();
          for (const adjacentCity of nodes[city]) {
              if (path[adjacentCity]) {
                  continue;
              }
              stack.push(adjacentCity);
              path[adjacentCity] = true;
              cost += c_road;
          }
      }   
  }

  return cost;
}
