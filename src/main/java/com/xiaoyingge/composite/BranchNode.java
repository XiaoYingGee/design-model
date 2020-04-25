package com.xiaoyingge.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 11:54
 */
public class BranchNode extends AbstractTreeNode {

    public BranchNode (String name) {
        super(name);
    }

    private List<AbstractTreeNode> children = new ArrayList<>();

    public List<AbstractTreeNode> getChildren () {
        return children;
    }

    public void setChildren (List<AbstractTreeNode> children) {
        this.children = children;
    }
}
