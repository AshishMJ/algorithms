package trees;

import trees.common.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ashishm on 15/4/18.
 */
public class BST {
    private Node root;
    private Node successor;

    public Node getSuccessor() {
        return successor;
    }

    public Node getRoot() {
        return root;
    }

    public Node insertIterative(int key) {
        Node node = new Node(key);
        if (isEmpty()) {
            root = node;
            return node;
        }

        Node temp = root;
        while (true) {
            if (temp.getData() > key) {
                if (temp.getLeft() == null) {
                    temp.setLeft(node);
                    return node;
                } else {
                    temp = temp.getLeft();
                }
            } else {
                if (temp.getRight() == null) {
                    temp.setRight(node);
                    return node;
                } else {
                    temp = temp.getRight();
                }
            }
        }
    }

    public Node searchForKeyIterative(int key) {
        if (isNotEmpty()) {
            Node temp = root;
            while (temp != null) {
                if (temp.getData() == key) {
                    return temp;
                } else if (temp.getData() > key) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }

        System.out.println("Tree is Empty!");
        return null;
    }


    public void inOrderTraverseIterative() {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node curr = root;

        while (true) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            }

            if (stack.isEmpty()) {
                return;
            }

            final Node tos = stack.pop();
            System.out.println(tos);
            curr = tos.getRight();
        }
    }

    public void postOrderTraverseIterative() {

    }

    public void preOrderTraverseIterative() {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node curr = root;

        while (true) {
            while (curr != null) {
                System.out.println(curr);
                stack.push(curr);
                curr = curr.getLeft();
            }

            if (stack.isEmpty()) {
                return;
            }

            final Node tos = stack.pop();
            curr = tos.getRight();
        }
    }

    public void preOrderTraverseIterativeNew() {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            Node node = stack.pop();
            System.out.println(node);
            if (Objects.nonNull(node.getRight())) {
                stack.push(node.getRight());
            }
            if (Objects.nonNull(node.getLeft())) {
                stack.push(node.getLeft());
            }
        }
    }

    public void levelOrderTraverseIterative() {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final Node node = queue.poll();
            System.out.println(node);

            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public Node getMaxValueRecursive(Node root) {
        if (root == null || root.getRight() == null) {
            return root;
        }

        return getMaxValueRecursive(root.getRight());
    }

    public Node getMinValueRecursive(Node root) {
        if (root == null || root.getLeft() == null) {
            return root;
        }

        return getMinValueRecursive(root.getLeft());
    }

    /**
     * A program to check if a binary tree is BST or not
     */
    public boolean isBST(Node root, int MAX, int MIN) {
        if (root == null) {
            return true;
        }

        if (root.getData() > MAX || root.getData() < MIN) {
            return false;
        }

        return isBST(root.getLeft(), MAX - 1, MIN) || isBST(root.getRight(), MAX, MIN + 1);
    }

    /**
     * Convert binary tree to its Sum tree
     */
    public int convertToSumTree(Node root) {
        if (root == null) {
            return 0;
        } else if (root.getLeft() == null && root.getRight() == null) { //leaf node
            int old_data = root.getData();
            root.setData(0);
            return old_data;
        } else {
            int old_data = root.getData();
            root.setData(convertToSumTree(root.getLeft()) + convertToSumTree(root.getRight()));
            return old_data + root.getData();
        }
    }

    public Node getLCAOfTwoNodesRecursive(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        } else if (root.getData() > n1 && root.getData() > n2) {
            return getLCAOfTwoNodesRecursive(root.getLeft(), n1, n2);
        } else if (root.getData() < n1 && root.getData() < n2) {
            return getLCAOfTwoNodesRecursive(root.getRight(), n1, n2);
        } else {
            return root;
        }
    }

    public Node getInOrderSuccessorOfGivenNode(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (node.getData() == key) {
            Node rootOfRightSubTree = node.getRight();
            if (rootOfRightSubTree == null) {
                return this.successor;
            }

            while (rootOfRightSubTree.getLeft() != null) {
                rootOfRightSubTree = rootOfRightSubTree.getLeft();
            }

            return rootOfRightSubTree;

        } else if (node.getData() > key) {
            this.successor = node;
            return getInOrderSuccessorOfGivenNode(node.getLeft(), key);
        } else {
            return getInOrderSuccessorOfGivenNode(node.getRight(), key);
        }
    }

    //TODO
    public boolean checkIfMirror(Node root1, Node root2) {
        return false;
    }

    public Node findLCAOfBinaryTree(Node root, int N1, int N2) {
        if (root != null) {
            if (root.getData() == N1 || root.getData() == N2) {
                return root;
            } else {
                final Node node1 = findLCAOfBinaryTree(root.getLeft(), N1, N2);
                final Node node2 = findLCAOfBinaryTree(root.getRight(), N1, N2);

                if (node1 != null && node2 != null) {
                    return root;
                }

                if (node1 != null) {
                    return node1;
                } else if (node2 != null) {
                    return node2;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void convertToMirrorTree() {
        if (isNotEmpty()) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                Node left = node.getLeft();
                Node right = node.getRight();
                if (Objects.nonNull(left)) {
                    node.setRight(left);
                    queue.add(left);
                }
                if (Objects.nonNull(right)) {
                    node.setLeft(right);
                    queue.add(right);
                }
            }
        } else {
            System.out.println("Empty tree");
        }
    }

    public void levelOrderSpiralForm() {
        if (isNotEmpty()) {

            int levels = getTreeLevel(root);
            Queue<Node> queue = new LinkedList<>();
            Stack<Node> stack = new Stack<>();
            queue.add(root);

            for (int level = 0; level <= levels; level++) {
                while (!queue.isEmpty()) {
                    Node node = queue.remove();
                    System.out.println(node);
                    if (level % 2 == 0) {
                        if (Objects.nonNull(node.getRight())) {
                            stack.push(node.getRight());
                        }
                        if (Objects.nonNull(node.getLeft())) {
                            stack.push(node.getLeft());
                        }
                    } else {
                        if (Objects.nonNull(node.getLeft())) {
                            stack.push(node.getLeft());
                        }
                        if (Objects.nonNull(node.getRight())) {
                            stack.push(node.getRight());
                        }
                    }
                }
                while (!stack.isEmpty()) {
                    queue.add(stack.pop());
                }
            }
        }
    }

    public int getTreeLevel(Node node) {
        if (node != null) {
            return 1 + Math.max(getTreeLevel(node.getLeft()), getTreeLevel(node.getRight()));
        }
        return 0;
    }

    public void printRootToLeafPaths(Node node, int[] paths, int pathLen) {
        if (node != null) {
            paths[pathLen++] = node.getData();
            if (Objects.isNull(node.getLeft()) && Objects.isNull(node.getRight())) {
                for (int i = 0; i < pathLen; i++) {
                    System.out.print(paths[i] + " ");
                }
                System.out.println();
            } else {
                printRootToLeafPaths(node.getLeft(), paths, pathLen);
                printRootToLeafPaths(node.getRight(), paths, pathLen);
            }
        }
    }

    public void printNodesAtKDistance(Node node, int k) {
        if (node != null) {
            if (k == 0) {
                System.out.println(node.getData());
            }
            printNodesAtKDistance(node.getLeft(), k - 1);
            printNodesAtKDistance(node.getRight(), k - 1);
        }
    }

    public boolean areTreesIdentical(Node t1, Node t2) {
        if (Objects.nonNull(t1) && Objects.nonNull(t2)) {
            return t1.getData() == t2.getData() &&
                    areTreesIdentical(t1.getLeft(), t2.getLeft()) &&
                    areTreesIdentical(t1.getRight(), t2.getRight());
        } else {
            return Objects.isNull(t1) && Objects.isNull(t2);
        }
    }

    public boolean isSubTree(Node n1, Node n2) {
        if (n2 == null) {
            return true;
        }

        if (n1 == null) {
            return false;
        }

        boolean isSubTree = false;
        if (n1.getData() == n2.getData()) {
            isSubTree = areTreesIdentical(n1, n2);
        }
        return isSubTree || isSubTree(n1.getLeft(), n2) || isSubTree(n1.getRight(), n2);
    }

    public void reverseLevelOrder(){
        if(isNotEmpty()){
            Stack<Node> stack = new Stack<>();
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()){
                Node node = queue.remove();
                stack.push(node);
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
            }

            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
    }
}
