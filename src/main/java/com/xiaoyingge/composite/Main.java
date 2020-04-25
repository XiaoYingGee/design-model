package com.xiaoyingge.composite;

import java.util.ArrayList;

/**
 * 组合模式测试代码
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 11:58
 */
public class Main {

    public static void main (String[] args) {
        BranchNode root = new BranchNode("root");
        //组装第一层节点
        LeafNode leaf1 = new LeafNode("leaf1");
        BranchNode branch1 = new BranchNode("branch1");
        BranchNode branch2 = new BranchNode("branch2");
        root.setChildren(new ArrayList<AbstractTreeNode>() {{
            add(leaf1);
            add(branch1);
            add(branch2);
        }});
        //第二层
        LeafNode leaf11 = new LeafNode("leaf11");
        LeafNode leaf12 = new LeafNode("leaf12");
        LeafNode leaf13 = new LeafNode("leaf13");
        branch1.setChildren(new ArrayList<AbstractTreeNode>() {{
            add(leaf11);
            add(leaf12);
            add(leaf13);
        }});

        LeafNode leaf21 = new LeafNode("leaf21");
        LeafNode leaf22 = new LeafNode("leaf22");
        BranchNode branch23 = new BranchNode("branch23");
        branch2.setChildren(new ArrayList<AbstractTreeNode>() {{
            add(leaf21);
            add(leaf22);
            add(branch23);
        }});
        //第三层
        LeafNode leaf231 = new LeafNode("leaf232");
        branch23.setChildren(new ArrayList<AbstractTreeNode>() {{
            add(leaf231);
        }});

        print(root, 1);
    }

    private static void print (AbstractTreeNode root, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(" -- ");
        }
        root.print();
        if (root instanceof BranchNode) {
            BranchNode branchNode = (BranchNode) root;
            for (AbstractTreeNode child : branchNode.getChildren()) {
                print(child, depth + 1);
            }
        }
    }
}
