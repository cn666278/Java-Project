/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37_bst;

/**
 *
 * @author cn
 */
public class JavaApplication37_BST  {

    class Node {
            int data;
            Node left;
            Node right;
    }
    public class BSTChecker {
        private int lastVisit = Integer.MIN_VALUE;

        /**
         *
         * @param root
         * @return
         */
        public boolean isBST(Node root) {
            
            if(root == null) return true;

            boolean judgeLeft = isBST(root.left); // 先判断左子树

            if(root.data >= lastVisit && judgeLeft) { // 当前节点比上次访问的数值要大
                    lastVisit = root.data;
            } else {
                    return false;
            }

            boolean judgeRight = isBST(root.right); // 后判断右子树

            return judgeRight;
            }
        }
}



