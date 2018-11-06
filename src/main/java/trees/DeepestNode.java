package trees;

import trees.common.Node;

public class  DeepestNode {
    private int deepestLevel;
    private Node deepestNode;

    private void getDeepestNode(Node root, int level){
        if(root == null){
            return;
        }

        getDeepestNode(root.getLeft(), ++level);
        if(level > deepestLevel){
            deepestLevel = level;
            deepestNode = root;
        }

        getDeepestNode(root.getRight(), level);
    }

    private void getDeepestNode(Node root, int level, boolean isLeft){
        if(root == null){
            return;
        }

        getDeepestNode(root.getLeft(), ++level, isLeft);
            if(level > deepestLevel && isLeft){
            deepestLevel = level;
            deepestNode = root;
        }

        getDeepestNode(root.getRight(), level, !isLeft);
    }

    public Node getDeepestNode(Node root){
        getDeepestNode(root, 0);
        return deepestNode;
    }

    public Node getDeepestLeftNode(Node root, boolean isLeft){
        getDeepestNode(root, 0, isLeft);
        return deepestNode;
    }
}
