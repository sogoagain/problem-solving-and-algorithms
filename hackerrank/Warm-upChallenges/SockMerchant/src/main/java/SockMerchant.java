import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    int getPairOfSock(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        int pairOfSock = 0;

        for (int a :
                ar) {
            socks.put(a, 0);
        }

        for (int i = 0; i < n; i++) {
            socks.put(ar[i], socks.get(ar[i]) + 1);
            if (socks.get(ar[i]) == 2) {
                pairOfSock++;
                socks.put(ar[i], 0);
            }
        }

        return pairOfSock;
    }
}
