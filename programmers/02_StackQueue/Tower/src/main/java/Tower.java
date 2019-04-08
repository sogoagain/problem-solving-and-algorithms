public class Tower {
    public int[] getSignaledTowerIndex(int[] heights) {
        int[] signaledTowerIndex = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            int height = heights[i];

            for (int j = i; j >= 0; j--) {
                if (height < heights[j]) {
                    signaledTowerIndex[i] = j + 1;
                    break;
                }
            }
        }

        return signaledTowerIndex;
    }
}
