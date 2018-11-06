package trees;

import trees.common.Node;

public class VerticalOrder {
    private int min;
    private int max;

    private void updateMaxMin(Node root, int level) {
        if (root != null) {
            if (level < this.min) {
                this.min = level;
            }

            if (level > this.max) {
                this.max = level;
            }

            updateMaxMin(root.getLeft(), level - 1);
            updateMaxMin(root.getRight(), level + 1);
        }
    }

    private void printNodesAtGivenLevel(Node root, int level, int i) {
        if (root == null) {
            return;
        }
        if (level == i) {
            System.out.println(root);
        }

        printNodesAtGivenLevel(root.getLeft(), level - 1, i);
        printNodesAtGivenLevel(root.getRight(), level + 1, i);
    }

    private void printNodesAtBottomLevel(Node root, int level, int i) {
        if (root == null) {
            return;
        }

        printNodesAtBottomLevel(root.getLeft(), level - 1, i);
        if (level == i) {
            System.out.println(root);
        }
        printNodesAtBottomLevel(root.getRight(), level + 1, i);
    }

    public void print(Node root, String choice) {
        updateMaxMin(root, 0);

        for (int i = min; i <= max; i++) {
            if("All".equalsIgnoreCase(choice)){
                printNodesAtGivenLevel(root, 0, i);
            }else if("Bottom".equalsIgnoreCase(choice)){
                printNodesAtBottomLevel(root, 0, i);
            }

            System.out.println("");
        }
    }
}
