package com.tree;

import java.util.*;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/28 20:34
 */
public class levelOrder {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){
        }
        TreeNode(int val){
            this.val =val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val =val;
            this.right =right;
            this.left = left;
        }



    }

    public static void main(String[] args) {



        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right =node3;
        node2.left = node4;
        node3.right =node5;

        List<List<Integer>> lists = leaverOrder(node1);

        System.out.println(lists);

    }


    public static  List<List<Integer>>  leaverOrder(TreeNode root){

        ArrayList<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            LinkedList<Integer> level = new LinkedList<>();
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }

            }
            list.add(level);
        }
        return list;
    }
}
