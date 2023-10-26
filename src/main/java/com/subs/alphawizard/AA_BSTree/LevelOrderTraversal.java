package com.subs.alphawizard.AA_BSTree;

import java.util.*;

public class LevelOrderTraversal {

    public static Map<Integer, List<Integer>> levelOrderTraversal(Node root) {
        Map<Integer, List<Integer>> result = new HashMap<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevelNodes.add(currentNode.data);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.put(level, currentLevelNodes);
            level++;
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Map<Integer, List<Integer>> result = levelOrderTraversal(root);

        // Print the result
        for (Map.Entry<Integer, List<Integer>> entry : result.entrySet()) {
            System.out.println("Level " + entry.getKey() + ": " + entry.getValue());
        }


    }
}
