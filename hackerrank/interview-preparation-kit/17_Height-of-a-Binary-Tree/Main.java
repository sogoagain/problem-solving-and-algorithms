class Main {
  /*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
        int left = 0;
        int right = 0;

        if (root.left != null) {
            left = 1 + height(root.left);
        }

        if (root.right != null) {
            right = 1 + height(root.right);
        }

        return Math.max(left, right);
  }
}

    